package lorenjavainheritance;

public class Manager extends Employee {
        public double salary (double a, double b)
        {
            return(a+b);
        }
        public double bonus (double a, double b)
        {
            return(a*b);
        }
        public double deduct (double a, double b){
            return(a-b);
        }
}
