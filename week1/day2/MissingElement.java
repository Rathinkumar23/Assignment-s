package week1.day2;
import java.util.Arrays;
public class MissingElement {
	public static void main(String[] args) {
		int[] arr = {1,2,4,5,7,6,8};
		Arrays.sort(arr);
	    System.out.println("sorted Array ::"+Arrays.toString(arr));
	    for (int i=1; i<= arr.length+1;i++)
	    	if(i!=arr[i-1]) {
	    		System.out.println("The missing number is "+i);
	    		break;
	    	}
	}
}
