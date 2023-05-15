package week3.day1;

public class Calculator {
public void add(int x,int y) {
	System.out.println(x+y);
}
public void add(int x,int y,int z) {
	System.out.println(x+y+z);
	}
	public void mutiple(float x,float y)
	{
		System.out.println(x*y);
	}
	public void mutiple(double x,double y) {
		System.out.println(x*y);
	}
	public static void main(String[] args) {
		Calculator obj=new Calculator();
		obj.add(10, 20);
		obj.add(20, 30, 40);
		obj.mutiple(1.5d, 2.5d);
		obj.mutiple(1.8f, 2.5f);
		
		
		
	}

}
