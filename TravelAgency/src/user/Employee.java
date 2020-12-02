package user;

public class Employee extends  User{
    public Employee(String name, String password, String email, int bday, int bmonth, int byear) {
        super(name, password, email, bday, bmonth, byear);
    }

@Override
    public void who(){
        System.out.println("Logged employee: "+ this.Name);
}



}
