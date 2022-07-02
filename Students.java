package StudentInfo;

public class Students {
	
	public static void main(String [] args)

	{

	Students stud = new Students();
	stud.getStudentInfo();
	stud.getStudentInfo("email is vishnukiran19@gmail.com",7338562209L);
	stud.getStudentInfo(22, "Name is Vishnu");

	}

	public void getStudentInfo()
	{
	System.out.println("Student id is " + 22);
	}

	public void getStudentInfo(int studentid ,String name)

	{
	System.out.println(22);
	System.out.println("Name is Vishnu");


	}

	public void getStudentInfo(String email,long number)
	{
	System.out.println("emai is vishnukiran19@gmail.com");
	System.out.println(7338562209L);
	}

	}


