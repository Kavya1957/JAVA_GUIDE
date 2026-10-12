public class Emp {
    

 String name;
 int age;
 String role;
 
 void display()
 {
    System.out.println("NAME:"+name);
    System.out.println("AGE:"+age);
    System.out.println("ROLE:"+role);
 }
} 
public class EmpNonCon
{
public static void main(String[]args)
{ 
    Employee HR=new Employee();
    Employee IT=new Employee();
    Employee ACCOUNTS=new Employee();
    HR.name="JOHN";
    HR.age=25;
    HR.role="HR";
    HR.display();
    IT.name="MARY";
    IT.age=28;
    IT.role="IT";
    IT.display();
    ACCOUNTS.name="TAKI";
    ACCOUNTS.age=30;
    ACCOUNTS.role="ACCOUNTS";
    ACCOUNTS.display();
}
}

