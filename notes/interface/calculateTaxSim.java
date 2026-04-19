interface Taxable
{
    void calculateTax();
}

class Employee
{
    String name;
    double salary;

    Employee(String name, double salary)
    {
        this.name = name;
        this.salary = salary;
    }
}

class Manager extends Employee implements Taxable
{
    double tax;

    Manager(String name, double salary)
    {
        super(name, salary);
    }

    public void calculateTax()
    {
        if (salary < 20000.0)
        {
            tax = 0.0;
        }
        else if (salary >= 20000.0 && salary < 50000.0)
        {
            tax = salary * 0.1;
        }
        else
        {
            tax = salary * 0.23;
        }

        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Tax Payable: " + tax);
    }
}

public class calculateTaxSim
{
    public static void main(String args[])
    {
        Manager e1 = new Manager("Rahul", 45000);
        e1.calculateTax();
    }
}