package Cars;

public class Main_Cars
{
    public static void main(String[] args)
    {
        Cars c = new Cars();
        c.setSpeed(12);
        //System.out.println(c.getSpeed());
        c.setDoors("open");
        //System.out.println(c.getDoors());
        c.setDriver("Absent");
        //System.out.println(c.getDriver());
        c.setEngine("On");
        //System.out.println(c.getEngine());
        System.out.println(c.run());

    }
}
