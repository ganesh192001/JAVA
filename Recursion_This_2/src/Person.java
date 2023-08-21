public class Person {

    private String nameOfThePerson;


    Person() {
        nameOfThePerson = "GANESH";
    }

    Person(String nameOfThePerson) {

        this.nameOfThePerson = nameOfThePerson;
    }

    public void printName() {

        System.out.println("Name of the person is : " + nameOfThePerson);
    }

    public void changName(String nameOfThePerson) {
        this.nameOfThePerson = nameOfThePerson;
        System.out.println("Name of the person is : " + nameOfThePerson);

    }

    public void introduce(Person p1) {
        //this.nameOfThePerson = p1.nameOfThePerson;
        System.out.println(nameOfThePerson +" INTRODUCED "+ p1.nameOfThePerson);
    }
}
