package com.arraylist;

public class Student implements Comparable<Student> {
	
	int st_Id;
	
	String st_Name;
	
	int st_Rank;
	
	public Student(int st_Id,String st_Name,int st_Rank) {
		this.st_Id=st_Id;
		this.st_Name=st_Name;
		this.st_Rank=st_Rank;
		
	}
	
	@Override
	public int compareTo(Student s) {
		
//		return this.st_Id - s.st_Id;
//		return this.st_Name.compareTo(s.st_Name);
		return this.st_Rank - s.st_Rank;
	}

	@Override
	public String toString() {
		return "Student [st_Id=" + st_Id + ", st_Name=" + st_Name + ", st_Rank=" + st_Rank + "]";
	}

	
	

}
