package Circle_Cylinder;

public class Cyllinder extends Circle {
	
	void area()
	{
		double cl_area= 2*(super.cir_area)+ super.rec_area;
		System.out.println("Cyllinder Area" +cl_area);
	}

}
