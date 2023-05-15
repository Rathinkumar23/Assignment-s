package org.system;

public class Computer extends Desktop {
public void computermodel(){
	System.out.println("DELL");
}
public static void main(String[] args) {
	Computer system=new Computer();
	system.computermodel();
	system.desktopsize();
}
}
