public class main {
    public static void main(String[] args) {
        Account tee = new Account();
        tee.income("mom give" , 500);
        tee.expenses("buy rice", 300);
        tee.getBalance();
        tee.income("oat give" , 900);
        tee.income("kit buy", 800);
        tee.expenses("buy water" , 20);
        tee.printAllIncome();
        tee.printAllExpenses();
        tee.getBalance();
    }
}
