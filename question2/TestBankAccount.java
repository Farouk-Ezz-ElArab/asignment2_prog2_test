package question2;
public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456", "John Doe");

        System.out.println("Account Creation");
        account.displayDetails();

        System.out.println("After Deposit");
        account.deposit(1000);

        System.out.println("After Withdrawal");
        account.withdraw(500);

        System.out.println("Checking Balance");
        account.checkBalance();

        System.out.println("Attempt to Withdraw More Than Balance");
        account.withdraw(600);

        System.out.println("Final Balance Check");
        account.checkBalance();
    }
}
