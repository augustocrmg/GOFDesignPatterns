package Behavioral.ChainOfResponsability;

class VicePresident implements Approver {
    @Override
    public void processExpense(Expense expense) {
        if (expense.getAmount() <= 10000) {
            System.out.println("The vice president approves and expense of $" + expense.getAmount());
        }
    }
}
