public class Product {

    private String name;
    private int code;
    private int type;

    public Product() {
        this.name = "WIFI BOX";
        this.code = 9636;
        this.type = 6;

    }

    public Product(String name,int code,int type){
        this.name= name;
        this.code=code;
        this.type=type;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setCode(int code){
        this.code= code;
    }

    public int getCode() {
        return code;
    }

    public void setType(int type){
        this.type= type;

    }

    public void displayData(){
        System.out.println("The name of the Product is : "+name);
        System.out.println("Product code : "+code);
        System.out.println("Product type : "+type);
    }
}
