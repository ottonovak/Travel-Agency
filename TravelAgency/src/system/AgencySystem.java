package system;

import Agency.Agency;
import Agency.Vacantion;
import commands.*;
import user.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public abstract class AgencySystem {

    public static User CurrentUser;
    public static Vacantion CurrentVacantion;


    public static void InitializeSystem() {
        Agency.Name = "Otto's Agency";
        Agency.InitializationAgency();
        System.out.println("Welcome to " + Agency.Name);
        System.out.println("You can type help for list of commands.");
    }

    public static void LoginUserCred(String name, String password) {
        User logginUser;
        logginUser = ChechLoginForAgency(name, password);
        if (logginUser != null) {
            CurrentUser = logginUser;
            System.out.println("User " + CurrentUser.getName() + " logged successful !");
            Agency.isSomebodyLogged = true;
        } else {
            System.out.println("This user do not exist !");
        }
    }

    private static User ChechLoginForAgency(String name, String password) {
        for (User user : Agency.ListOfUsers) {
            if (user.ChechLoginValidity(name, password)) {
                return user;
            }
        }
        return null;
    }

    public static void addBalance() throws IOException {
        if (!(CurrentUser instanceof Employee))
            System.out.println("You need to be Employee !");
        else
            Employee.addBalanceCustomer();
    }

    public static void showPV() {
        if (!(CurrentUser instanceof Customer))
            System.out.println("You need to be a Customer!");
        else
            ((Customer) CurrentUser).showPV();

    }

    public static void createateVP() {
        if (!(CurrentUser instanceof Customer))
            System.out.println("You need to be a Customer!");
        else {
            int numberOfVacantions =0;
            Scanner in = new Scanner(System.in);
            System.out.println("How many Vacantions do you want do add to Package?");
            numberOfVacantions = in.nextInt();
            BuyVacantion.buyVacantion(numberOfVacantions);
        }
        //Agency.createateVP();
    }


    public static void buyVacantion() throws IOException {
        if (!(CurrentUser instanceof Customer))
            System.out.println("You need to be a Customer!");
        else
            BuyVacantion.buyVacantion();
    }

    public static void addVacantion() throws IOException {
        if (!(CurrentUser instanceof Bookkeeper))
            System.out.println("You need to be a Bookkeeper!");
        else
            CreateVacantion.addVacantion();
    }

    public static void displayVacantions() {
        if (Agency.isSomebodyLogged)
            Agency.displayVacantions();
        else
            System.out.println("You need to be logged!");
    }

    public static void displayAccountDetails() {
        if (Agency.isSomebodyLogged)
            CurrentUser.displayAccountDetails();
        else
            System.out.println("You need to be logged!");
    }

    public static void changeCustomerDetails() throws IOException {
        if (!(CurrentUser instanceof Bookkeeper))
            System.out.println("You need to be a Bookkeeper!");
        else
            Bookkeeper.changeCustomerDetails();
    }

    public static void updateAccount() throws IOException {
        if (Agency.isSomebodyLogged)
            UpdateAccount.updateAccount(CurrentUser);
        else
            System.out.println("You need to be logged!");
    }

    public static void register() {
        Register.register("customer");
    }

    public static void who() {
        if (Agency.isSomebodyLogged)
            CurrentUser.who();
        else
            System.out.println("You are not logged in !");
    }


    public static void hireBookkeeper() {
        if (!(CurrentUser instanceof Manager))
            System.out.println("You need to be a Manager!");
        else
            Register.register("bookkeeper");
    }

    public static void login() {
        Login.login();
    }

    public static void help() {
        Help.help();
    }

    public static void giveBonusPoints() throws IOException {
        if (CurrentUser instanceof Manager) {
            String   toWho= "";
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("You want to give all customers or to a specific customer?");
            toWho = reader.readLine();
            if (toWho.equals("all"))
                ((Manager) CurrentUser).giveBonusPoints();
            else
                ((Employee) CurrentUser).giveBonusPoints();
        }
        else
            if (CurrentUser instanceof Employee)
                ((Employee) CurrentUser).giveBonusPoints();
            else
                System.out.println("You need to be Manager or Bookkeeper!");
    }
}
