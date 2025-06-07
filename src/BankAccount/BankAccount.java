package BankAccount;

public class BankAccount {
    // 은행 계좌를 관리하는 클래스
    // 계좌번호, 계좌주, 잔액
    
    private String accountNumber;
    private String onwerName;
    private double balance;

    // 생성자
    public BankAccount(String accountNumber, String onwerName, double balance) {
        this.accountNumber = accountNumber;
        this.onwerName = onwerName;
        this.balance = balance;
    }

    //메서드
    public void deposit (double amount) {
        if(amount > 0) {
            balance += amount;
        }
    }

    public void withdraw (double amount) {
        if(amount > 0 && amount <= balance) {
            balance -= amount;
        }
        else {
            System.out.println("잔액 부족 또는 잘못된 금액입니다.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void printAccountInfo() {
        System.out.println("계좌번호: " + accountNumber);
        System.out.println("소유자: " + onwerName);
        System.out.println("잔액: " + balance + " 원");
    }
}
