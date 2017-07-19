package java_assigmnents;

import java.util.Scanner;

public class Assignment1a {
	
	public void area(double r)
	{
		double area= 3.14 * r * r;
		System.out.println("The area of circle is: " + area);
	}
 
	public void circumference(double r)
	{
		double cf =2*3.14*r;		
		
		System.out.println("The circumference of circle is: " + cf);
	}
	public void dArea(double d)
	{
		double area= (3.14 * d* d)/4;
		System.out.println("The area of circle with diameter: " + area);
	}
 
	public void dCircumference(double d)
	{
		double cf =3.14*d;		
		
		System.out.println("The circumference of circle with diameter: " + cf);
	}
	@SuppressWarnings({ "resource" })
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius of circle");
		
		double r= sc.nextDouble();
		System.out.println("Enter diameter of circle");
		double d= sc.nextDouble();
		 
		Assignment1a a= new Assignment1a();
		a.area(r);
		a.circumference(r);	
		a.dArea(d);
		a.dCircumference(d);

	}

}
