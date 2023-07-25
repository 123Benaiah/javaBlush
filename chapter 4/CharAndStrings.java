
import java.util.Scanner;
public class CharAndStrings{
   public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      System.out.print("enter your desired letter to represent a1;");
     char a1 =input.next().charAt(0);
     
     System.out.print("\"enter your desired letter to represent a2; ");
     char a2=input.next().charAt(0);
     char b='0';
   if((a1<a2)&&(a2!=a1)){
        b =a1;
        a1=a2;
        a2=b;
        System.out.println("the difference of these two letters is ;" + (a1-a2));
         System.out.println("checkout the entered numbers;\n" + "a2;"+(int)(a2) + " \na1;"+(int)(a1));
   } else{
        System.out.println("otherwise " + "a2;"+(int)(a2) + " \na1;"+(int)(a1));
   }
   System.out.println("a1 is small letter="+Character.isUpperCase(a1));
   
   System.out.print("enter a string of choice; ");
   String ty1= input.nextLine();
   
   System.out.print("enter a second string of choice;");
   String ty2=input.next();
   
   
   //using string type methods to write code;
   System.out.println("length of string 1=" +ty1.length()) ;
   System.out.println("letter at #6 position in string 1;" + ty1.charAt(3));
   System.out.println("concate strings ;" + ty1.concat(ty2));
   System.out.println("convert ty1 to uppercase;" + ty1.toUpperCase());
   System.out.println("TY1=TY2;" + ty1.equals(ty2)); 
   System.out.println(ty1.equalsIgnoreCase(ty2));
   }
}
    
