package NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
public class NIO_Write_Into_File
{
    public static void main(String args[]) throws IOException
    {
        Path p = Paths.get("dataset/newFile.txt");
        Path donePath = Files.createFile(p);
        String contents = "hey Coding Owl";
        Files.write(donePath, contents.getBytes());
        System.out.println("Done");
    }
}
