package Temp;

public class PassValue {
    public double sum(Values val)
    {   // why there is no instantiation happened ecause you are trying to access a member not a static
        System.out.println(getStatus(1));          // we able to call getStatus.. because sum and getStatus are in the same class
        double a = val.num1;                        // NO need for formality of instantiation
        double b = val.num2;
        return a+b;
    }
    
  String getStatus(int x)
        {
            if (x==0)
            {
                return "Your friend is not instantiated.";
            }
            else
            {
                return "Your friend is instantiated.";
            }
        }

}
