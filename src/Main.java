//Create a class Student
class Student
{
    //instance variable
    private String name;
    private String email;
    private int age;
    //create a getter setter method
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getEmail()
    {
        return email;
    }
    public void setEmail(String email)
    {
        this.email=email;
    }
    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age=age;
    }

}
//Create a main class and create an object of Student class and set the value of all instance variable
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Hinal");
        s1.setEmail("hinal.p@simformsolutions.com");
        s1.setAge(23);

        //Display  the value of all instance variable
        System.out.println("Student Details ");
        System.out.println("Name of Student :" +s1.getName());
        System.out.println("Email of Student :" +s1.getEmail());
        System.out.println("Age of the Student :" +s1.getAge());
    }
}