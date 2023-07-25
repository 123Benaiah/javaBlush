import java.util.Scanner;

public class TheMathClass{

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String p="   input the number of choice to be calculated in the program;       " ;
         // trim out end spaces of string p
        
        
        System.out.print(p.trim());
        int a=input.nextInt();
        
       
        System.out.println(a+ " was entered.");
        
        //converting value to radian
        double b = Math.toRadians(a);
        switch (a){
            case 7:
                System.out.println("  \b\bthe sine of \f\b \r" +b +" is  \b" +Math.sin(b)+"    ");
            break;
            case 6:
                System.out.println("the int round of pie; " + Math.ceil(Math.PI));
               break;
            case 30:
                System.out.println("the sin of 30; " + Math.sin(b));
              break;
            case 40:
                System.out.println( "Math.rint(2.3); \b"+Math.rint(2.3) + " Math.rint(20.5);"+ Math.rint(20.5));
                break;
            default:
                System.out.print(Math.floor(2.9));
                
                
                
                
            
        }
  
        
    }
    
}
