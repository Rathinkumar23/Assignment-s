package week1.day2;

public class FindIntersection {
	public static void main(String[] args) {
		int Arr1[] = {3, 2, 11, 4, 6 , 7};
        int Arr2[] = {1, 2, 8, 4, 9 , 7};
      System.out.println("Intersection of the two arrays ::");
     
      for(int i = 0; i<Arr1.length; i++ )
      {
         for(int j = 0; j<Arr2.length; j++)
         {
            if(Arr1[i]==Arr2[j])
            {
               System.out.println(Arr2[j]);
            }
         }
      }
	}
}
