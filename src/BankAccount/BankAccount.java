package BankAccount;

public class BankAccount {
    // 은행 계좌를 관리하는 클래스
    // 계좌번호, 계좌주, 잔액
    
    //1. 필드 (계좌 속성)
    private String accountNumber; // 계좌번호
    private String onwerName;     // 계좌주 이름
    private double balance;       // 잔액

    // 생성자
    public BankAccount(String accountNumber, String onwerName, double balance) {
        this.accountNumber = accountNumber;
        this.onwerName = onwerName;
        this.balance = balance;
    }

    // 입금 메서드
    public void deposit (double amount) {
        if(amount > 0) {
            balance += amount;
            System.out.println(amount + " 원이 입금되었습니다.");
        }
        else {
            System.out.println("0원 이상 입금 가능합니다.");
        }
    }

    // 출금 메서드
    public void withdraw (double amount) {
        if(amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " 원이 출금되었습니다.");
        }
        else {
            System.out.println("잔액 부족 또는 잘못된 금액입니다.");
        }
    }

    // 잔액 조회 메서드
    public double getBalance() {
        return balance;
    }

    // 계좌 정보 출력 메서드
    public void printAccountInfo() {
        System.out.println("계좌번호: " + accountNumber);
        System.out.println("소유자: " + onwerName);
        System.out.println("잔액: " + balance + " 원");
        System.out.println("-------------------------");
    }
}
