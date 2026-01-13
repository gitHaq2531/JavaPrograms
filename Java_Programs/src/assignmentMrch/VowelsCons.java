package assignmentMrch;

public class VowelsCons 
{
	public static void main(String[] args) 
	{
	String s="ABCDEF";
	String a=" ";
	String b=" ";
	
	for(int i=0;i<s.length();i++)
	{
		char ch=s.charAt(i);
		switch(ch)
		{
		case 'A','E','I','O','U','a','e','i','o','u':
			a=a+ch;
		break;
		}
		b=b+ch;
	}
		System.out.println("vowels: "+a);
		System.out.println("cons:: "+b);

	}
}
