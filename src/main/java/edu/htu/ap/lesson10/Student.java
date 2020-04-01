package edu.htu.ap.lesson10;

import java.util.ArrayList;

public class Student {
	int id;
	String fullName;
	Major major;
	ArrayList<StudentCourse> studentCourses = new ArrayList();

	public Student(int id, String name) {
		this.id = id;
		fullName = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Major getMajor() {
		return major;
	}

	public void setMajor(Major major) {
		this.major = major;
	}

	public ArrayList<StudentCourse> getStudentCourses() {
		return studentCourses;
	}

	public void setStudentCourses(ArrayList<StudentCourse> studentCourses) {
		this.studentCourses = studentCourses;
	}

	public double getGpa() {
		int sum=0;
		int totalCredits=0;
		for(int i=0;i<studentCourses.size();i++) {
			StudentCourse course=studentCourses.get(i);
			int credit=course.getCourse().getCredits();
			totalCredits+=credit;
			sum+=course.getGrade() * credit;			
		}
		
		return sum/totalCredits;
	}

	//... means var args : same as array
	public void addStudentCourses(StudentCourse ... course) {
		for (int i = 0; i < course.length; i++) {
			studentCourses.add(course[i]);
		}
	}

}
