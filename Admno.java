import java.util.*;
class student
{
	int admno;
	String name;
	void get(int x,String y)
	{
		admno=x;
		name=y;
	}
	void show()
	{
		Systrm.out.println("Admission no="+admno+"Name="+name);
	}
}
class Test
{
  public static void main(String[] args)
	{
	  Student s1=new Student();
	  S1.get(111,"rrr");
	  S1.show();
	  Student s2=new Student();
	  S2.get(222,"KKK");
	  S2.show();
	}
}
