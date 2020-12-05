package commands;

import Agency.Agency;
import Agency.Vacantion;
import system.AgencySystem;
import user.Bookkeeper;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public abstract class CreateVacantion {
    public static void addVacantion() throws IOException {

        if (!(AgencySystem.CurrentUser instanceof Bookkeeper))
            System.out.println("You need to be Bookkeper !");
        else {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            Scanner in = new Scanner(System.in);

            String name = "";
            int price = 0;
            String location = "";
            int dateDay = 0;
            int dateMonth = 0;
            int dateYear = 0;
            int duration = 0;

            System.out.println("Insert name: ");
            name = reader.readLine();

            System.out.println("Insert price: ");
            price = in.nextInt();

            System.out.println("Insert lcoation: ");
            location = reader.readLine();

            System.out.println("Insert day: ");
            dateDay = in.nextInt();

            System.out.println("Insert  month: ");
            dateMonth = in.nextInt();

            System.out.println("Insert  year: ");
            dateYear = in.nextInt();

            System.out.println("Insert  duration: ");
            duration = in.nextInt();

            Vacantion newVacantion = null;
            newVacantion = new Vacantion(name, price, location, dateDay, dateMonth, dateYear, duration);
            Agency.AddVacantion(newVacantion);
        }
    }

}