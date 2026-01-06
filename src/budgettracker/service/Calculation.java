package budgettracker.service;

import budgettracker.domain.Expense;
import org.w3c.dom.Text;

import java.time.LocalDate;

public class Calculation extends Expense {

    public Calculation(LocalDate date, Expense.Category category, Text description, int amount) {
        super(date, category, description, amount);
    }

    public int totalDailyExpense(LocalDate date) {

        }
    }
}
