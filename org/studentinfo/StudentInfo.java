package org.studentinfo;

public class StudentInfo {
	public void getstudentinfo(int studno) {
		System.out.println(studno);
	}
	public void getstudentinfo(int stuno, String name) {
		System.out.println(stuno + name);
	}
	public void getstudentinfo(String email, long phone) {
		System.out.println(email + phone);
	}
	
	public static void main(String[] args) {
		StudentInfo obj=new StudentInfo();
		obj.getstudentinfo(16273131);
		obj.getstudentinfo(16273131 , "Rathin");
		obj.getstudentinfo("rathin@gmail.com", 9898988585L);
		
	}
	

}
