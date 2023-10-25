public class TestBankAccount {

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        System.out.println(b1.balance);
        b1.deposit(2000);
        System.out.println(b1.balance);
        b1.withdraw(3000);
        System.out.println(b1.balance);
    }
}

class BankAccount{
    double balance;

    void deposit(double amount)
    {
        this.balance += amount;
    }

    void withdraw(double amount)
    {
        this.balance -= amount;
    }
}
