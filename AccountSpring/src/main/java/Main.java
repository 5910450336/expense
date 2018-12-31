import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("config.xml");

        AccountDao accountDao = context.getBean("accountDaoImp", AccountDao.class);

        accountDao.insertAccount(new Account(6, "Meya"));

        Account act = accountDao.getOneAccount(4);
        System.out.println("---getOne: "+act);

        List<Account> accountList = accountDao.getAllAccounts();
        for (Account account : accountList) {
            System.out.println(account);
        }

    }
}
