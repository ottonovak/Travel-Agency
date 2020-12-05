package user;

import Agency.Vacantion;
import java.util.ArrayList;

final public class Customer extends User implements UserInterface {

    private int Balance;
    private int BonusPoint;
    private int NumberOfPurchases;
    private ArrayList<Vacantion> ArrayListOfPurchasedVacantions;

    public Customer(String name, String password, String email, int bday, int bmonth, int byear) {
        super(name, password, email, bday, bmonth, byear);
        ArrayListOfPurchasedVacantions = new ArrayList<Vacantion>();
    }

    public static User GetDefaultCustomer() {
        return new Customer("Edi", "edi", "edi@yahoo.com", 7, 11, 1999);
    }

    public void addBalance(int sum) {
        this.Balance += sum;
    }

    public void addBPoints(int points) {
        this.BonusPoint += points;
    }

    public void buyVacantion(Vacantion vacantion) {
        if (this.Balance >= vacantion.getPrice()) {
            this.NumberOfPurchases++;
            this.ArrayListOfPurchasedVacantions.add(vacantion);
            System.out.println("Vacantion was succesful purchased!");
            this.Balance -= vacantion.getPrice();
            this.BonusPoint += vacantion.getPrice() / 10;
        } else
            System.out.println("Insufficient funds!");
    }

    public void showPV() {
        Vacantion.showPV(this.ArrayListOfPurchasedVacantions);
    }

    @Override
    public void who() {
        System.out.println("Logged customer: " + this.Name);
    }

    @Override
    public void displayAccountDetails() {
        System.out.println("Is logged customer: " + this.Name);
        System.out.println("Id: " + this.Id);
        System.out.println("Password: " + this.Password);
        System.out.println("Email: " + this.Email);
        System.out.println("Balance: " + this.Balance);
        System.out.println("Bonus point: " + this.BonusPoint);
        System.out.println("Birth day: " + this.BDay + "." + this.BMonth + "." + this.BYear);
    }

}
