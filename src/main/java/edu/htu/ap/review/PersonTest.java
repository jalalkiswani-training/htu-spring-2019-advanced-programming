package edu.htu.ap.review;

public class PersonTest {
	public static void main(String[] args) {
		//Person: datatype - "Class" : Same as "building blueprints" 
		//p: reference points to an object
		//new Person(); construction of new "Object", same as "Actual Building"
		Person p=new Person();//default const.
		p.name="Ata";
		p.talk();
		
		Person p2=new Person();
		p2.name="Essa";
		p2.talk();
		
		Person p3=new Person("Kamal");
		p3.talk();
	}
}
