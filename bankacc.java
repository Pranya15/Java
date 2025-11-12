class BankAccount {
    // Fields (data members)
    int accNo;
    String accHolder;
    double balance;
    BankAccount(int accNo, String accHolder, double balance) {
        this.accNo = accNo;
        this.accHolder = accHolder;
        this.balance = balance;
    }
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            System.out.println("Invalid withdrawal amount!");
        }
    }

    void display() {
        System.out.println("Account Number: " + accNo);
        System.out.println("Account Holder: " + accHolder);
        System.out.println("Balance: " + balance);
    }
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(101, "Pranya Patel", 5000);

        acc1.display();
        acc1.deposit(2000);
        acc1.withdraw(1500);
        acc1.display();
    }
}