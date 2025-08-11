package bankATM;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import bankATM.BankAccount;

public class BankATM {
    private List<BankAccount> accounts = new ArrayList<>();
    private Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        BankATM atm = new BankATM();
        atm.start();
    }

    public void start() {
        while (true) {

            // 메뉴 출력
            printMenu();
            int choice = getUserChoice(); // 사용자 입력 받기

            switch (choice) {
                case 1 -> createAccount(); // 계좌 생성
                case 2 -> depositMoney(); // 입금
                case 3 -> withdrawMoney(); // 출금
                case 4 -> checkBalance(); // 잔액 조회
                case 5 -> printAllAccounts(); // 모든 계좌 보기
                case 0 -> {
                    System.out.println("프로그램을 종료합니다.");
                    scan.close();
                    return;
                }
                default -> System.out.println("잘못된 선택입니다. 다시 시도하세요.");
            }
        }
    }

    
   

    private void printMenu() {
        System.out.println("\n=== ATM메뉴 ===");
        System.out.println("1. 계좌 생성");
        System.out.println("2. 입금");
        System.out.println("3. 출금");
        System.out.println("4. 잔액 조회");
        System.out.println("5. 모든 계좌 보기");
        System.out.println("0. 종료");
        System.out.print("메뉴를 선택하세요: ");
    }

    private int getUserChoice() {
        try {
            return Integer.parseInt(scan.nextLine().trim());
        } catch (NumberFormatException e) {
            return -1; // 잘못된 입력 처리
        }
    }

    private void createAccount() {
        System.out.print("계좌 번호 입력: ");
        String accNum = scan.nextLine().trim();

        System.out.print("소유자 이름: ");
        String name = scan.nextLine().trim();

        System.out.print("초기 잔액: ");
        double balance = Double.parseDouble(scan.nextLine().trim());

        accounts.add(new BankAccount(accNum, name, balance));
        System.out.println(name + "님의 계좌가 생성되었습니다.");
    }

    private BankAccount findAccount() {
        System.out.print("계좌 번호 입력: ");
        String accNum = scan.nextLine();

        for (BankAccount acc : accounts) {
            if (acc.getAccountNumber().equals(accNum)) {
                return acc;
            }
        }
        System.out.println("해당 계좌를 찾을 수 없습니다.");
        return null;
    }

    private void depositMoney() {
        BankAccount account = findAccount();
        if (account != null ) {
            System.out.print("입금 금액: ");
            double amount = Double.parseDouble(scan.nextLine().trim());
            account.deposit(amount);
        }
    }

     private void withdrawMoney() {
        BankAccount account = findAccount();
        if (account != null) {
            System.out.print("출금 금액: ");
            double amount = Double.parseDouble(scan.nextLine().trim());
            account.withdraw(amount);
        }
    }


    private void checkBalance() {
       BankAccount account = findAccount();
       if(account != null) {
        System.out.println("현재 잔액: " + account.getBalance() + " 원");
       }
    }

    private void printAllAccounts() {
        if(accounts.isEmpty()) {
            System.out.println("등록된 계좌가 없습니다.");
        
        }
        else {
            for(BankAccount acc : accounts) {
                acc.printAccountInfo();
            }
        }
    }



}
