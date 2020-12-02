package commands;

public abstract class Help {
    public static void help() {
        System.out.println("---    Help section    --- \nCommands:");
        System.out.println("help -> list of commands");
        System.out.println("login -> log in to existing acount");
        System.out.println("register -> register new acount");
        System.out.println("who -> display who is logged");
        System.out.println("updateaccount -> edita acount details");
        System.out.println("changecd -> Only for Bookkeper ! edit customer acount details");
        System.out.println("displayad -> display acount details");
        System.out.println("displayv -> Lsit of available vacantons");
        System.out.println("addvacantion -> Create new vacantion");
        System.out.println("--- End of help section --- \n");


    }
}
