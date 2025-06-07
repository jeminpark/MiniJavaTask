package BankAccount;

public class BankApp {

    public void run() {

        BankAccount account1 = new BankAccount("123-456", "홍길동", 1000000);
    
        account1.printAccountInfo();
        account1.deposit(50000);
        System.out.println("잔액" + account1.getBalance() + " 원");
        account1.withdraw(200000);
        System.out.println("잔액" + account1.getBalance() + " 원");
    }
}
