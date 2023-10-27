class Department 
{
    private Teacher teacher;
    private String DepartmentName;

    public Department(String DepartmentName)
    {
        this.DepartmentName = DepartmentName;
        
    }
    public String getDepartmentName()
    {
        return this.DepartmentName;
    }
    public void addTeacher(Teacher t)
    {
       
        this.teacher = t;
        System.out.println("Teacher "+ this.teacher.getName()+" has joined "+DepartmentName+" Department ");
    }
    public void TeacherData()
    {
        System.out.println("teacher name: " + this.teacher.getName());
        System.out.println("teacher age: " + this.teacher.getAge());
    }
    public void  Perform()
    {
        System.out.println("department is " + this.DepartmentName);
        teacher.Work();
    }
    public void RemoveTeacher()
    {
        System.out.println("Teacher doesn't work here anymore" );
        this.teacher = null;
    }

}
class Teacher
{
    private String name;
    private int age;
    public Teacher(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    String getName()
    {
        return this.name;
    }

    int getAge()
    {
        return this.age;
    }

    void Work()
    {
        System.out.println("teacher is working");
    }
}
public class Aggrigation
{
    public static void main(String[] args)
    {
        Teacher t1 = new Teacher("divakar",56);

        Department d1 = new Department("mathematics");
        Department d2 = new Department("Engineering");

        d1.addTeacher(t1);
        d2.addTeacher(t1);

        d1.getDepartmentName();
        d1.TeacherData();
        d1.Perform();
        d1.RemoveTeacher();

        d2.getDepartmentName();
        d2.TeacherData();
        d2.Perform();
        d2.RemoveTeacher();



        

    }
}