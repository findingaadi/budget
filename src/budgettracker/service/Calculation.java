package budgettracker.service;

import budgettracker.domain.Expense;

import java.time.LocalDate;
import java.util.ArrayList;


public class Calculation {
    ArrayList<Expense> CalculateTotal = new ArrayList<>();
    String desc = "tester1";
    double amt = 25.5;

    public void addExpense(){
        Expense Obj1 = new Expense(LocalDate.now(), Expense.Category.Groceries, desc, amt);
        CalculateTotal.add(Obj1);

        for (Expense expense : CalculateTotal) {
            System.out.println(expense);
        }

    }

}


