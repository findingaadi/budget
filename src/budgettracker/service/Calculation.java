package budgettracker.service;

import budgettracker.domain.Expense;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;


public class Calculation {
    ArrayList<Expense> kharcha = new ArrayList<>();
    Scanner input = new Scanner(System.in);


    public void displayAllExpense() {
        int j = 0;
        for (Expense expense : kharcha) {
            System.out.println(++j+")"+expense);
        }
    }

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
        Expense.Category e = switch (i) {
            case 1 -> Expense.Category.Groceries;
            case 2 -> Expense.Category.Nepal;
            case 3 -> Expense.Category.HomeBills;
            case 4 -> Expense.Category.CreditCard;
            case 5 -> Expense.Category.Subscription;
            case 6 -> Expense.Category.EatingOut;
            case 7 -> Expense.Category.Shopping;
            case 8 -> Expense.Category.Fuel;
            case 9 -> Expense.Category.Miscellaneous;
            case 10 -> Expense.Category.Savings;
            default -> null;
        };

        Expense Obj1 = new Expense(LocalDate.now(), e, desc, amt);
        kharcha.add(Obj1);
        displayAllExpense();
        }
}



