
public class PrimeNumbers {
 
   public static void main(String [] args){
     System.out.println("prime  numbers from 1 to 100 are;"); 
     primeNumbers();
   }
   public static void primeNumbers(){
       int count=0;
       int numPerLin=7;
      for(int i=2;i<=100;i++) {
         if(isPrime(i)){
             count++;
             if(count%numPerLin==0)
                 System.out.println(i+"\t");
             else
                 System.out.print(i+"\t");
      }
   }
   }
      public static boolean isPrime(int i){
          for(int j=2;j<i;j++){
             
            if ((i%j==0)){
               return false;
            }
          }
         return true; 
      }
}


