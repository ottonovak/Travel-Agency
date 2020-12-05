package user;

import Agency.Agency;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static commands.UpdateAccount.updateAccount;

final public class Bookkeeper extends Employee implements UserInterface {

    public Bookkeeper(String name, String password, String email, int bday, int bmonth, int byear) {
        super(name, password, email, bday, bmonth, byear);
    }


    public static Bookkeeper GetDefaultBookkeper() {
        return new Bookkeeper("Tomi", "tomi", "tomi@yahoo.com", 13, 2, 2000);
    }


    public static void changeCustomerDetails() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Insert name of custoemer:");
        String name = reader.readLine();
        for (User user : Agency.ListOfUsers)
            if (user.Name.equals(name))
                updateAccount(user);
    }

    @Override
    public void who() {
        System.out.println("Logged bookkeeper: " + this.Name);
    }

    @Override
    public void displayAccountDetails() {
        System.out.println("Is logged Bookkeper: " + this.Name);
        System.out.println("Id: " + this.Id);
        System.out.println("Password: " + this.Password);
        System.out.println("Email: " + this.Email);
        System.out.println("Birth day: " + this.BDay + "." + this.BMonth + "." + this.BYear);
    }


}
