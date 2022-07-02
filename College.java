package org.college;

public class College {
	
	public static void main(String [] args)
	{
	College coll=new College();
	int collegecode = coll.collegecode();
	System.out.println("college code is " + collegecode);
	coll.collegename();
	int collegerank = coll.collegerank();
	System.out.println("college rank is " + collegerank);
	}

	public void collegename()
	{
	System.out.println("college name is PEC");
	}

	public int collegecode()
	{
	int collegecode=2234;
	return collegecode;

	}

	public int collegerank()
	{
	int collegerank=36;
	return collegerank;

	}

	}




