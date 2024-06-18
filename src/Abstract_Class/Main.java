package Abstract_Class;

    abstract class Figure {
        double dimension1;
        double dimension2;

        Figure(double x, double y) {
            dimension1 = x;
            dimension2 = y;
        }

        abstract double area();
    }

    class Rectangle extends Figure
    {
        Rectangle(double x,double y)
        {
            super(x,y);
        }
        double area()
        {	System.out.println("Area of Rectangle:");
            return dimension1*dimension2;
        }
    }
    class Triangle extends Figure
    {
        Triangle(double x, double y)
        {
            super(x,y);
        }
        double area()
        {
            System.out.println("Area of Triangle:");
            return dimension1*dimension2/2;
        }
    }

    public class Main {

        public static void main(String[] args)
        {
            Rectangle r= new Rectangle(5,6);
            System.out.println(r.area());
            Triangle t1=new Triangle(10,20);
            System.out.println(t1.area());
        }

    }

