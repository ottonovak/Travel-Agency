package user;

import Agency.Agency;
import Agency.Vacantion;
import commands.BuyVacantion;

import java.util.ArrayList;

public  class Customer extends User{

    private String Adress;
    private float Balance;
    private int BonusPoint;
    private int NumberOfPurchases;
    private ArrayList<Vacantion> ArrayListOfPurchasedVacantions;

    public Customer(String name, String password, String email, int bday, int bmonth, int byear) {
        super(name, password, email, bday, bmonth, byear);
    }


    public void buyVacantion(Vacantion vacantion) {
        this.NumberOfPurchases++;
        this.ArrayListOfPurchasedVacantions.add(vacantion);
        System.out.println("Vacantion was succesful purchased!");
    }


    public void showPV() {
        Vacantion.showPV(this.ArrayListOfPurchasedVacantions);
    }
}
