package Behavioral.ChainOfResponsability;

class President implements Approver {
    @Override
    public void processExpense(Expense expense) {
        System.out.println("The president approves and expense of $" + expense.getAmount());
    }
}
