import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Student m=new Student();
		m.input();
		m.display();
	}
}
class Student{
    int roll;
	String name;
	float marks;
	void input()
	{
	    Scanner sc=new Scanner(System.in);
	    roll=sc.nextInt();
	    name=sc.next();
	    marks=sc.nextFloat();
	}
	void display()
	{
	    System.out.println("rollno="+roll);
	    System.out.println("name="+name);
	    System.out.println("marks="+marks);
	}
}