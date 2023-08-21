public class Recursion {

    public String name = "My name is ganesh";
    public String returns = "Recursion completed";

    //RECURSION CALLING A FUNCTION BY NAME ITSELF
    public void display(int num) {
        System.out.println(name);
        if (num > 0)
            display(--num);


    }

}
