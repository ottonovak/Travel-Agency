package Agency;


import java.util.ArrayList;

public class Vacantion {
    protected String Name;
    final protected int Price;
    protected String Location;
    protected int DateDay;
    protected int DateMonth;
    protected int DateYear;
    protected int Duration;

    public Vacantion(String name, int price, String location, int dateDay, int dateMonth, int dateYear, int duration) {
        this.Name = name;
        this.Price = price;
        this.Location = location;
        this.DateDay = dateDay;
        this.DateMonth = dateMonth;
        this.DateYear = dateYear;
        this.Duration = duration;
    }

    public static Vacantion GetDefaultVacantion() {
        return new Vacantion("Maldives", 1000, "Maldives islands", 1, 1, 2021, 7);

    }

    public static void showPV(ArrayList<Vacantion> arrayListOfPurchasedVacantions) {
        for (Vacantion vacantion : arrayListOfPurchasedVacantions) {
            displayOneVacantion(vacantion);
        }
    }

    public static void displayOneVacantion(Vacantion vacantion) {
        System.out.println("Name:" + vacantion.Name);
        System.out.println("Price: " + vacantion.Price);
        System.out.println("Location: " + vacantion.Location);
        System.out.println("Date: " + vacantion.DateDay + "." + vacantion.DateMonth + "." + vacantion.DateYear);
        System.out.println("Duration: " + vacantion.Duration + " days\n");
    }

    public int getPrice() {
        return this.Price;
    }

    public String getName() {
        return this.Name;
    }


}
