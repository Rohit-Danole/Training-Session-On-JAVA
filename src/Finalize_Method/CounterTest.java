package Finalize_Method;

public class CounterTest {
    public static int count;

    public CounterTest() {
        count++;
    }

    public static void main(String args[]) {
        CounterTest ob1 = new CounterTest();
        System.out.println("Number Of Objects : " + CounterTest.count);
        CounterTest ob2 = new CounterTest();
        System.out.println("Number Of Objects : " + CounterTest.count);

        Runtime r = Runtime.getRuntime();
        ob1 = null;
        ob2 = null;
        r.gc();
    }
    protected void finalize()
    {
        System.out.println("Program About To Terminate");
        CounterTest.count --;
        System.out.println("Number Of Objects : " + CounterTest.count);
    }
}