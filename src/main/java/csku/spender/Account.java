package csku.spender;

public class Account {
    private double balance = 0 ;
    private double incomeAll = 0 ;
    private double spendAll = 0 ;

    public Account (){
    }
    public void income( double income){
        balance = balance + income ;
        incomeAll = incomeAll + income ;
    }
    public void expenses(double expenses) throws OverExpenseException {
        if(expenses > balance) {
            throw new OverExpenseException("be careful! your expense more than your balance\n");
        }
        else {
            balance = balance - expenses ;
            spendAll = spendAll - expenses ;
        }
    }
    public double getBalance() {
        return balance;
    }

    public double getIncomeAll() {
        return incomeAll;
    }

    public double getSpendAll() {
        return Math.abs(spendAll);
    }
}
