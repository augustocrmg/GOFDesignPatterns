package Behavioral.ChainOfResponsability;

public class ChainOfResponsabilityDemo {
    public static void main(String[] args) {
        Approver manager = new Manager();
        Approver director = new Director();
        Approver vicePresident = new VicePresident();
        Approver president = new President();

        manager.processExpense(new Expense(500));
        director.processExpense(new Expense(2500));
        vicePresident.processExpense(new Expense(8000));
        president.processExpense(new Expense(15000));
    }
}
