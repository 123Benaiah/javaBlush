public class ForEachLoop {
    //this program shows a for each loop. printing numbers at each position in the array
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		int[] arr1 = {2,4,5,3,5};
		int x = 0;
		// "i" is holding the value of all numbers in the array'
		for (int i:arr1) 
		System.out.println(i + "is at index; " + x++);
    }
}
