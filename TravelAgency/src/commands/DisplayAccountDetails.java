package commands;


import Agency.Agency;
import system.AgencySystem;

import static system.AgencySystem.CurrentUser;

public abstract class DisplayAccountDetails {
    public static void displayAccountDetails(){

        if(Agency.isSomebodyLogged == false)
            System.out.println("You need to log in first !");
        else {
            AgencySystem.CurrentUser.displayAccountDetails();

        }

    }

}