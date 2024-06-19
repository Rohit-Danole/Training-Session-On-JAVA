package NIO;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
public class NIO_Read_File
{
    public static void main(String args[]) throws IOException
    {
        Path p = Paths.get("dataset/newFile.txt");
        List<String> data = Files.readAllLines(p);
        for (String s:data)
        {
            System.out.println(s);
        }
    }
}



