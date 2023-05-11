
public class Main {
    public static void main(String[] args) {
        BankAccount MyAccount = new BankAccount ("Ong", 500.00);
        double myDeposit = MyAccount.deposit(100.00);
        System.out.println("My account balance: " + myDeposit);

//Transfer
        BankAccount LarryAccount = new BankAccount("Larry", 5000.00);
        BankAccount MaryAccount = new BankAccount("Mary", 300.00);
        double LarryWithdraw = LarryAccount.withdraw(100.00);
        double MaryDeposit = MaryAccount.deposit(100.00);
        System.out.println("Larry's account balance: " + LarryWithdraw);
        System.out.println("Marry's account balance: " + MaryDeposit);
//Product
        Product Product = new Product("Gallon of gas", 4.0, 10);
        Product.printProduct();
    }
    }