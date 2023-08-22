// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static {
        System.out.println("This static block will execute first");
    }

    public static void main(String[] args) {

        System.out.println("###########################################################################");
        Employee E1 = new Employee("RAHUL");
        E1.display();

        System.out.println("###########################################################################");

        Employee.changeCompanyName("TESLA");
        Employee E2 = new Employee("ganesh");
        E2.display();

        System.out.println("###########################################################################");
        //System.out.println(args[0]);
        Employee E3 = new Employee("MAYUR");
        E3.display();

        System.out.println("###########################################################################");
        Employee E4 = new Employee();
        E4.display();


    }
}