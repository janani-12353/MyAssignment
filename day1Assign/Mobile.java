package week.day1Assign;
/*Assignment 2:

- Create package name as week1.day1 under src/main/java
- Create a  new class as "Mobile" under week1.day1
- Create 2 methods (makeCall() , sendMsg()) with simple print statement
- In first method create variable  mobileModel (String),mobileWeight (float)
- In second method create variable  isFullCharged (boolean),mobileCost (int)
- Create main method
Create object for class and call  from main method and print them
- print a statement---->"This is my mobile";
-run and confirm the output printed in console 

*/
public class Mobile {
	public void makecall() {
		System.out.println("JANANI CALLING");
		String mobileModel="OPPOA16";
		double mobileWeight=2.5;
		System.out.println("Mobile model "+mobileModel);
		System.out.println("Mobile weight"+mobileWeight);
		
	}
	public void sendmsg() {
		System.out.println("this is my mobile");
		boolean fullcharged=true;
		int mobileCost=30000;
		System.out.println("fullcharged"+fullcharged);
		System.out.println("mobileCost"+mobileCost);
	}
	
public static void main(String[] args) {
	
	
	Mobile mob =   new Mobile ();
	
	mob.makecall();
	mob.sendmsg();
	
}

}
		




