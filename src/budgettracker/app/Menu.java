package budgettracker.app;

import budgettracker.service.Analysis;
import budgettracker.service.Calculation;

import java.util.Scanner;

public class Menu {
    Calculation obj1 = new Calculation(); //this object is to intiate the calculations
    Analysis obj2 = new Analysis(obj1);//takes in the calculation object to do the analysis

    public void menu(Scanner scanner){
        System.out.println("Welcome!");
        System.out.println("Please Select from the menu below.");


        System.out.println("1. Add an expense.");
        System.out.println("2. Delete an expense.");
        System.out.println("3. View Expense Analysis.");

        int i = scanner.nextInt();
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
    public void subMenu(Scanner scanner){
        System.out.println("1. Get Daily Expense Report.");
        System.out.println("2. Get Monthly Expense Report.");

        int input = scanner.nextInt();
        switch(input){
            case 1->obj2.dailyExpense();
            case 2->obj2.monthlyExpense();
        }
    }

}
