package csku.spender;

public class AccountHistory {

    private  double money ;
    private String des ;
    private String type ;

    public AccountHistory(String type, String des, double money) {
        this.type = type;
        this.money = money;
        this.des = des;
    }
    public double getMoney() {
        return money;
    }

    public String getDes() {
        return des;
    }

    public String getType() {
        return type;
    }
}
