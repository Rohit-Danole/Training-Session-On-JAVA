//Program To Create A Directory
package NIO;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class NIO_Create_Directory
{
    public static void main(String args[]) throws IOException
    {
        Path p = Paths.get("dataset");
        if (Files.exists(p))
        {
            System.out.println("File exists");
        }
        else
        {
            Path donePath = Files.createDirectories(p);
            System.out.println("Directory created at " + donePath.toString());
        }
    }
}
