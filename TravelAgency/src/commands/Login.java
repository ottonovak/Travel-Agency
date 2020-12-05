package commands;

import system.AgencySystem;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public abstract class Login {
    public static void login() {

        String name = "";
        String password = "";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Insert name: ");
            name = reader.readLine();
            System.out.println("Insert password: ");
            password = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        AgencySystem.LoginUserCred(name, password);

    }

}
