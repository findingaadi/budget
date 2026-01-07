package budgettracker.service;

import budgettracker.domain.Expense;

import java.time.LocalDate;
import java.util.ArrayList;


public class Calculation {
    ArrayList<Expense> CalculateTotal = new ArrayList<>();
    static Expense total = new Expense(LocalDate.now(), Expense.Category.Groceries,"Tester",70);
    public static void tester(){
        System.out.println(total);
    }
    }

