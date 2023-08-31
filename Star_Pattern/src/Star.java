public class Star {

    private int n =5;
    private int n1 = 1;

    private static int m = 5;

    private int display;

    public void star(){
        for (int i = 0; i<5;i++){
            for (int j = n;j>0;j--){
                System.out.print("*");
            }
            n--;
            System.out.println();
        }
    }


    Star(){
        this.display = Star.m;
        Star.m++;
    }
    public void reverseStar(){
        for (int i = 0; i<5;i++){
            for (int j = n1;j>0;j--){
                System.out.print("*");
            }
            n1++;
            System.out.println();
        }

    }

    public void show(){
        display = 10;
        System.out.println("display is : "+display);
        System.out.println(10+1+"5"+10+1);
    }
}
