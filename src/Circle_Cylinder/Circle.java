package Circle_Cylinder;

public class Circle extends Rectangle {
	
	double cir_area;
	
	double cir_cf;
	
	void area(double r){
		 cir_area= 3.14*r*r;
		 System.out.println("Circle area" +cir_area);
		}
	void circumference(double r)
	{
		 cir_cf=2*3.14*r;
		System.out.println("Circle Circumference"+cir_cf);
	
	}

}
