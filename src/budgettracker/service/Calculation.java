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

        Expense Obj1 = new Expense(LocalDate.now(), Expense.Category.Groceries, desc, amt);
        kharcha.add(Obj1);
        for (Expense expense : kharcha) {
            System.out.println(expense);
        }
    }


}


