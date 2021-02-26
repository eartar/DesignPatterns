package pattern.interpretor;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

interface Element{
    int eval();
}

@AllArgsConstructor
class Integer implements Element{

    private int value;

    @Override
    public int eval() {
        return value;
    }
}

class Operation implements Element{

    public enum Type{
        ADDITION,
        SUBSTRACTION
    }
    public Type type;
    public Element left, right;

    @Override
    public int eval() {
        switch (type){
            case ADDITION:
                return left.eval() + right.eval();
            case SUBSTRACTION:
                return left.eval() - right.eval();
            default:
                return 0;
        }
    }
}

@AllArgsConstructor
class Token{
    public enum Type{
        INT,
        PLUS,
        MINUS,
        LPRN,
        RPRN
    }

    public Type type;
    public String text;

    @Override
    public String toString() {
        return "`" + text + "`";
    }
}

public class SolutionInterpreter {

    static List<Token> lex(String input){
        final ArrayList<Token> tokens = new ArrayList<>();
        for (int i = 0; i<input.length(); i++){
            switch (input.charAt(i)){
                case '+':
                    tokens.add(new Token(Token.Type.PLUS, "+"));
                    break;
                case '-':
                    tokens.add(new Token(Token.Type.MINUS, "-"));
                    break;
                case '(':
                    tokens.add(new Token(Token.Type.LPRN, "("));
                    break;
                case ')':
                    tokens.add(new Token(Token.Type.RPRN, ")"));
                    break;
                default:
                    StringBuilder sb = new StringBuilder("" + input.charAt(i));
                    for (int j = i+1; j<input.length();j++){
                        if(Character.isDigit(input.charAt(j)))
                        {
                            sb.append(input.charAt(j));
                            i++;
                        }else{
                            tokens.add(new Token(Token.Type.INT, sb.toString()));
                            break;
                        }
                    }
                    break;
            }
        }

        return tokens;
    }

    static Element parse(List<Token> tokens){
        Operation res = new Operation();
        boolean haveLHS = false;
        for (int i = 0; i<tokens.size(); i++){
            Token token = tokens.get(i);
            switch (token.type){

                case INT -> {
                    Integer integer = new Integer(java.lang.Integer.parseInt(token.text));
                    if (!haveLHS){
                        res.left = integer;
                        haveLHS = true;
                    }else{
                        res.right = integer;
                    }
                }
                case PLUS -> res.type = Operation.Type.ADDITION;
                case MINUS -> res.type = Operation.Type.SUBSTRACTION;
                case LPRN -> {
                    int j =i;
                    for (;j<tokens.size();j++)
                        if (tokens.get(j).type == Token.Type.RPRN)
                            break;
                    final List<Token> subExpr = tokens.stream().skip(i + 1).limit(j - i - 1).collect(Collectors.toList());
                    Element element = parse(subExpr);
                    if (!haveLHS){
                        res.left = element;
                        haveLHS = true;
                    }else res.right = element;
                    i=j;
                    break;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String input = "(13+4)-(12+1)";
        List<Token> tokens = lex(input);
        System.out.println(tokens.stream().map(t->t.toString()).collect(Collectors.joining("\t")));

        Element parsed = parse(tokens);
        System.out.println(input  + " = "+parsed.eval());
    }
}
