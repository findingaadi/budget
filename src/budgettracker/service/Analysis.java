package budgettracker.service;
import budgettracker.domain.Expense;

import java.io.InputStream;
import java.time.LocalDate;
import java.util.Scanner;

public class Analysis{
    Scanner input = new Scanner(System.in);
    Calculation es;

    public Calculation getEs(){
    } // wprk in progress


    public void dailyExpense(){
        System.out.print("Date? Format YYYY-MM-DD ");
        LocalDate date = LocalDate.parse(input.nextLine());
        double dayTotalAmount = 0;

        for(Expense e: es.kharcha){
            if (e.getDate().equals(date)) {
                System.out.println("in if statement");
                dayTotalAmount += e.getAmount();
            }
        }
        System.out.println(dayTotalAmount);
    }

    public void monthlyExpense(){
        double monthlyTotalAmount = 0.0;
        System.out.println("Please enter the year:");
        int year = input.nextInt();

        System.out.println("Please enter the month:");
        int month = input.nextInt();

        for (Expense monthly: es.kharcha){
            if(monthly.getDate().getMonthValue() == month && monthly.getDate().getYear() == year ){
                monthlyTotalAmount += monthly.getAmount();
            }
        }
        System.out.println(monthlyTotalAmount);
    }
}
