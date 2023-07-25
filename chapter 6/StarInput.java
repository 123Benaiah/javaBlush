import java.util.Scanner;
public class StarInput{
   public static void main(String [] args){
      Scanner input=new Scanner(System.in);
      System.out.print("input your number to create stars of pyramid;");   
      int n=input.nextInt();
      for (int i=1;i<=n;i++) {
          for(int j=1;j<=n-i;j++)
              System.out.print(" ");
          for(int j=1;j<=i;j++)
              System.out.print("n");
          for(int j=n+1;j<=2*n-2*i;j++)
              System.out.print("n");
          
          
          System.out.println(" ");
      }
   }
   
}



