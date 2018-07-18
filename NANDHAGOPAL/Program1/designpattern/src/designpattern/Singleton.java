package designpattern;

public class Singleton {

	public static void main(String[] args) {
		Student.getObject().print();

	}

}
class Student
{
	private static Student student=new Student();

	private Student() {
	
	}
	
	public static Student getObject()
	{
		return student;
	}
	public void print()
	{
		System.out.println("Student class"+student);
	}
	
	
}
