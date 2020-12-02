package commands;

import Agency.Agency;
import system.AgencySystem;
import user.Bookkeeper;
import user.Customer;
import user.User;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public abstract class Register {
    public static void register(){

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner in = new Scanner(System.in);

        String name = "";
        String password = "";
        String email ="";
        String nextcommand = "";
        int bday = 0;
        int bmonth = 0;
        int byear = 0;

        try {
            while (!(nextcommand.equals("customer") || nextcommand.equals("bookkeper"))){
                System.out.println("customer or bookkeper ?");
                nextcommand = reader.readLine();
            }

            System.out.println("Insert name: ");
            name =reader.readLine();

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

        }
        catch (IOException e){
            e.printStackTrace();
        }
        User newUser = null;
        if(nextcommand.equals("customer")){
            newUser = new Customer(name, password, email, bday, bmonth, byear);
            Agency.RegisterUser(newUser);
        }
        if(nextcommand.equals("bookkeper")){
            newUser = new Bookkeeper(name, password, email, bday, bmonth, byear);
            Agency.RegisterUser(newUser);
        }

    }
}