package abstraction;

public class Automation extends MultipleLanguage implements Language ,TestTool{
	public void java() {
	System.out.println("It comes for interface");
	}
	public void selenium() {
	System.out.println("It comes for interface");	
	}
public static void main(String[] args) {
	Automation obj=new Automation();
	obj.java();
	obj.selenium();
	obj.python();
	obj.ruby();
}
}
