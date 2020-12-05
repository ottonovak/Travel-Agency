package user;

import Agency.Agency;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public abstract class Employee extends User {
    public Employee(String name, String password, String email, int bday, int bmonth, int byear) {
        super(name, password, email, bday, bmonth, byear);
    }

    public static void addBalanceCustomer() throws IOException {
        String customer = "";
        int sum = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner in = new Scanner(System.in);

        System.out.println("Insert name of customer: ");
        customer = reader.readLine();
        System.out.println("Insert the sum: ");
        sum = in.nextInt();

        for (User user : Agency.ListOfUsers) {
            if (user.getName().equals(customer)){
                ((Customer) user).addBalance(sum);
                System.out.println("You successively add the sum of: "+sum+" to user "+ user.Name);
            }
        }
    }

    public void giveBonusPoints() throws IOException {
        String customer = "";
        int points = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner in = new Scanner(System.in);

        System.out.println("Insert name of customer: ");
        customer = reader.readLine();
        System.out.println("Insert the points: ");
        points = in.nextInt();

        for (User user : Agency.ListOfUsers) {
            if (user.getName().equals(customer)){
                ((Customer) user).addBPoints(points);
                System.out.println("You successively add "+points+" points to user "+ user.Name);
            }
        }
    }

}
