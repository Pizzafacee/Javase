public class Cylinder implements C {
    double radius;
    double height;
    String color;

    public Cylinder(double radius) {


        this.radius = radius;


    }

    @Override
    public void setColor(String c) {

        this.color = c;

    }

    @Override
    public double area() {
        return (this.radius * this.radius * PI);
    }

    @Override
    public void volume() {
        System.out.println("圆柱体的底面积为" + this.area());
    }
}





