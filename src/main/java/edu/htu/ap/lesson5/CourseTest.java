package edu.htu.ap.lesson5;

public class CourseTest {
	public static void main(String[] args) {
		Course course=new Course();
		course.id=100;
		course.name="Advanced Programming";
		course.credits=3;
		
		System.out.println(course.getInfo());
	}
}
