package pattern.nullobject.dynnull;

import java.lang.reflect.Proxy;

interface Log {
    void info(String msg);

    void warn(String msg);
}

class ConsoleLog implements Log {

    @Override
    public void info(String msg) {
        System.out.println(msg);
    }

    @Override
    public void warn(String msg) {
        System.out.println("WARNING: " + msg);
    }
}

class BankAccount {
    private Log log;
    private int balance;

    public BankAccount(Log log) {
        this.log = log;
    }

    public void deposit(int amount) {
        balance += amount;


        log.info("Deposited " + amount
                + ", balance is now " + balance);

    }

    public void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew " + amount
                    + ", we have " + balance + " left");
        } else {
            System.out.println("Could not withdraw "
                    + amount + " because balance is only " + balance);

        }
    }
}

final class NullLog implements Log {

    @Override
    public void info(String msg) {

    }

    @Override
    public void warn(String msg) {

    }
}

public class SolutionDynNull {

    @SuppressWarnings("unchecked")
    public static <T> T noOp(Class<T> itf) {
        return (T) Proxy.newProxyInstance(itf.getClassLoader(), new Class<?>[]{itf}, (proxy, method, args) -> {
            if (method.getReturnType().equals(Void.TYPE))
                return null;
            else
                return method.getReturnType().getConstructor().newInstance();

        });
    }

    public static void main(String[] args) {
        //ConsoleLog log = new ConsoleLog(); //normal
        //  NullLog log = new NullLog(); //want null instead
        //Log log = null; //dont

        Log log = noOp(Log.class);

        BankAccount ba = new BankAccount(log);
        ba.deposit(100);
        ba.withdraw(200);
    }
}
