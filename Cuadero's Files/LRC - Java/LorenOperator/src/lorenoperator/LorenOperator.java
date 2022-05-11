package lorenoperator;
import Operator.MyOperator;
public class LorenOperator {

    public static void main(String[] args) {
 
       int x = 5;
       int y = 7;
       int z = 35, result;
       int num = 7, result1;
       int num1 = -7;
       int num2 = 35;
       int num3 = 36;
       int var = 7;
       int num5 = 10;

       System.out.println("Great day, Math Lovers! \n Here are some mathematical problems that has been solve easily with JAVA Operators: ");
       System.out.println("\n Let: \n  x = 5; \n  y = 7;  \n  z = 35;  \n num = 7;\n num1 = -7; \n num2 = 35;\n" +
               " num3 = 36;\n" +
               " var = 7;\n" +
               " num5 = 10; \n");

       System.out.println("Increment the value of x:");
       ++x;
       System.out.println(x);
       // decrement using --
       System.out.println("Decrement the value of x:");
       --x;
       System.out.println(x);

       System.out.println("Represent the positive value of x: ");
       // Using the unary plus
       int a=+5;
       int b= -a;
       System.out.println(a);

       System.out.println("Represent the negative value of x: ");
       // Using the unary minus
       System.out.println(b);

       System.out.println("Represent the Bitwise Complement of z:");
       // bitwise complement of 35
       result = ~z;
       System.out.println(result);

       System.out.println("Represent the Logical Not of (x > y): ");
       System.out.println(!(x < y));

       System.out.println("Get the product of x and y:");
       System.out.println(x*y);

       System.out.println("Get the quotient of y and x:");
       System.out.println(z/y);

       System.out.println("Get the modulo of x and y:");
       System.out.println(x%y);

       System.out.println("Get the sum of x and y:");
       System.out.println(x+y);

       System.out.println("Get the difference of x and y:");
       System.out.println(x-y);

       System.out.println("Represent the Bitwise Complement of number using Left Shift: ");
       int number = num << 2;
       System.out.println(number);

       System.out.println("Represent num using Right Shift: ");
       System.out.println(num >> 2);

       System.out.println("Represent num using UnSigned Right Shift: ");
       System.out.println(num1 >>> 2);

       System.out.println("Represent Relational Operator of (x > y): ");
       System.out.println(x>y);

       System.out.println("Represent Relational Operator of (y < z): ");
       System.out.println(y<z);

       System.out.println("Represent Relational Operator of (x >= y): ");
       System.out.println(x>=y);

       System.out.println("Represent Relational Operator of (y <= z): ");
       System.out.println(y<=z);

       System.out.println("Represent Relational Operator of (y == z): ");
       System.out.println(y==z);

       System.out.println("Represent Relational Operator of (y != z): ");
       System.out.println(y!=z);

       System.out.println("Represent Bitwise AND of num & num1: ");
       result1 = num & num1;
       System.out.println(result1);

       System.out.println("Represent Bitwise XOR of num & num1: ");
       result1 = num ^ num1;
       System.out.println(result1);

       System.out.println("Represent Bitwise OR of num & num1: ");
       result1 = num | num1;
       System.out.println(result1);

       System.out.println("Represent Logical AND of (x > y) and (y < z): ");
       System.out.println((x > y) && (y<z));

       System.out.println("Represent Logical AND of (x < y) and (y < z) : ");
       System.out.println((x > y) || (y<z));

       System.out.println("Get the product of var and x using *= :");
       System.out.println(var *= x);

       System.out.println("Get the modulo of var and x using %= :");
       System.out.println(var %= x);

       // var here is equal to 0 already but x remains the value of 5 //
       System.out.println("Get the sum of var and x using += :");
       System.out.println(var += x);

       // var here is equal to 0 already but x remains the value of 5 //
       System.out.println("Get the difference of var and x using -= :");
       System.out.println(var -= x);

       System.out.println("Represent the Bitwise Complement of number using <<= : ");
       int number5 = num5 <<= 2;
       System.out.println(number);

       System.out.println("Represent num using >>= : ");
       System.out.println(num5 >>= 2);

       System.out.println("Represent num using >>>= : ");
       System.out.println(num5 >>>= 2);

       System.out.println("Represent num & num1 using &= : ");
       result1 = num &= num1;
       System.out.println(result1);

       System.out.println("Represent num & num1 using ^= : ");
       result1 = num ^= num1;
       System.out.println(result1);

       System.out.println("Represent num & num1 using |= : ");
       result1 = num |= num1;
       System.out.println(result1);

    System.out.println("Thank you and that's all!!! ");



    }
    
}


