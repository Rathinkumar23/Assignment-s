package week1.day2;

public class FibonacciSeries {
	public static void main(String[] args) {
		int range = 8, firstNum = 0, secNum = 1;
		int sum ;
	    for (int i = 1; i <= range; i++) {
			System.out.println(firstNum );
	      sum = firstNum + secNum;
	      firstNum = secNum;
	      secNum = sum;
	    }	
}
}