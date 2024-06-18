package Interface_Code;

public class IPhone8 implements Phone
{

    @Override
    public String processor() {
        return "IPhone 8 Pro";
    }

    @Override
    public String os() {
        return "IOS";
    }

    @Override
    public int spaceInGB() {
        return 10;
    }
}
