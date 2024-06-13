package OOPS;

public class Person {
    public static void main(String args[]) {
        //NewPerson per = new NewPerson();
        //per.name = "Ajay";
        //System.out.println("Age " + per.age + " \n" + "Name " + per.name);
        //System.out.println(NewPerson.count);
        //per.walk(3);
        //per.eat();
        NewPerson per1 = new NewPerson(21,"Rohit");
    }

    public static class NewPerson
    {
        int age;
        String name;
        static int count = 0;

        NewPerson(int age,String name)
        {
            this();
            this.age=age;
            this.name=name;
            System.out.println("New Person age: " + age);
            System.out.println("New Person name: " + name);
        }

//        void walk( int step)
//        {
//            System.out.println("Person is Walking" +step);
//        }
//        void eat()
//        {
//            System.out.println("Person is Eating");
//        }
        NewPerson()
        {
            count++;
            System.out.println("Person Constructor");

        }
    }
}
