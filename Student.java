package org.student;

import org.department.Department;

public class Student extends Department {

public static void main(String [] args)
{
Student stu=new Student();
int collegecode = stu.collegecode();
System.out.println("college code is" + collegecode);
stu.collegename();
int collegerank = stu.collegerank();
System.out.println("collegerank is" + collegerank);
stu.deptName();
stu.studentDept();
stu.studentName();
int studentid = stu.studentid();
System.out.println("studentid is " + studentid);
}

public void studentName()
{
System.out.println("Student name is Vishnu");
}

public void studentDept()
{
System.out.println("Student department is ECE");
}

public int studentid()
{
int studentid=34;
return studentid;
}
}