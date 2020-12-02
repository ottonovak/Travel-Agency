package commands;


import Agency.Agency;
import system.AgencySystem;
import user.Bookkeeper;
import user.User;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.management.GarbageCollectorMXBean;
import java.util.Scanner;

public abstract class ChangeCustomerDetails {
    public static void changeCustomerDetails() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        if(AgencySystem.CurrentUser instanceof Bookkeeper) {
            String changeCustomer = "";
            String name = "";
            String password = "";
            String email ="";
            int bday = 0;
            int bmonth = 0;
            int byear = 0;

            System.out.println("Customer account details of who you want to change ?");
            changeCustomer =reader.readLine();
            System.out.println("You are changing acount details of " + changeCustomer);

            Scanner in = new Scanner(System.in);

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
            for(User user : Agency.ListOfUsers){
                if(user.ChechLoginValiditybuName(changeCustomer)){
                    AgencySystem.CurrentUser.ChangeUserDetails(name, password ,email, bday,bmonth, byear);
                    System.out.println("You have succesfully change acount details !");
                }
            }
        }
        else
            System.out.println("You are not Bookkeeper !");
    }
}