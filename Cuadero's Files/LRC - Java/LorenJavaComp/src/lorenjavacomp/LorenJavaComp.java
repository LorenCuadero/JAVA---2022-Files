package lorenjavacomp;
import lorencalculator.*;
import IO.*;
import OP.*;
import lorenjavainheritance.Employee;
import lorenjavainheritance.*;
import lorencalculator.*;
import lorenmultiinheritance.*;
public class LorenJavaComp {
//
    public static void main(String[] args) {
        LorenCompConstructor c = new  LorenCompConstructor();
        LorenCompConstructor b = new  LorenCompConstructor("Name: Lorenfe Cuadero                                                Course: C CT 1 ");
        LorenCompConstructor t = new  LorenCompConstructor("Teacher: Mr. Christian V. Maderazo                                   Date: March 27,2022");
        LorenCompConstructor g = new  LorenCompConstructor("\nHere are the Following: ");
        ConsoleInput ci = new ConsoleInput();
        ConsoleOutput co = new ConsoleOutput();
        LorenCalculator lcc = new LorenCalculator();
        Operator1 o = new Operator1();
        PassbyRef p = new PassbyRef();
        PassbyRef2 p1 = new PassbyRef2();
        Employee e = new Employee();
        Engineer ee = new Engineer();
//
////      1. Java Calculator
        c.calculator();
        c.endline();
        lcc.mathcalc();
//     
////      2. Java Operators
        c.operator();
        c.endline();
        o.Opss();
//
////      3. Java Passing by Value
        c.passbyvalue();
        c.endline();
        System.out.println("\nEnter First Number: ");
        double num1 = ci.getNum();
        System.out.println("Enter Second Number: ");
        double num2 = ci.getNum();
        double result = lcc.addition(num1,num2);
        System.out.println("Sum: " + result);

////      3. Java Passing by Reference
        c.passbyreference();
        c.endline();
        System.out.println("Please enter two integers to find it's difference: ");
        double nummy = ci.getNum();
        double nummo = ci.getNum();

        p1.num1 = nummy;
        p1.num2 = nummo;

        System.out.println("Difference: ");
        double result1 = p.difference(p1);
        co.show(result1);    
//        
////      4. Inheritance
////      ( SINGLE )
        c.inheritance();
        c.endline();
        c.inheritance1();
        e.inherit();
//
////      ( MULTILEVEL )
        c.inheritance2(); 
        c.endline();
        ee.manager();
        ee.employee();
        ee.engineer();

//        
//        
//        
//        
    
        

    }
}

