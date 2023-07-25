import java.util.Scanner;
public class Hex2Dec {

   public static void main(String [] args){
          Scanner input= new Scanner(System.in);
          System.out.print("ENTER YOUR HEX VALUE;");
          String hex=input.nextLine().toUpperCase();
          int value=0,dec=0;
          int n=hex.length()-1;
       for (int i=0;i<=n;i++){
           char x=hex.charAt(i);
           if(x>='A'&& x<='F')
             value=(int)(x) - 55;
           else
             value=(int)(x)-48;
           dec+=value*(Math.pow(16,(n-i)));
        }
       System.out.println(dec);
    }
}



