import java.util.*;
class Positive 
{
	public static void main (String[] args)
	{
		Scanner s=new Scanner(System.in);
	    int a;
	    System.out.println("Enter a Number");
	    a=s.nextInt();
	    if(a>0)
		{
			System.out.println("The given no is  Positive");
	    }
		 else
		if(a<0)	 
		{                                         
			  System.out.println("the given no is negative");
	    }
		else
		{
			System.out.println("the given no is zero");
		}
	}

}	