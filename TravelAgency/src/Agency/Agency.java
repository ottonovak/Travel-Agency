package Agency;

import system.AgencySystem;
import user.Manager;
import user.User;

import java.util.ArrayList;

public abstract class Agency {
    public static String Location;
    public static String Name;
    public static float MarketCapital;
    public static boolean isSomebodyLogged = false;

    public static ArrayList<User> ListOfUsers;
    public static ArrayList<Vacantion> ListOfVacantions;


    public static void InitializationAgency() {
        ListOfUsers = new ArrayList<User>();
        ListOfVacantions = new ArrayList<Vacantion>();

        User newUser = Manager.GetDefaultManager();
        ListOfUsers.add(newUser);

        Vacantion newVacantion = Vacantion.GetDefaultVacantion();
        ListOfVacantions.add(newVacantion);

        System.out.println(("A default Manager and a default Vacation was created."));

    }

    public static void RegisterUser(User newUser) {
        ListOfUsers.add(newUser);
        System.out.println("User " + newUser.getName() + " was registered.");
    }


    public static void AddVacantion(Vacantion newVacantion) {
        ListOfVacantions.add(newVacantion);
        System.out.println("Vacation "+ newVacantion.getName() + " was created !");

    }
    public static void displayVacantions() {
        for(Vacantion vacantion : Agency.ListOfVacantions) {
            System.out.println("Name:" + vacantion.Name);
            System.out.println("Price: " + vacantion.Price);
            System.out.println("Location: " + vacantion.Location);
            System.out.println("Date: " + vacantion.DateDay + "." + vacantion.DateMonth + "." + vacantion.DateYear);
            System.out.println("Duration: " + vacantion.Duration + " days\n");
        }
    }



}
