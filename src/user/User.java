package user;


public class User {
    protected String Password;
    protected String Email;
    final protected int Id;
    protected String Name;
    protected int BDay;
    protected int BMonth;
    protected int BYear;
    protected static int count = 1;


    public User(String name, String password, String email, int bday, int bmonth, int byear) {
        this.Name = name;
        this.Password = password;
        this.Email = email;
        this.Id = count++;
        this.BDay = bday;
        this.BMonth = bmonth;
        this.BYear = byear;
    }

    public boolean ChechLoginValidity(String name, String password) {
        if (this.Name.equals(name) && this.Password.equals(password)) {
            return true;
        } else
            return false;
    }

    public String getName() {
        return this.Name;
    }

    public void ChangeUserDetails(User user, String name, String password, String email, int bday, int bmonth, int byear) {
        user.Name = name;
        user.Password = password;
        user.Email = email;
        user.BDay = bday;
        user.BMonth = bmonth;
        user.BYear = byear;
    }

    public boolean ChechLoginValiditybuName(String name) {
        if (this.Name.equals(name))
            return true;
        else
            return false;
    }

    public void displayAccountDetails() {
        System.out.println("Name: " + this.Name);
        System.out.println("Password: " + this.Password);
        System.out.println("Email: " + this.Email);
        System.out.println("Birth day: " + this.BDay + "." + this.BMonth + "." + this.BYear);
    }

    public void who() {
        System.out.println("Logged user: " + this.Name);
    }


}
