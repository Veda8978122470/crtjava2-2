import java.util.*;
class Arrgments
{
  int a,b;
  void get(intx,inty)
	{
	  a=x;
	  b=y;
	}
	  void show()
	{
	  System.out.println("a="+a+"b="+b);
	}
      public static void main(String[] args)
	{
		  Sample s1=new sample();
		  Sample s2=new sample();
		  s1.get(12,66);
		  s2.get(88,43);
		  s1.show();
		  s2.show();
	}
}
		 