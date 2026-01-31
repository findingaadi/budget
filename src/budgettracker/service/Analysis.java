package budgettracker.service;
import budgettracker.domain.Expense;

import java.io.InputStream;
import java.time.LocalDate;
import java.util.Scanner;

public class Analysis{
    Scanner input = new Scanner(System.in);
    Calculation es;
    //if new object is created it will create new memory address, and cant access the calculated arraylist

    //this is the constructor to receive the class as an object to access its attibutes and methods
    public Analysis(Calculation es){
        this.es = es;
    }

    public void dailyExpense(){
        System.out.print("Date? Format YYYY-MM-DD ");
        LocalDate date = LocalDate.parse(input.nextLine());
        double dayTotalAmount = 0;

        for(Expense e: es.getKharcha()){
            if (e.getDate().equals(date)) {
                dayTotalAmount += e.getAmount();
            }
        }
        System.out.println(dayTotalAmount);
    }

//    public void dailyCategoryExpense(){
//
//    }

    public void monthlyExpense(){
        double monthlyTotalAmount = 0.0;
        System.out.println("Please enter the year:");
        int year = input.nextInt();

        System.out.println("Please enter the month:");
        int month = input.nextInt();

        for (Expense monthly: es.getKharcha()){
            if(monthly.getDate().getMonthValue() == month && monthly.getDate().getYear() == year ){
                monthlyTotalAmount += monthly.getAmount();
            }
        }
        System.out.println(monthlyTotalAmount);
    }

    public Expense.Category selectCategory() {
        System.out.println("Please select the category.");
        int k = 0;
        Expense.Category e = null;
        while (k < 1 || k > 10) {
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

            k = Integer.parseInt(input.nextLine());

            e = switch (k) {
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
                default -> throw new IllegalStateException("Invalid category");

            };

        }
        return e;
    }

    public void categoryExpense(){
        Expense.Category a = selectCategory();
        for(Expense category_expense: es.getKharcha()){
            if(category_expense.getCategory() == a){
                System.out.print(category_expense);
            }
        }
    }
}
