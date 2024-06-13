package Arrays;

public class Copy_Elements_From_Array
{
    public static void main(String args[])
    {
        //Create and initialize an array of integers
        int[] source = {100,200,300};
        //Create an integer array with 3 elements
        int[] dest = new int[3];
        //Copying an element from source to destination
        System.arraycopy(source,0,dest,0,source.length);
        for (int i=0;i<dest.length;i++)
        {
            System.out.println("Element at index " + i + " is " + dest[i]);
        }
    }
}
