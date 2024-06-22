package Stream;

import java.io.*;

public class Test
{
    public static void main(String[] args)
    {
        BufferedReader br = null;
        FileOutputStream fos = null;
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter Data : ");
            String data = br.readLine();
            fos = new FileOutputStream("/C://Users//rohit//Desktop//JAVA Training//demo//upGrad.txt/");
            byte[] b = data.getBytes();
            fos.write(b);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally {
            try
            {
                br.close();
                fos.close();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
