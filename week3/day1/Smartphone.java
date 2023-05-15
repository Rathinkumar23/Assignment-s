package week3.day1;

public class Smartphone extends Androidphone {
	public void takevideo() {
		System.out.println("Take video from subclass");
	}
	

	public static void main(String[] args) {
		Smartphone obj=new Smartphone();
		obj.takevideo();
	}

}
