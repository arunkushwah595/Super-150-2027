package Lec28;

public class Student {

	String name;
	int age;

	public void Intro_Yourself() {

		System.out.println("My Name is " + name + " and age is " + age);

	}

	public void SayHey(String name) {

		System.out.println(this.name + " Say hello " + name);

	}
}
