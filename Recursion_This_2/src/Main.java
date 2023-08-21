// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //For each loop in java
        Recursion r1 = new Recursion();
       // r1.display(10);

        Product p1 = new Product();
        p1.displayData();

        Product p2 = new Product("SAMSUNG_TV",1,66);
        p2.displayData();

        System.out.println("#########################################################################");

        Person P1 = new Person();
        P1.printName();
        P1.changName("RAHUL");

        Person P2 = new Person();
        P2.introduce(P1);


    }
}