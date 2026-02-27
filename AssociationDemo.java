class Department
{
    String name;
    public Department(String name) { this.name = name; }
}

class Address
{
    String city;
    public Address(String city) { this.city = city; }
}

class Employee
{
    int id;
    String name;
    Department dept;
    Address addr;
    
    public Employee(int id, String name, Department dept, Address addr)
    {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.addr = addr;
    }
    
    public void display()
    {
        System.out.println("ID: " + id + " | Name: " + name + " | Dept: " + dept.name + " | City: " + addr.city);
    }
}

public class AssociationDemo
{
    public static void main(String args[])
    {
        Department dept = new Department("IT");
        Address addr = new Address("Chennai");
        Employee emp = new Employee(101, "Ravi", dept, addr);
        emp.display();
    }
}
