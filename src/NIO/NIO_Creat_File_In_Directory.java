//Program To Create A Directory
package NIO;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class NIO_Creat_File_In_Directory
{
    public static void main(String args[]) throws IOException
    {
        Path p = Paths.get("dataset/student.txt");
        if (Files.exists(p))
        {
            System.out.println("File exists");
        }
        else
        {
            Path donePath = Files.createFile(p);
            System.out.println("Directory created at " + donePath.toString());
        }
    }
}
