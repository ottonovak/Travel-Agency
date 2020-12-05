package commands;

public final class Help {
    public static void help() {
        System.out.println("---    Help section    --- \nCommands:");
        System.out.println("help -> list of commands");
        System.out.println("login -> log in to existing acount");
        System.out.println("register -> register new acount");
        System.out.println("who  -> Display who is logged");
        System.out.println("updatea  -> Update account detail of who is logged");
        System.out.println("updatecd  -> Update Customer Details");
        System.out.println("showad  -> Display Account Details");
        System.out.println("showv -> Create Vacantion");
        System.out.println("buyv  -> Buy Vacantion");
        System.out.println("createvp -> Create Vacantion Package");
        System.out.println("showpv-  -> Show Purchased Vacantions");
        System.out.println("hireb  -> Hire Bookkeeper");
        System.out.println("givebp  -> Give Bonus Points");
        System.out.println("---   End of help section   --- \n");

    }

}
