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
}
