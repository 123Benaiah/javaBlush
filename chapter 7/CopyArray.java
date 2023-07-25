public class CopyArray {
    //this program copies an array to another;
    public static void main (String [] args){
        //Scanner input=new Scanner(System.in);
        int[] arr1={2,4,5,3,5};
        int[] arr2=new int[5];
        for (int i=0; i<arr1.length;i++)
       arr2[i]=arr1[i];
        System.out.print(arr2[2]);
    }
}