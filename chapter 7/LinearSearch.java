public class LinearSearch{
    //this program seaches for a key 4 and 6;
    public static void main (String [] args){
       int[] arr1={2,4,5,3,5};
        int j= linearSearch(arr1,4);
        int k=linearSearch(arr1,6);
        System.out.println(j);
        System.out.println(k);
    }
    public static int linearSearch(int[] arr1,int key){
      for(int i=0;i<=arr1.length;i++)
          if(key==arr1[1])
              return 1;
      return -1;
    }
}