package user;

import Agency.Agency;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

final public class Manager extends Employee implements UserInterface, EmployeeInterface{

    public Manager(String name, String password, String email, int bday, int bmonth, int byear) {
        super(name, password, email, bday, bmonth, byear);

    }

    public static Manager GetDefaultManager() {
        return new Manager("Otto", "otto", "otto@yahoo.com", 3, 2, 2001);
    }

    @Override
    public void who() {
        System.out.println("Logged manager: " + this.Name);
    }

    @Override
    public void displayAccountDetails() {
        System.out.println("Is logged Manager: " + this.Name);
        System.out.println("Id: " + this.Id);
        System.out.println("Password: " + this.Password);
        System.out.println("Email: " + this.Email);
        System.out.println("Birth day: " + this.BDay + "." + this.BMonth + "." + this.BYear);
    }
    @Override
    public void giveBonusPoints(){
        int points = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Insert the points: ");
        points = in.nextInt();

        for (User user : Agency.ListOfUsers) {
            if (user instanceof Customer){
                ((Customer) user).addBPoints(points);
            }
        }
        System.out.println("You successively gived "+points+" points to all users!");
    }


}
