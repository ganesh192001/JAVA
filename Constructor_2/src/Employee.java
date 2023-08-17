import java.security.PublicKey;

public class Employee {

    private int id;

    private int salary;

    private int mobile_no = 986093;

    //USER DEFINED CONSTRUCTOR
    public Employee() {
        id = 123;
        salary = 15000;
        mobile_no = 956052368;
    }

    //USER DEFINED PARAMETERIZED CONSTRUCTOR
    public Employee(int id1, int salary1, int mobile_no1) {
        if (salary1 <= 0) {
            System.out.println("SALARY CANNOT BE NEGATIVE OR ZERO");
        } else {
            salary = salary1;
        }
        id = id1;
        mobile_no = mobile_no1;

    }

    public Employee(int id1, int salary1) {
        if (salary1 <= 0) {
            System.out.println("SALARY CANNOT BE NEGATIVE OR ZERO");
        } else {
            salary = salary1;
        }
        id = id1;


    }

    //TO DISPLAY METHOD
    public void display() {
        System.out.println(id + " " + salary + " " + mobile_no);
    }
}