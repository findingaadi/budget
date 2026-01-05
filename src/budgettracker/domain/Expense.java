package budgettracker.domain;

import org.w3c.dom.Text;

import java.util.Date;

public class Expense {

    private Date date;
    private enum columns{
      Groceries, Nepal, HomeBills, CreditCard, Gym, Subscription, EatingOut, Shopping, Fuel, Miscellaneous, Savings;
    }
    private columns category;
    private Text description;
    private int amount;

    public Expense(Date date, columns category, Text description, int amount){
        this.date = date;
        this.category = category;
        this.description = description;
        this.amount = amount;
    }

    public Date getDate(){
        return date;
    }
    public void setDate(Date date){
        this.date = date;
    }

    public columns getCategory(){
        return category;
    }

    public void setCategory(columns category){
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

    public String getAllExpenses(){
        return "Date: "+date +"Category: "+category+"Amount: "+amount+"Description: "+description;
    }
}
