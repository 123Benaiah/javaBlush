import java.util.Scanner;
public class Lastlecture4{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // program that uses inedxOf
        String mes="the boy runs so quickly";
   String ben="nabsta";
   String bad,nab,gk;
   bad="sample";
   nab="runs";
   gk="so";
   //conversion from Strings to number
   String gbi="12";
   String abi="13.34";
    int value1 = Integer.parseInt(gbi);
    double Value2 = Double.parseDouble(abi);
    System.out.println( value1);
    System.out.println("is danger;" + mes.substring(13));
    System.out.println("substring 1;" + mes.substring(4,13) +"\t" + mes.lastIndexOf(nab));
   }
}