
package lorenjava;
import lorencalculator.LorenCalculator;
import IO.ConsoleInput;
import java.util.Scanner;
import OP.Operator1;
public class OpsClass {
 public static void Ops (){
        
        System.out.println("Grade Marks Checker: "); 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks obtained: ");
         int num=sc.nextInt();
         //Determine the grades from the marks obtained
          if(num<50)
          {  
                System.out.println("You failed, study hard next time.");  
          }  
          else if(num>=50 && num<60)
          {  
                System.out.println("You obtained D grade, study more next time.");  
          }  
          else if(num>=60 && num<70)
          {  
               System.out.println("You obtained C grade, make study as a habit.");  
          }  
          else if(num>=70 && num<80)
          {  
               System.out.println("You obtained B grade, keep on studying.");  
          }  
          else if(num>=80 && num<90)
          {  
              System.out.println("You obtained A grade, keep it up!");  
          }
          else if(num>=90 && num<100)
          {  
              System.out.println("Great! You obtained A+ grade");  
          }
          else
          {  
             System.out.println("Invalid!");  
          }  
                    LorenCalculator c = new LorenCalculator();
                   ConsoleInput ci = new ConsoleInput ();
                   Operator1 d = new Operator1();
                   
                   System.out.println("\nEnter your grade to increment: ");
                   double f1 = ci.getNum();
                   double result6 = d.increment(f1);
                   System.out.println("Your grade has been incremented "+ result6);    
                   System.out.println("\nEnter your grade to decrement: ");
                   double f2 = ci.getNum();
                   double result7 = d.decrement(f2);
                   System.out.println("Your grade has been decremented "+ result7);   }
}
