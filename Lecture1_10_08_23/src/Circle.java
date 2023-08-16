public class Circle {
    public int x;
    public int y;
    public int r;

    //Setting value of x
    public void setX(int x1) {
        if (x1 <= 0) {
            return;
        }

        x = x1;
    }

    public int getX() {
        return x;
    }

    //Setting value of y
    public void setY(int y1) {
        if (y1 <= 0) {
            return;
        }

        y = y1;
    }

    public int getY() {
        return y;
    }

    //Setting value of R
    public void setR(int r1) {
        if (r1 <= 0) {
            return;
        }

        r = r1;
    }

    public int getR() {
        return r;
    }

    //Displaying values of x ,y and r
    public void displayValue() {
        System.out.println("X : " + x + " " + "Y : " + y + " " + "R : " + r);
    }

    //Calculating area of circle
    public void areaOfCircle() {
        double area = 3.14 * r * r;

        System.out.println("Area of the Circle is : " + area);
    }

}
