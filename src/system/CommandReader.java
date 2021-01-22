package system;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public abstract class CommandReader {
    public static AgencySystem AgencySystem;
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void Run() throws IOException {
        while (true) {
            try {
                System.out.println("Insert command: ");
                String command = reader.readLine();
                ExecuteCommand(command);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    private static void ExecuteCommand(String command) throws IOException {
        if (command.equals("help"))
            AgencySystem.help();

        if (command.equals("login"))
            AgencySystem.login();

        if (command.equals("who"))
            AgencySystem.who();

        if (command.equals("register"))
            AgencySystem.register();

        if (command.equals("updatea"))
            AgencySystem.updateAccount();

        if (command.equals("updatecd "))
            AgencySystem.changeCustomerDetails();

        if (command.equals("showad"))
            AgencySystem.displayAccountDetails();

        if (command.equals("showv"))
            AgencySystem.displayVacantions();

        if (command.equals("addv"))
            AgencySystem.addVacantion();

        if (command.equals("buyv"))
            AgencySystem.buyVacantion();

        if (command.equals("createvp"))
            AgencySystem.createateVP();

        if (command.equals("showpv"))
            AgencySystem.showPV();

        if (command.equals("addbalance"))
            AgencySystem.addBalance();

        if(command.equals("hireb"))
            AgencySystem.hireBookkeeper();

        if(command.equals("givebp"))
            AgencySystem.giveBonusPoints();

    }

}