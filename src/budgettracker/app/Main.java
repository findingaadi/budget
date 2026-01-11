package budgettracker.app;
import budgettracker.domain.Expense;
import budgettracker.service.Analysis;
import budgettracker.service.Calculation;

public class Main {
    public static void main(String[] Args){

        System.out.println("Hello");
        Analysis obj2 = new Analysis();
//        obj2.addExpense();
//        obj2.deleteExpense();
        obj2.dailyExpense();

    }
}
