package budgettracker.app;
import budgettracker.domain.Expense;
import budgettracker.service.Analysis;
import budgettracker.service.Calculation;

import java.util.Scanner;

public class Main {
    public static void main(String[] Args){
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        menu.menu(scanner);
    }
}
