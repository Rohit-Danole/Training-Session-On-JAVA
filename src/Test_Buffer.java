import java.io.IOException;
import java.util.TreeSet;

public class Test_Buffer
{
    public static void main(String args[])
    {
        StringBuffer sb1 = new StringBuffer("AAA");
        StringBuffer sb2 = new StringBuffer("BBBBB");
        StringBuffer sb3 = new StringBuffer("C");
        StringBuffer sb4 = new StringBuffer("DDDD");
        StringBuffer sb5 = new StringBuffer("EE");
        TreeSet<StringBuffer> ts = new TreeSet<StringBuffer>((s1,s2)->((StringBuffer)s1).length()-((StringBuffer)s2).length());
        ts.add(sb1);
        ts.add(sb2);
        ts.add(sb3);
        ts.add(sb4);
        ts.add(sb5);
        System.out.println(ts);
    }
}
