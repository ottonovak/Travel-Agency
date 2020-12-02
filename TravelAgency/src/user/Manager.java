package user;

public class Manager extends Employee{


    public Manager(String name, String password, String email, int bday, int bmonth, int byear) {
        super(name, password, email, bday, bmonth, byear);
    }

    public static Manager GetDefaultManager() {
        return  new Manager("Otto","otto", "otto@yahoo.com", 3, 2, 2001);
    }



}
