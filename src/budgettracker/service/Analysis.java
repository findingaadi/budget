package budgettracker.service;
import budgettracker.domain.Expense;

import java.io.InputStream;
import java.time.LocalDate;
import java.util.Scanner;

public class Analysis{
    Scanner input = new Scanner(System.in);
    Calculation es = new Calculation();

    public void dailyExpense(){
        System.out.print("Date? Format YYYY-MM-DD ");
        LocalDate date = LocalDate.parse(input.nextLine());
        double dayTotalAmount = 0;

        for(Expense e: es.kharcha){
            if (e.getDate().equals(date)) {
                dayTotalAmount += e.getAmount();
            }
        }
        System.out.println(dayTotalAmount);
    }
}
