package budgettracker.service;

import budgettracker.domain.Expense;

import javax.swing.text.DateFormatter;
import java.io.*;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;


public class Calculation implements Serializable {

    ArrayList<Expense> kharcha = new ArrayList<Expense>();
    Scanner input = new Scanner(System.in);

    public ArrayList<Expense> getKharcha(){
        return kharcha;
    }

    public Calculation(){
       this.kharcha = loadExpense();

    }

    public ArrayList<Expense> loadExpense(){
        ArrayList<Expense> data_in = null;
        try{
            FileInputStream in = new FileInputStream("kharcha.dat");
            ObjectInputStream o_in = new ObjectInputStream(in);

            data_in = (ArrayList<Expense>) o_in.readObject();
        }catch (Exception e){
            e.printStackTrace();
        }
        return data_in;
    }
    public void displayAllExpense() {
        //edited to monthly expenses
        int j = 0;
        double total = 0;
        for (Expense expense : kharcha) {
            if (expense.getDate().getMonthValue() == LocalDate.now().getMonthValue() && expense.getDate().getYear() == LocalDate.now().getYear()){
                System.out.println(++j+")"+expense);
                total += expense.getAmount();
                System.out.println("Total expense for the month: "+total);
            }
        }
    }

    public void addOneExpense(){

        DateTimeFormatter formater = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        try {
            System.out.println("Description?: ");
            String desc = input.nextLine();

            System.out.println("Amount?: ");
            double amt = Double.parseDouble(input.nextLine());


            System.out.println("Is the transaction from today? Y for yes.");
            String input_today = input.nextLine();
            LocalDate date = null;
            if (input_today.equalsIgnoreCase("Y")){
                date = LocalDate.now();
            }else{
                System.out.println("Please enter the date. (yyyy-MM-dd)");
                String input_date = input.nextLine();
                date = LocalDate.parse(input_date,formater); //nextline wont work, as it only seeks the date
            }



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

            String input_category = input.nextLine();
            int i = Integer.parseInt(input_category);
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

            Expense Obj1 = new Expense(date, e, desc, amt);
            kharcha.add(Obj1);
            saveExpense(kharcha);

        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Something went wrong.");
        }
        }

        public void addExpense(){
            while(true){
                addOneExpense();
                displayAllExpense();
                System.out.println("Do you want to add another transaction? Enter Y for yes!");
                String ans = input.nextLine();

                if (!ans.equalsIgnoreCase("Y")){
                    break;
                }
            }
        }
    public void deleteExpense(){
        System.out.println("Which expense would you like to delete? ");
        displayAllExpense();
        int l =0;
        try{
            l = Integer.parseInt(input.nextLine());
            kharcha.remove(l-1);
        } catch (Exception e) {
            System.out.println("Something went wrong!");
        }
        displayAllExpense();
    }

    public void saveExpense(ArrayList<Expense> kharcha){
        try{
            FileOutputStream out = new FileOutputStream("kharcha.dat");
            ObjectOutputStream o_out = new ObjectOutputStream(out);

            o_out.writeObject(kharcha);
        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
            System.out.println("file not found");
        } catch (IOException e) {
            System.out.println("file not found");
            e.printStackTrace();
        }
    }

}



