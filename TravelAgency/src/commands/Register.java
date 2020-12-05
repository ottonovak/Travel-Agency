package commands;

import Agency.Agency;
import user.Bookkeeper;
import user.Customer;
import user.User;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public abstract class Register {
    public static void register(String who) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner in = new Scanner(System.in);

        String name = "";
        String password = "";
        String email = "";
        int bday = 0;
        int bmonth = 0;
        int byear = 0;
        int balance = 0;

        try {

            System.out.println("Insert name: ");
            name = reader.readLine();

            System.out.println("Insert password: ");
            password = reader.readLine();

            System.out.println("Insert email: ");
            email = reader.readLine();

            System.out.println("Insert birth day: ");
            bday = in.nextInt();

            System.out.println("Insert birth month: ");
            bmonth = in.nextInt();

            System.out.println("Insert birth year: ");
            byear = in.nextInt();


        } catch (IOException e) {
            e.printStackTrace();
        }

        User newUser = null;
        if (who.equals("customer")) {
            newUser = new Customer(name, password, email, bday, bmonth, byear);
            Agency.RegisterUser(newUser);
            System.out.println("Customer "+name+" was register!");
        }
        if (who.equals("bookkeeper")) {
            newUser = new Bookkeeper(name, password, email, bday, bmonth, byear);
            Agency.RegisterUser(newUser);
            System.out.println("Bookkeeper "+name+" was hired!");
        }

    }
}