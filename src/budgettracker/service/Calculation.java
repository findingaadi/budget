package budgettracker.service;

import budgettracker.domain.Expense;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;


public class Calculation {
    ArrayList<Expense> kharcha = new ArrayList<>();
    Scanner input = new Scanner(System.in);


    public void addExpense(){
        System.out.println("Description?: ");
        String desc = input.nextLine();

        System.out.println("Amount?: ");
        double amt = input.nextDouble();

        System.out.println("Please select the category:");
        System.out.println("1. Groceries");
        System.out.println("2. Nepal");
        System.out.println("3. Home Bills");
        System.out.println("4. Credit Card");
        System.out.println("5. Subscription");
        System.out.println("6. Eating Out");
        System.out.println("7. Shopping");
        System.out.println("8. Fuel");
        System.out.println("9. Miscellaneous");
        System.out.println("10. Savings");

        int i = input.nextInt();
        Expense.Category e;
        switch (i){
            case 1:
                e = Expense.Category.Groceries;
            break;

            case 2:
                e = Expense.Category.Nepal;
            break;

            case 3:
                e = Expense.Category.HomeBills;
            break;

            case 4:
                e = Expense.Category.CreditCard;
            break;

            case 5:
                e = Expense.Category.Subscription;
            break;

            case 6:
                e = Expense.Category.EatingOut;
            break;

            case 7:
                e = Expense.Category.Shopping;
            break;

            case 8:
                e = Expense.Category.Fuel;
            break;

            case 9:
                e = Expense.Category.Miscellaneous;
            break;

            case 10:
                e = Expense.Category.Savings;
            break;

        }




        //

        Expense Obj1 = new Expense(LocalDate.now(), Expense.Category.Groceries, desc, amt);
        kharcha.add(Obj1);
        for (Expense expense : kharcha) {
            System.out.println(expense);
        }
    }


}


