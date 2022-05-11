package Temp2;

public class Salary {
//     public String salaryType;
//
//   public Salary(String salaryType)
//    {
//        this.salaryType = salaryType;           // used to define the local variable
//    }
//    public Salary()
//    {
//    }
//   public float getSalary()
//    {
//        if (salaryType == "withAbsences")
//        {
//            return (10400 - 3000);
//        }
//        else if (salaryType == "withOvertime")
//        {
//            return (10400 + 3000);
//        }
//        else
//        {
//            return 10400;
//        }
//    }

// jAVA HAS TWO TYPES OF MEMORY

    /*   HEAP AND STACK
     */
    public static int value = 123456;

    /* didto sa stack memory ... nag assign ka sa value nga 14344
                                         and if you instantiate THE CLASS SALARY , you are loading it to the heap memory  then the class name is Salary */

    // naa sd didto si getIntValue
    public static int getIntValue() {
        return 14344;
    }
}
