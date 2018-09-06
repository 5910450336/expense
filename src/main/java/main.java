import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int init = 0 ;
        Account account = new Account(init);
        Scanner in = new Scanner(System.in);
        while (true) {
                System.out.println("Balance = " + account.getBalance());
                System.out.print("A=Income, B=Expense, C=History, D=Exit: ");
                String command = in.next();
                if (command.equalsIgnoreCase("A")) {
                    System.out.print("Income: ");
                    double amount = in.nextDouble();
                    System.out.print("Description: ");
                    in.useDelimiter("\n");
                    String description = in.next();
                    account.income(amount, description);
                }
                else if (command.equalsIgnoreCase("B")) {
                    System.out.print("Expense: ");
                    double amount = in.nextDouble();
                    System.out.print("Description: ");
                    in.useDelimiter("\n");
                    String description = in.next();
                    try {
                        account.expenses(amount, description);
                    } catch (OverExpenseException e) {
                        System.out.print(e.getMessage());
                    }
                }
                else if (command.equalsIgnoreCase("C")) {
                    while (true) {
                        System.out.print("A=AllHistory, E=ExpensesHistory, I=IncomeHistory, B=Back: ");
                        String commandHistory = in.next();
                        if (commandHistory.equalsIgnoreCase("A")) {
                            System.out.println(account.getAllHistory());
                            break ;
                        } else if (commandHistory.equalsIgnoreCase("E")) {
                            System.out.println(account.getExpensesHistory());
                            break ;
                        } else if (commandHistory.equalsIgnoreCase("I")) {
                            System.out.println(account.getIncomeHistory());
                            break ;
                        } else if (commandHistory.equalsIgnoreCase("B")) {
                            break ;
                        } else {
                            System.out.println("Illegal input!");
                        }
                    }

                }
                else if (command.equalsIgnoreCase("D"))
                    System.exit(0);
                else
                    System.out.println("Illegal input!");
            }
        }
    }
