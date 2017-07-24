package java_assigmnents;

public class OverrideHashcode {
	
	public static void main (String args[])
	{
		Assignment4 a= new Assignment4(1,"rajesh");
		Assignment4 a1= new Assignment4(1,"rajesh");
		
		System.out.println(a.hashCode());
		System.out.println(a1.hashCode());
		
		String s=new String("rajesh");
		
		String s1=new String("rajseh");
		
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
	}

}
