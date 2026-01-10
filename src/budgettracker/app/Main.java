package budgettracker.app;
import budgettracker.domain.Expense;
import budgettracker.service.Calculation;

public class Main {
    public void main(String[] Args){

        System.out.println("Hello");
        Calculation obj2 = new Calculation();
        obj2.addExpense();
        obj2.deleteExpense();
    }
}
