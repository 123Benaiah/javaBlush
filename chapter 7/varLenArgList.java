public class varLenArgList {
    //this program shows the use of variable length Argument lists;
    public static void main (String [] args){
        Scanner input=new Scanner(System.in);
         System.out.println(varLenArg(2,2,4,78,980));
    }
    public static int varLenArg(int...myList){
        int total=0;
        for (int i:myList)
           total=total+i;
          //myList[i]= (int)(Math.random()*1);
          return total;
    }
}