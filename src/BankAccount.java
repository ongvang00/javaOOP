public class BankAccount {
    String name;
    public double balance;

//constructor
    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    //deposit method
    public double deposit (double amount) {
        return this.balance + amount;
    }

    //withdraw method
    public double withdraw (double amount) {
        return this.balance - amount;
    }
    //accountInfo method
    public void accountInfo () {
        System.out.println(this.name + "'s account balance is " + this.balance);
    }
}
