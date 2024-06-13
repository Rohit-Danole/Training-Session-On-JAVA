package New_cars;

public class test
{
    public static void main(String args[])
    {
        car c1 = new car();
//        c1.setSpeed(10);
//        c1.setDoors("closed");
//        c1.setDriver("seated");
//        c1.setEngine("on");
        System.out.println(c1.getDoors());
        System.out.println(c1.getDriver());
        System.out.println(c1.getEngine());
        System.out.println(c1.getSpeed());
        System.out.println(c1.run());
    }
}
