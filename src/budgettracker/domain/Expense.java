package budgettracker.domain;

import java.io.Serializable;
import java.time.LocalDate;


public class Expense implements Serializable {

    private LocalDate date;


    public enum Category{
      Groceries, Nepal, HomeBills, CreditCard, Gym, Subscription, EatingOut, Shopping, Fuel, Miscellaneous, Savings
    }
    private Category category;
    private String description;
    private double amount;

    public Expense(LocalDate date, Category category, String description, double amount){
        this.date = date;
        this.category = category;
        this.description = description;
        this.amount = amount;
    }

    public LocalDate getDate(){
        return date;
    }
    public void setDate(LocalDate date){
        this.date = date;
    }

    public Category getCategory(){
        return category;
    }

    public void setCategory(Category category){
        this.category = category;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public double getAmount(){
        return amount;
    }

    public void setAmount(double amount){
        this.amount = amount;
    }

    //to override the default toString() method when print statement is used
    public String toString(){
        return "Amount: "+amount+" | "+"Date: "+date+" | "+"Category: "+category+" | "+"Description: "+description;
    }

}
