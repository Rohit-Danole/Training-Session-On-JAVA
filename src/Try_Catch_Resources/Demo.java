package Try_Catch_Resources;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
public class Demo
{
    public static void main(String[] args)
    {
        try
                (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                FileOutputStream fos = new FileOutputStream("C:/Users/rohit/Desktop/JAVA Training/demo/upGrad.txt");
        )
        {
            System.out.print("Enter Data :");
            String data = br.readLine();
            byte[] b = data.getBytes();
            fos.write(b);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}


















