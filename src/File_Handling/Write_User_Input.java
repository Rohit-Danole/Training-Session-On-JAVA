package File_Handling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Write_User_Input
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++)
        {
            String str = br.readLine();
            String num[] = br.readLine().split(" ");
            int num1 = Integer.parseInt(num[0]);
            int num2 = Integer.parseInt(num[1]);
        }
    }

}
