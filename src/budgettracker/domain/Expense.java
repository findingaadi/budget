package budgettracker.domain;

import org.w3c.dom.Text;

import java.util.Date;

public class Expense {

    private Date date;
    private String category;
    private Text description;
    private int amount;

    public Expense(Date date, String category, Text description, int amount){
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

    public String getCategory(){
        return category;
    }

    public void setCategory(String category){
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
