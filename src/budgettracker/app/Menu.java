package budgettracker.app;

import budgettracker.service.Analysis;
import budgettracker.service.Calculation;

import java.util.Scanner;

public class Menu {
    public void menu(){
        Calculation obj1 = new Calculation(); //this object is to intiate the calculations
        Analysis obj2 = new Analysis(obj1);//takes in the calculation object to do the analysis

        System.out.println("Welcome!");
        System.out.println("Please Select from the menu below.");
        Scanner input = new Scanner(System.in);

        System.out.println("1. Add an expense.");
        System.out.println("2. Delete an expense.");
        System.out.println("3. View Expense Analysis.");

        int i = input.nextInt();
        switch (i){
            case 1->obj1.addExpense();
            case 2->obj1.deleteExpense();
        }
//        obj2.addExpense();
//        obj2.deleteExpense();
//        obj1.addExpense();
//        obj2.dailyExpense();
//        obj2.monthlyExpense();
    }

}
