package ch11.sec06;

public class AccountExample {
    public static void main(String[] args) {
        Account account = new Account();
        account.deposit(10000);
        System.out.println("예금: " + account.getBalance());

        try {
            account.withdraw(5000);
            System.out.println("인출 성공");
            account.withdraw(7000);
            System.out.println("인출 성공");
        } catch(InsufficientException e) {
            String message = e.getMessage();
            System.out.println(message);
        }
    }
}