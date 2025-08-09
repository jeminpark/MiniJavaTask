package BankAccount;

public class BankApp {

    public void run() {

        BankAccount account1 = new BankAccount("123-456", "홍길동", 1000000);
        
        // 계좌 정보 출력
        System.out.println("계좌 정보 출력");
        account1.printAccountInfo();

        // 입금 및 출금 테스트
        System.out.println("입금 및 출금 테스트");
        System.out.println("잔액" + account1.getBalance() + " 원");

        // 입금
        account1.deposit(50000);
        System.out.println("잔액" + account1.getBalance() + " 원");

        // 출금
        account1.withdraw(200000);
        System.out.println("잔액" + account1.getBalance() + " 원");

        // 최종 계좌 정보 출력
        System.out.println("최종 계좌 정보 출력");
        account1.printAccountInfo();
    }
}
