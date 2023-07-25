public class OddNum{
    public static void main (String[] args){
      System.out.print("the from 1 to 100 odd numbers are;");
      OddNumbers();
   }
    public static void OddNumbers(){
       for(int i=1;i<=100;i++){
        if (isOdd(i))
         System.out.print(i+",");
       }
    }
    public static boolean isOdd(int i){
      if((i%2)==1)
       return true;
       else
        return false;
     }

}
