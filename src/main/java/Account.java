import java.util.ArrayList;
import java.util.List;

public class Account {
    private double balance ;
    List<String> incomeForm = new ArrayList<String>();
    List<String> expensesForm = new ArrayList<String>();

    public Account() {
        this.balance = 0 ;

    }
    public void income(String doing, double income){
        balance = balance + income ;
        incomeForm.add(doing+ " " + income);

    }
    public void expenses(String doing , double expenses){
        balance = balance - expenses ;
        expensesForm.add(doing+ " " + expenses);
    }
    public void getBalance() {
        System.out.println(balance);
    }
    public void printAllIncome(){
            System.out.println(incomeForm);
    }
    public void printAllExpenses(){
        System.out.println(expensesForm);
    }
}
