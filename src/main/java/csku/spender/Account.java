package csku.spender;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;

public class Account {

    private double balance ;
    private  double money ;
    private String des ;
    private String type ;

    public Account(String type, String des,double money) {
        System.out.println(type);
        System.out.println(des);
        System.out.println(money);
        this.type = type;
        this.money = money;
        this.des = des;
    }

    ArrayList<HistoryAccount> historiesAll = new ArrayList<HistoryAccount>();
    ArrayList<HistoryAccount> historiesIncome = new ArrayList<HistoryAccount>();
    ArrayList<HistoryAccount> historiesExpenses = new ArrayList<HistoryAccount>();

    public Account(int balance) {
        this.balance = balance ;

    }
    public void income( double income, String doing){
        balance = balance + income ;
        historiesAll.add(new HistoryAccount(income, doing, "+"));
        historiesIncome.add(new HistoryAccount(income, doing, "+"));

    }
    public void expenses(double expenses , String doing ) throws OverExpenseException {
        if(expenses > balance) {
            throw new OverExpenseException("be careful! your expense more than your balance\n");
        }
        balance = balance - expenses ;
        historiesAll.add(new HistoryAccount(expenses, doing , "-"));
        historiesExpenses.add(new HistoryAccount(expenses, doing, "-"));
    }

    public void edit(int position , String des , double money){
        historiesAll.get(position).money = money ;
        historiesAll.get(position).description = des ;
    }

    public double getBalance() {
        return balance;
    }
    public String getAllHistory(){
        String temp = "";
        for(int i = 0; i < historiesAll.size(); i++){
            temp += i+1  + " - " + historiesAll.get(i).type + "" + historiesAll.get(i).money + " : " + historiesAll.get(i).description + "\n";
        }
        return temp;
    }
    public String getIncomeHistory(){
        String temp = "";
        for(int i = 0; i < historiesIncome.size(); i++){
            temp += "+" + historiesIncome.get(i).money + " : " + historiesIncome.get(i).description + "\n";
        }
        return temp;
    }
    public String getExpensesHistory(){
        String temp = "";
        for(int i = 0; i < historiesExpenses.size(); i++){
            temp += "-" + historiesExpenses.get(i).money + " : " + historiesExpenses.get(i).description + "\n";
        }
        return temp;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
