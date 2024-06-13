package Super_Keyword;
    class Base
    {
        int a,b;
        void getData(int x,int y)
        {
            a = x;
            b = y;
        }
        void disp()
        {
            System.out.println("Base Class " +a +" " +b);
        }
    }
    class Derived extends Base
    {
        int a,b;
        void assignData(int x,int y)
        {
            a = x;
            b = y;
        }
        void disp()
        {
            super.disp();
            System.out.println("Derived Class " +a +" " +b);
            int total = super.a + super.b+a+b;
            System.out.println("Total is " + total);
        }
    }
    public class Super_Test
    {
        public static void main(String[] args)
        {
            Derived d = new Derived();
            d.getData(4,5);
            d.assignData(6,7);
            d.disp();
    }
}