package Interface_Code;

public class VIVO implements Phone
{

    @Override
    public String processor() {
        return "VIVO Processor";
    }

    @Override
    public String os() {
        return "VIVO OS";
    }

    @Override
    public int spaceInGB() {
        return 10;
    }
}
