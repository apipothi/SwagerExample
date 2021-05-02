package com.swager.example.dao;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


@ApiModel("This is all the attribute of Student MODEL")

public class StudentDAO {

	@ApiModelProperty(notes = "ID should be on 10 length",name="studentid",required = true,value="STUDENT ID")
	int studentid;
	
	@ApiModelProperty(notes = "Studernt Name be on 10 length",name="studentname",required = true,value="STUDENT NAME")
	String studentname;
	
	@ApiModelProperty(notes = "studentphone be on 10 digit",name="studentphone",required = true,value="studentphone PHOBE")
	int studentphone;

	public StudentDAO() {
	}

	public StudentDAO(int studentid, String studentname, int studentphone) {
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
		return "StudentDAO [studentid=" + studentid + ", studentname=" + studentname + ", studentphone=" + studentphone
				+ "]";
	}

}
