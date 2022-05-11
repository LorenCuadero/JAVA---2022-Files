package lorenpolymorphism;
public class LorenPolymorphism {

    public static void main(String[] args) {

            Employee e = new Employee();
            Employee g = new Manager();
            Employee h = new Engineer();

            e.doSomething();     
            g.doSomething();
            h.doSomething();     

// Checking for any other type of Employee
           System.out.println("\nExamine the process of each\nby cheking if it uses instanceof: Manager, Engineer or does not. \n");
       System.out.println("____________________________________________________________________________\n");
           System.out.println("Examine  the insatanceof the process of Employee:");
          if ( e instanceof Manager){
            System.out.println(" Contains instanceof Manager\n");

            } else if (e instanceof Engineer){
            System.out.println(" Contains instanceof Engineer\n");

            }
           else{
            System.out.println(" Does not contain instanceof! \n");

            }
       System.out.println("____________________________________________________________________________\n");

// Checking for any other type of Manager
           System.out.println("Examine  the insatanceof the process of Manager:");

            if ( g instanceof Employee){
                        System.out.println(" Contains instanceof Employee \n");

                        } else if (g instanceof Engineer){
                        System.out.println(" Contains instanceof Engineer \n ");

                        }
                       else{
                        System.out.println(" Does not contain instanceof!\n");

                        }
       System.out.println("____________________________________________________________________________\n");

// Checking for any other type of Engineer
           System.out.println("Examine  the insatanceof the  process of Engineer:");
            if ( h instanceof Manager){
                        System.out.println(" Contains instanceof Manager \n");

                        } else if (h instanceof Employee){
                        System.out.println(" Contains instanceof Employee \n");

                        }
                       else{
                        System.out.println(" Does not contain instanceof! \n");



  }
}
      }

