package system;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static commands.AddVacantion.addVacantion;
import static commands.BuyVacantion.buyVacantion;
import static commands.ChangeCustomerDetails.changeCustomerDetails;
import static commands.CreateateVP.createateVP;
import static commands.DisplayAccountDetails.displayAccountDetails;
import static commands.DisplayVacantions.displayVacantions;
import static commands.Help.help;
import static commands.Login.login;
import static commands.Register.register;
import static commands.ShowPV.showPV;
import static commands.UpdateAccount.updateAccount;
import static commands.WhoIsLogged.whoIsLogged;


public abstract class CommandReader {
    public static AgencySystem AgencySystem;
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void Run() throws IOException {
        while (true) {
            try {
                System.out.println("Insert command: ");
                String command = reader.readLine();
                ExecuteCommand(command);
            }
            catch (IOException e){
                e.printStackTrace();
            }

        }
    }

    private static void ExecuteCommand(String command) throws IOException {
        if(command.equals("help"))
            help();

        if(command.equals("login"))                                        // LOGIN
            login();

        // KTORE JE REGISTOVANY
        if(command.equals("who"))
            whoIsLogged();

        // REGISTER
        if(command.equals("register")) // kedze chcem aby len Manager this.AgencySystem.CurrentUSer instanceof Manager
            register();

                                                                        // UPDATE ACOUNT
        if(command.equals("updateaccount"))
            updateAccount();

        if(command.equals("changecd")){
            changeCustomerDetails();
        }

        if(command.equals("displayad")) {
            displayAccountDetails();
        }

        if(command.equals("displayv"))
            displayVacantions();


        if(command.equals("addvacantion"))
            addVacantion();

        if(command.equals("buyv"))
            buyVacantion();

        if(command.equals("createvp"))
            createateVP();

        if(command.equals("showpv"))
            showPV();


    }// koniec commandov



}
