package File_Handling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Reader
{
    public static void main(String args[])
    {
        try
        {
            File file = new File("upGrad.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while((line = br.readLine()) != null)
            {
                System.out.println(line);
            }
            br.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
