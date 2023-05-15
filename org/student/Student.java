package org.student;

import org.department.Department;

public class Student extends Department  {
public void studname() {
	System.out.println("RATHIN KUMAR");
}
public void studdept() {
	System.out.println("BCA");
}
public void studid() {
	System.out.println("16273131");
}
public static void main(String[] args) {
	Student colg= new Student();
	colg.collegename();
	colg.collegecode();
	colg.collegerank();
	colg.studname();
	colg.studid();
	colg.studdept();
	colg.departname();
	
}
}
