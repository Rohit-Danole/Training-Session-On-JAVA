package File_Handling;

import java.io.*;
//This Program Is Used to delete the existing data and write into that file
public class Write_Into_File
{
    public static void main(String args[])
    {
        try {
            File file = new File("upGrad.txt");
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("Hello World");
            bw.newLine();
            bw.write("This Is Sample Text");

            bw.close();
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }
}
