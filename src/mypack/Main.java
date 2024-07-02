package mypack;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();

        while (true) {
            System.out.println("\nBanking System Menu :");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.println("Select an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            try {
                switch (choice) {
                    case 1:
                        System.out.println("Enter account number: ");
                        String accountNumber = scanner.nextLine();
                        System.out.println("Enter account holder name: ");
                        String accountHolderName = scanner.nextLine();
                        System.out.println("Enter initial balance: ");
                        double initialBalance = scanner.nextDouble();
                        bank.addAccount(accountNumber, accountHolderName, initialBalance);
                        break;

                    case 2:
                        System.out.println("Enter account number: ");
                        accountNumber = scanner.nextLine();
                        System.out.println("Enter amount to deposit: ");
                        double depositAmount = scanner.nextDouble();
                        BankAccount accountToDeposit = bank.findAccount(accountNumber);
                        accountToDeposit.deposit(depositAmount);
                        break;

                    case 3:
                        System.out.println("Enter account number: ");
                        accountNumber = scanner.nextLine();
                        System.out.println("Enter amount to withdraw: ");
                        double withdrawAmount = scanner.nextDouble();
                        BankAccount accountToWithdraw = bank.findAccount(accountNumber);
                        accountToWithdraw.withdraw(withdrawAmount);
                        break;

                    case 4:
                        System.out.println("Enter account number: ");
                        accountNumber = scanner.nextLine();
                        BankAccount accountToCheck = bank.findAccount(accountNumber);
                        System.out.println("Balance: " + accountToCheck.getBalance());
                        break;

                    case 5:
                        System.out.println("Exiting...");
                        scanner.close();
                        return;

                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            }
            catch (Exception e){
                    System.out.println("Error: " + e.getMessage());



            }


        }
    }
}
