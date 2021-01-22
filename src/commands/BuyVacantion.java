package commands;

import Agency.Agency;
import system.AgencySystem;
import user.Customer;
import Agency.Vacantion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public abstract class BuyVacantion {
    public static void buyVacantion() throws IOException {
        String nameOfWVac = "";

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner in = new Scanner(System.in);
        if (!(AgencySystem.CurrentUser instanceof Customer))
            System.out.println("You need to be a Customer to buy vacantion !");
        else {
            System.out.println("Insert the name of wanted vacantion.");

            nameOfWVac = reader.readLine();

            for (Vacantion vacantion : Agency.ListOfVacantions)
                if (vacantion.getName().equals(nameOfWVac))
                    ((Customer) AgencySystem.CurrentUser).buyVacantion(vacantion);
        }
    }

    public static void buyVacantion(int numberOfVacantions) {
        String nameOfWVac = "";

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (numberOfVacantions != 0) {
            System.out.println("Insert name of Vacantion:");
            try {
                nameOfWVac = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }

            for (Vacantion vacantion : Agency.ListOfVacantions)
                if (vacantion.getName().equals(nameOfWVac))
                    ((Customer) AgencySystem.CurrentUser).buyVacantion(vacantion);

            numberOfVacantions--;
        }
    }

}
