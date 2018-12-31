package controller;


import csku.spender.Account;
import csku.spender.AccountHistory;
import csku.spender.OverExpenseException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;


public class HistoryController {
    double carry ;
    @FXML
    private Button add ;
    @FXML
    private TextField type,des,money ;
    @FXML
    private TableView<AccountHistory> table;
    @FXML
    TableColumn typeCol ;
    @FXML
    TableColumn desCol ;
    @FXML
    TableColumn moneyCol ;
    @FXML
    Label balanceLabel ;
    @FXML
    Label incomeLabel ;
    @FXML
    Label spendLabel ;

    Account account = new Account();

    ObservableList<AccountHistory> list = FXCollections.observableArrayList();
    public void initialize() {

        typeCol.setCellValueFactory(new PropertyValueFactory<AccountHistory, String>("type"));
        desCol.setCellValueFactory(new PropertyValueFactory<AccountHistory, String>("des"));
        moneyCol.setCellValueFactory(new PropertyValueFactory<AccountHistory, String>("money"));
        table.setItems(list);
    }

    public void handleButtonAdd(ActionEvent e) throws OverExpenseException {
        this.carry = Double.valueOf(money.getText());
        if(type.getText().equals("+")){
            account.income(carry);
            incomeLabel.setText(String.valueOf(account.getIncomeAll()));
        }
        else if(type.getText().equals("-")){
            account.expenses(carry);
            spendLabel.setText(String.valueOf(account.getSpendAll()));
        }
        else {
        }
        list.add(new AccountHistory(type.getText(), des.getText() , carry));
        table.setItems(list);
        balanceLabel.setText(String.valueOf(account.getBalance()));
        type.setText("");
        des.setText("");
        money.setText("");
    }
}

