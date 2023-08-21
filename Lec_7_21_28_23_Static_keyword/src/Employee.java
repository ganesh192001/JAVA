public class Employee {
    private int id;
    private String name;
    private int sal;
    private static String companyName = "BitCode";

    public Employee(int id, String name, int sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
//this.companyName = companyName;
    }

    public Employee() {
        id = 100;
        name = "null";
        sal = 10000;
// companyName = "null";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public static String getCompanyName() {
        return companyName;
    }

    public static void setCompanyName(String companyName) {
        Employee.companyName = companyName;
// System.out.println(sal);
    }

    public void display() {
        System.out.println("id =" + " " + id + "name =" + " " + name + " " + "salary =" + " " + sal + " " + "company = " + " " + companyName);
    }
}


