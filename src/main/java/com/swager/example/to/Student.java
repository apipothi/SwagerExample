package com.swager.example.to;

public class Student {

	int studentid;
	String studentname;
	int studentphone;

	public Student() {
	}

	public Student(int studentid, String studentname, int studentphone) {
		super();
		this.studentid = studentid;
		this.studentname = studentname;
		this.studentphone = studentphone;
	}

	public int getStudentid() {
		return studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public int getStudentphone() {
		return studentphone;
	}

	public void setStudentphone(int studentphone) {
		this.studentphone = studentphone;
	}

	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", studentname=" + studentname + ", studentphone=" + studentphone
				+ "]";
	}

}
