package commands;



import system.AgencySystem;
import user.User;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import static system.AgencySystem.CurrentUser;

public abstract class UpdateAccount {
    public static void updateAccount(User user) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner in = new Scanner(System.in);

        System.out.println("You are updating account " + user.getName() + ".");

        String name = "";
        String password = "";
        String email = "";
        int bday = 0;
        int bmonth = 0;
        int byear = 0;

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

        AgencySystem.CurrentUser.ChangeUserDetails(user, name, password, email, bday, bmonth, byear);
        System.out.println("You have succesfully change acount details !");

    }

}