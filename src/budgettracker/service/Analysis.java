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
}
