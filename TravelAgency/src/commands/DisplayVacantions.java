package commands;


import Agency.Agency;
import Agency.Vacantion;
import system.AgencySystem;

public abstract class DisplayVacantions {
    public static void displayVacantions(){
        System.out.println("Available vacations:\n");
        Agency.displayVacantions();

    }

}