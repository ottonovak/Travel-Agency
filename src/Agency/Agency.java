package Agency;

import user.Bookkeeper;
import user.Customer;
import user.Manager;
import user.User;
import java.util.ArrayList;
import static Agency.Vacantion.displayOneVacantion;

public abstract class Agency {
    public static String Location;
    public static String Name;
    public static int MarketCapital;
    public static boolean isSomebodyLogged = false;
    public static ArrayList<User> ListOfUsers;
    public static ArrayList<Vacantion> ListOfVacantions;


    public static void InitializationAgency() {
        ListOfUsers = new ArrayList<User>();
        ListOfVacantions = new ArrayList<Vacantion>();
        User newUser;

        newUser = Manager.GetDefaultManager();
        ListOfUsers.add(newUser);

        newUser = Customer.GetDefaultCustomer();
        ListOfUsers.add(newUser);

        newUser = Bookkeeper.GetDefaultBookkeper();
        ListOfUsers.add(newUser);

        Vacantion newVacantion = Vacantion.GetDefaultVacantion();
        ListOfVacantions.add(newVacantion);

        System.out.println(("A default Manager-Otto, Customer-Edi, Bookkeper-Tomi and a default Vacation-Maldives was created."));

    }


    public static void displayVacantions() {
        System.out.println("Available vacations:");
        for (Vacantion vacantion : Agency.ListOfVacantions)
            displayOneVacantion(vacantion);
    }

    public static void RegisterUser(User newUser) {
        ListOfUsers.add(newUser);
    }


    public static void AddVacantion(Vacantion newVacantion) {
        ListOfVacantions.add(newVacantion);
        System.out.println("Vacation " + newVacantion.getName() + " was created !");

    }


}
