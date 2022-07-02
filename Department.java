package org.department;

import org.college.College;

public class Department extends College {

public static void main(String [] args)
{
Department dept=new Department();
int collegecode = dept.collegecode();
System.out.println("college code is " + collegecode);
dept.collegename();
int collegerank = dept.collegerank();
System.out.println("college rank is " + collegerank) ;
dept.deptName();
}
    public void deptName()
    {
    System.out.println("Department name is ECE");
    }
}