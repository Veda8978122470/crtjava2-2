import java.util.*;
class Vowels
{
	public static void main (String[] args)
	{
		Scanner s=new Scanner(System.in);
	    char a;
	    System.out.println("Enter a Character");
	    a=s.next().charAt(0);
	    if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'||a=='A'||a=='E'||a=='I'||a=='O'||a=='U')
		{
			System.out.println("Vowels");
	    }
		 else                                                                               
		{                                         
			  System.out.println("Constants");
	    }
	}
}	