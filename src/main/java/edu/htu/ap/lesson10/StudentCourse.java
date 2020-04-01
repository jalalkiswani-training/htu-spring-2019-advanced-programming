package edu.htu.ap.lesson10;

public class StudentCourse {
	Course course;
	int grade;
	int year;
	int semester;

	public StudentCourse(Course course, int grade, int year, int semester) {
		this.course = course;
		this.grade = grade;
		this.year = year;
		this.semester = semester;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

}
