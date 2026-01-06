package budgettracker.domain;

import org.w3c.dom.Text;

import java.time.LocalDate;


public class Expense {

    private LocalDate date;
    protected enum Category{
      Groceries, Nepal, HomeBills, CreditCard, Gym, Subscription, EatingOut, Shopping, Fuel, Miscellaneous, Savings;
    }
    private Category category;
    private Text description;
    private int amount;

    public Expense(LocalDate date, Category category, Text description, int amount){
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

    public Text getDescription(){
        return description;
    }

    public void setDescription(Text description){
        this.description = description;
    }

    public int getAmount(){
        return amount;
    }

    public void setAmount(int amount){
        this.amount = amount;
    }

}
