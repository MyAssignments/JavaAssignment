package Circle_Cylinder;

import java.util.Scanner;

public class CalArea {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter radius");
		
		double r= sc.nextDouble();
		
		System.out.println("Enter height");
		
		double h= sc.nextDouble();
		Rectangle rec= new Rectangle();
		rec.area(r, h);
		
		Circle c=new Circle();
		c.area(r);
		c.circumference(r);
		
		Cyllinder cl=new Cyllinder();
		cl.area();
		
	}

}
