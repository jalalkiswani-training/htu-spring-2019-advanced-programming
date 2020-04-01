package edu.htu.ap.lesson10;

public class Test {
	public static void main(String[] args) {
		Major major=new Major(10,"IT");
		
		Course course1=new Course(101,"Programming",1);
		Course course2=new Course(102,"Advanced Programming",2);
		Course course3=new Course(101,"Data Structure",3);
		
		StudentCourse stdCourse1=new StudentCourse(course1,90,2019,1);
		StudentCourse stdCourse2=new StudentCourse(course2,80,2019,2);
		StudentCourse stdCourse3=new StudentCourse(course3,50,2019,3);
		
		Student student=new Student(103,"Ata");
		student.setMajor(major);
		student.addStudentCourses(stdCourse1,stdCourse2,stdCourse3);
		
		System.out.println(student.getGpa());
	}
}

