package commands;

import Agency.Agency;
import system.AgencySystem;
import user.Customer;
import Agency.Vacantion;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public abstract class ShowPV {
    public static void showPV() {
        if(!(AgencySystem.CurrentUser instanceof Customer))
            System.out.println("You need to be a Customer!");
        else{
            ((Customer) AgencySystem.CurrentUser).showPV();
        }


    }
}
