package commands;


import Agency.Agency;
import system.AgencySystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import static system.AgencySystem.CurrentUser;

public abstract class UpdateAccount {
    public static void updateAccount(){

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        if(Agency.isSomebodyLogged == false)
            System.out.println("You nee to log in to modify !");
        else {
            Scanner in = new Scanner(System.in);

            System.out.println("You are updating account "+ CurrentUser.getName() + ".");

            String name = "";
            String password = "";
            String email ="";
            int bday = 0;
            int bmonth = 0;
            int byear = 0;


            try {

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
            AgencySystem.CurrentUser.ChangeUserDetails(name, password ,email, bday,bmonth, byear);
            System.out.println("You have succesfully change acount details !");

        }


    }

}