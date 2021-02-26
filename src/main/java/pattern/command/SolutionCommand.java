package pattern.command;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class BankAccount {
    private int balance;

    public void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited " + amount + ", new balance: " + balance);
    }

    public boolean withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Deposited " + amount + ", new balance: " + balance);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                '}';
    }
}

interface Command {
    void call();
    void undo();
}


class BankAccountCommand implements Command {
    private boolean isSuccessful;
    private BankAccount bankAccount;

    public enum Action {
        DEPOSIT,
        WITHDRAW
    }

    private Action action;
    private int amount;

    public BankAccountCommand(BankAccount bankAccount, Action action, int amount) {
        this.bankAccount = bankAccount;
        this.action = action;
        this.amount = amount;
    }

    @Override
    public void call() {
        if (action == Action.DEPOSIT) {
            isSuccessful = true;
            bankAccount.deposit(amount);
        }
        else if (action == Action.WITHDRAW)
            isSuccessful = bankAccount.withdraw(amount);
    }

    @Override
    public void undo() {
        if(!isSuccessful) return;
        if (action == Action.DEPOSIT)
            bankAccount.withdraw(amount);
        else if (action == Action.WITHDRAW) {
            bankAccount.deposit(amount);
        }
    }
}

public class SolutionCommand {
    public static void main(String[] args) {
        final BankAccount acc = new BankAccount();
        System.out.println(acc);

        List<BankAccountCommand> commands = new ArrayList<>(List.of(
                new BankAccountCommand(acc, BankAccountCommand.Action.DEPOSIT, 100),
                new BankAccountCommand(acc, BankAccountCommand.Action.WITHDRAW, 1000)
        ));

        for (Command c : commands){
            c.call();
            System.out.println(acc);
        }

        Collections.reverse(commands);
        for (Command c : commands){
            c.undo();
            System.out.println(acc);
        }
    }
}
