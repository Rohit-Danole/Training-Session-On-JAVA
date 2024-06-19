package File_Handling;

import java.io.File;
import java.io.IOException;
public class upGradTutorials {
    public static void main(String[] args) {
        try
        {
            File file = new File("upGrad.txt");
            if (file.createNewFile())
            {
                System.out.println("File created: " + file.getName());
            } else
            {
                System.out.println("File already exists.");
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}


