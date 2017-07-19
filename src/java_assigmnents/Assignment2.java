package java_assigmnents;

class Bicycle {
	 
	 void typeOfBicycle()
	 {
		 System.out.println("Bicycle");
	 }

}
 class MountainBike extends Bicycle 
 {
	void typeOfBicycle()
	 {
		 System.out.println("Mountaian Bike");
	 }
 }
 class RoadBike extends Bicycle 
 {
	void typeOfBicycle()
	 {
		 System.out.println("Road Bike");
	 }
 }
 class TendemBike extends Bicycle 
 {
	void typeOfBicycle()
	 {
		 System.out.println("Tendem Bike");
	 }
 }
 
 class Assignment2
 {
	 public static void main(String args[]){  
		 Bicycle b= new Bicycle();
		 MountainBike m= new MountainBike();
		 RoadBike r= new RoadBike();
		 TendemBike t=new TendemBike();
		 b.typeOfBicycle();
		 m.typeOfBicycle();
		 r.typeOfBicycle();
		 t.typeOfBicycle();
	 }
 }
 
