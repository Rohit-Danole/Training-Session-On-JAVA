import Interface_Code.IPhone8;
import Interface_Code.OnePlus5;
import Interface_Code.Samsung;
import Interface_Code.VIVO;

public class Hello
{
    public static void main(String[]args)
    {
        OnePlus5 one = new OnePlus5();
        String s = one.os();
        String s1 = one.processor();
        int a = one.spaceInGB();
        System.out.println(a);
        IPhone8 iPhone8 = new IPhone8();
        String s3 = iPhone8.os();
        String s4 = iPhone8.processor();
        int b = iPhone8.spaceInGB();
        System.out.println(b);
        VIVO vivo = new VIVO();
        String s5 = vivo.os();
        String s6 = vivo.processor();
        int c = vivo.spaceInGB();
        System.out.println(c);
        Samsung samsung = new Samsung();
        String s7 = samsung.os();
        String s8 = samsung.processor();
        int d = samsung.spaceInGB();
        System.out.println(d);
    }
}
