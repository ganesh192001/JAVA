public class Student {

    private int id;
    private String name;

    private String group;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getGroup(){
        return group;
    }

    Student(){
        id = 123;
        name = "GANESH";
        group = "A";
    }

    Student(int id,String name,String group){
        this.id = id;
        this.name = name;
        this.group= group;
    }

    public void display(){
        System.out.println("Id of the student is :"+id);
        System.out.println("Name of the student is "+name);
        System.out.println("Group of student : "+group);
    }
}
