package Lec28;

public class Strudent_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.name = "Kamlesh";
		s.age = 18;
		s.Intro_Yourself();
		Student s1 = new Student();
		s1.name = "Kaju";
		s1.age = 20;
		s1.Intro_Yourself();
		s.SayHey("Raju");
		s1.SayHey("Ajay");
	}

}
