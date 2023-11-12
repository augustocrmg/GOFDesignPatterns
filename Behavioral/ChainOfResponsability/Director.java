package Behavioral.ChainOfResponsability;

public class Director implements Approver{
    @Override
    public void processExpense(Expense expense){
        System.out.println("The director approves and expense of $"+expense.getAmount());
    }
}
