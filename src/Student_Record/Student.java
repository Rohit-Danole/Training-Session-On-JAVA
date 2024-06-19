package Student_Record;

public class Student
{
    private int id;
    private String firstname;
    private String lastname;

    public Student(int id, String firstname, String lastname)
    {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }
    public String toString()
    {
        return "Student [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + "]";
    }
}



