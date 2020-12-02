package commands;


import Agency.Agency;
import Agency.Vacantion;
import system.AgencySystem;
import user.Customer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public abstract class CreateateVP {
    public static void createateVP() {
        int numberOfVacantions = 0;
        String nameOfWVac = "";

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner in = new Scanner(System.in);
        if(!(AgencySystem.CurrentUser instanceof Customer))
            System.out.println("You need to be a Customer to create Vacantion Package !");
        else{

            System.out.println("How many Vacantions do you want do add to Package?");
            numberOfVacantions = in.nextInt();
            while (numberOfVacantions!=0)
            {
                try {
                    nameOfWVac = reader.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                for(Vacantion vacantion : Agency.ListOfVacantions)
                    if(vacantion.getName().equals(nameOfWVac))
                        ((Customer) AgencySystem.CurrentUser).buyVacantion(vacantion);


                numberOfVacantions--;
            }

            }

    }
}
