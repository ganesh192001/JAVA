import java.sql.SQLOutput;
import java.util.Random;

public class Employee {

    private static int id;
    private String name;
    private static String companyName = "PTC";

    private static int randomNumber;

    //This is the static Block it will execute first,in this we are using Random class of java which will create
    //random number then we are storing that number in a variable and assigning that value to id and incrementing
    //accordingly
    static {
        Random ra = new Random();
        randomNumber = Math.abs(ra.nextInt(10));

    }

    Employee() {
        this.name = "GANESH";
        Employee.id = ++randomNumber;
    }

    Employee(String name) {
        this.name = name;
        Employee.id = ++randomNumber;
    }

    public static void changeCompanyName(String companyName) {
        Employee.companyName = companyName;
    }

    public void display() {
        System.out.println("The Name of employee is : " + name);
        System.out.println("The Id of employee is : " + id);
        System.out.println("The company of employee is : " + companyName);
    }

}
