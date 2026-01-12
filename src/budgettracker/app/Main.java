package budgettracker.app;
import budgettracker.domain.Expense;
import budgettracker.service.Analysis;
import budgettracker.service.Calculation;

public class Main {
    public static void main(String[] Args){

        System.out.println("Hello");

        Calculation obj1 = new Calculation();
        Analysis obj2 = new Analysis();
//        obj2.addExpense();
//        obj2.deleteExpense();
        obj1.addExpense();
        obj2.dailyExpense();
        obj2.monthlyExpense();

    }
}
