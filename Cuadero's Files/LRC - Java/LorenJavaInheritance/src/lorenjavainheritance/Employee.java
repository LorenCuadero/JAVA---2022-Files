package lorenjavainheritance;
import IO.*;
public class Employee {
    public String name = "Employees Salary";
    
    public String getDetails()
    {
       return(name);
    }
    public static void inherit () {
       Manager m = new Manager();
       ConsoleInput i = new ConsoleInput();
       ConsoleOutput o = new ConsoleOutput();

       System.out.println((m.getDetails() + "\nPlease enter the regular salary: "));
       double a1 = i.getNum();
       System.out.println("Please enter the additional amount of salary: ");
       double a2 = i.getNum();
       double result = m.salary(a1, a2);
       System.out.println("Total Salary: " + result);
       
    }
    
}

