package system;

import Agency.Agency;
import user.User;
import Agency.Vacantion;


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
        if(logginUser != null)
        {
            CurrentUser = logginUser;
            System.out.println("User " + CurrentUser.getName() + " logged successful !");
            Agency.isSomebodyLogged = true;
        }
        else
        {
            System.out.println("This user do not exist !");
        }
    }

    private static User ChechLoginForAgency(String name, String password) {
        for(User user : Agency.ListOfUsers){
            if(user.ChechLoginValidity(name, password)){
                return user;
            }
        }
        return null;
    }


    public static void who() {
        if(Agency.isSomebodyLogged){
            CurrentUser.who();

        }

    }

}
