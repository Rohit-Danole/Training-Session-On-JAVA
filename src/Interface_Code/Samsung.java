package Interface_Code;

public class Samsung implements Phone
{

    @Override
    public String processor() {
        return "Samsung Processor";
    }

    @Override
    public String os() {
        return "Samsung OS";
    }

    @Override
    public int spaceInGB() {
        return 10;
    }
}
