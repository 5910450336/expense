package csku.spender;

public class HistoryAccount {
    double money;
    String description ;
    String type ;
    public HistoryAccount(double money, String description , String type) {
        this.money = money;
        this.description = description;
        this.type = type ;
    }

    public double getMoney() {
        return money;
    }

    public String getDescription() {
        return description;
    }

    public String getType() {
        return type;
    }
}
