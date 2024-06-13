package Runtime_Polymorphism;
class Figure{
    double dimension1;
    double dimension2;

    Figure(double x,double y){
        dimension1=x;
        dimension2=y;
    }

    double area() {
        System.out.println("Area of Figure is undefined");
        return 0;
    }
}
class Rectangle extends Figure {
    Rectangle(double x,double y){
        super(x,y);
    }
    double area()
    {	System.out.println("Area of Rectangle:");
        return dimension1*dimension2;
    }
}
class Triangle extends Figure{
    Triangle(double x, double y){
        super(x,y);
    }double area(){
        System.out.println("Area of Triangle:");
        return dimension1*dimension2/2;
    }
}

public class sample {

    public static void main(String[] args) {

        Rectangle r= new Rectangle(5,6);
        //r.area();
        System.out.println(r.area());
        Triangle t1=new Triangle(10,20);
        //t1.area();
        System.out.println(t1.area());





    }

}

