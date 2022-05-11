package Temp3;
// This is complete and concrete as long as there is no abstarct in your code
// Abstract - can also contain a concrete method
// Abstract - ( Semicolon == ;) is used to terminate method without body.
//          - instantiation is not allowed 
//          - the presence of abstract in the class makes the class abstract
//          - using this keyword / method that has no implementation
// ( {}  )  - Curly Braces means the manifestation that there is body
//          - overriding is good technique to be used to call out the method functions

//     In virtue of method definition: you can override in extended form
public abstract class Utility {
    public Utility()
    {}
    
    public int add(int a, int b)
    {
        return (a+b);
    }
    public abstract double subtract(double a, double b);
    // (Public ) access modifier  ,(double) return type  ,,, (double a, double b) parameter type...
    public double multiply(double a, double b)
    {
        return a*b;
    }


}
