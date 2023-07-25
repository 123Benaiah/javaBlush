public class InitialiseArrRandom {
    
    public static void main (String [] args){
      // Scanner input=new Scanner(System.in);
       int [][]arr=new int[3][2];
       System.out.print("number of rows;"+ arr.length + "\nnumber of columns;"+ arr[0].length+"\n" );
      for(int row=0; row<arr.length; row++)
          for (int col=0;col<arr[0].length;col++)
              arr[row][col]=(int)(Math.random()*100);
         System.out.println("this is the other number found in the array 'arr';"+arr[2][1]);
    

    }
}