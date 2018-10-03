import csku.spender.Account;
import csku.spender.OverExpenseException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnitTestAccount {

    Account account;
    int init = 100;

    @BeforeEach
    void init(){
        account = new Account(init);
    }

    @Test
    void testIncome(){
        account.income(100, "earned from mom");
        assertEquals(200, account.getBalance());
    }

    @Test
    void testExpense() throws OverExpenseException {
        account.expenses(50, "buy pork");
        assertEquals(50, account.getBalance());
    }
}