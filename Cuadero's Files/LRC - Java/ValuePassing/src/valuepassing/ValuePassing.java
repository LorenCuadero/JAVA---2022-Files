package valuepassing;
import IO.*;
import ValPass.*;

public class ValuePassing {
    public static void main(String[] args) {
       ConsoleInput ci = new ConsoleInput();
       ConsoleOutput  co = new ConsoleOutput();
       VP2 h = new VP2();
       VP m = new VP();
       
       System.out.println("Please enter two integers to find it's difference: ");
       double nummy = ci.getNum();
       double nummo = ci.getNum();
       
       h.num1 = nummy;
       h.num2 = nummo;
       
        System.out.println("Difference: ");
       double result = m.difference(h);
       co.show(result);    
    }
    
}
// There are 7 classes:
//ValuePassing 
//String
//ConsoleOutPut
//ConsoleInput
//VP
//VP2

//There are 5 reference variables:
// args    or arg 
// ci
// co
// h
// m

// There is only 1 Primitive Data Type/s:
// double

//There are 3 Primitive Variables:
//nummy
//nummo
//result


//The parameter that I used here is a reference variable, so I am passing reference. 
//So my (h) reference value will be recieved in public class vp which contain the val and
// that also represented by VP2 ALSO . 
//Therefore nummy and nummo can ask the a and b and can get its difference already.



