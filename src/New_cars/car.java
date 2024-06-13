package New_cars;

public class car
{
    private String Doors;
    private String Engine;
    private String Driver;
    private int Speed;

    public car()
    {
        Doors = "opened";
        Engine = "off";
        Driver = "Absent";
        Speed = 0;
    }

    public void setSpeed(int speed)
    {
        Speed = speed;
    }
    public int getSpeed()
    {
        return Speed;
    }

    public String getDoors() {
        return Doors;
    }

    public String getEngine() {
        return Engine;
    }

    public String getDriver() {
        return Driver;
    }

    public void setDoors(String doors) {
        this.Doors = doors;
    }

    public void setEngine(String engine) {
        this.Engine = engine;
    }

    public void setDriver(String driver) {
        this.Driver = driver;
    }
    public String run()
    {
        if (Doors.equals("closed") && Driver.equals("seated") && Engine.equals("on") && Speed > 0)
        {
            return "Running";
        }
        else
        {
            return "Stop";
        }
    }
}

