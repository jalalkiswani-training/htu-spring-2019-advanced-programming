package edu.htu.ap.lesson6;

public class PersonTest2 {
	public static void main(String[] args) {
		Person p1=new Person();
		p1.name="Ata";
		p1.age=20;
		p1.weight=150;		
		
		p1.talk();
		//Hello my name is Ata
		p1.sayInfo();
		//My age is :20, and my weight is :150
		
		Person p2=new Person();
		p2.name="Kamal";
		p2.age=25;
		p2.weight=200;
		p2.talk();
		//Hello my name is Kamal
		p1.talk();
		//Hello my name is Ata
		
		Person p3=p1;
		p3.talk();
		//Hello my name is Ata
		
		p3.age=18;
		p1.sayInfo();
		//My age is :18, and my weight is :150
	}
}
