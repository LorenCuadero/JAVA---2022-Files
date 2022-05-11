package lorenoperator;
import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
    int marksObtained, passingMarks;
   
    passingMarks = 40;
   
    Scanner input = new Scanner(System.in);
   
     System.out.println("Passing Mark Testing");
    System.out.println("Input your marks: ");
   
    marksObtained = input.nextInt();
   
    if (marksObtained >= passingMarks) {
      System.out.println("You passed the exam.");
    }
    else {
      System.out.println("Unfortunately, you failed to pass the exam.");
    }
    }
}
