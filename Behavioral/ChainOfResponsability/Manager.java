package Behavioral.ChainOfResponsability;

public class Manager implements Approver{
    @Override
    public void processExpense(Expense expense){
        if (expense.getAmount() <= 1000){
            System.out.println("The manager approves an expense of $"+expense.getAmount());
        }
    }
}
