package budgettracker.app;
import budgettracker.domain.Expense;
import budgettracker.service.Analysis;
import budgettracker.service.Calculation;

public class Main {
    public static void main(String[] Args){

        System.out.println("Hello");

        Calculation obj1 = new Calculation(); //this object is to intiate the calculations
        Analysis obj2 = new Analysis(obj1); //takes in the calculation object to do the analysis
//        obj2.addExpense();
//        obj2.deleteExpense();
        obj1.addExpense();
        obj2.dailyExpense();
        obj2.monthlyExpense();

    }
}
