class Employee
{
 String name;
 int age;
 String role;
 Employee(String name,int age,String role)
 {
    this.name=name;
    this.age=age;
    this.role=role;
 }
 void display()
 {
    System.out.println("NAME:"+name);
    System.out.println("AGE:"+age);
    System.out.println("ROLE:"+role);
 }
} 
public class EmpCon
{
public static void main(String[]args)
{ 
    Employee HR=new Employee("JOHN", 25, "HR");
    Employee IT=new Employee("MARY",27,"IT");
    Employee ACCOUNTS=new Employee("TAKI",23,"ACCOUNTS");
    HR.display();
    IT.display();
    ACCOUNTS.display();
}
}
