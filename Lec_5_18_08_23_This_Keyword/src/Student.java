public class Student {
    private int roll;
    private String name;
    private int marks;

    public Student() {
        roll = 111;
        name = "Snehal";
        marks = 90;
    }

    public Student(int roll, String name, int marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public int getRoll() {
        return roll;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }

    public void display() {
        System.out.println("Roll Number =" + " " +
                roll + " " + "name =" + name + " " + "marks =" + marks);
    }
}
