package Employee_Project;

class Employee
{
    private String name;
    private int id;
    private double salary;

    Employee(String name, int id, double salary)
    {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public String getName()
    {
        return name;
    }
    public int getId()
    {
        return id;
    }
    public double getSalary()
    {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void displayDetail()
    {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);

    }

}
class Manager extends Employee
{
    private String department;
    public Manager(String name, int id, double salary, String department)
    {
        super(name, id, salary);
        this.department = department;

    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void displayDetail()
    {
        super.displayDetail();
        System.out.println("Department Name: " + department);

    }

}
class Developer extends Employee
{
    private String programmingLanguage;
    public Developer(String name, int id, double salary, String programmingLanguage)
    {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }
    public void displayDetail()
    {
        super.displayDetail();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}
public class Main
{
    public static void main(String[] args)
    {
        Developer d = new Developer("Rohit",29,10000,"JAVA");
        d.displayDetail();
        Manager m = new Manager("demo",22,10000,"Finance");
        m.displayDetail();
    }
}
