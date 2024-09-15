public class BankAccount {
    private int balance = 0;
    private int minBalance = -5000;
    private String owner;
    /**
     * @param balance Amount of money in the account, can be negative
     * @param balance Must be >= minBalance
     */
    public BankAccount(int balance, int minBalance, String owner) {
        this.balance = balance;
        this.minBalance = minBalance;
        this.owner = owner;
    }

    public int deposit(int amount) {
        if (amount <= 0) {
            System.out.println("Please deposit a positive amount of money.");
        }
        else
            balance += amount;
        return balance;
    }

    public String toString() {
        return "balance of " + owner + ": " + balance;
    }


    public boolean withdraw(int amount) {
        if (balance - amount < minBalance)
            return false;
        balance = balance - amount;
        return true;
    }


    public int getBalance() {
        return balance;
    }

    public boolean transfer(BankAccount target, int amount) {
        if (this.balance - amount >= minBalance) { //transfer is possible
            target.deposit(amount);
            this.withdraw(amount);

            return true;
        }
        else {
            System.out.println("you're broke");
            return false;
        }
    }

    public int getMinBalance() {
        return minBalance;
    }

    public void setBalance(int balance) {
        if (balance > minBalance)
            this.balance = balance;
    }
}
