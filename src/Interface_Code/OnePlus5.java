package Interface_Code;

public class OnePlus5 implements Phone
{

    @Override
    public String processor() {
        return "OnePlus Processor";
    }

    @Override
    public String os() {
        return "OnePlus OS";
    }

    @Override
    public int spaceInGB() {
        return 10;
    }
}
