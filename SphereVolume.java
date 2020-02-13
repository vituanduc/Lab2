import java.util.Scanner;
public class SphereVolume
{
	public static void main(String[] args) 
	{ 
	// add your declaration and code here 
	Scanner keyboard = new Scanner(System.in);
	double d, r, v;
		
	System.out.println("Sphere Volume Calculator");
	System.out.print("please enter diameter: "); // ask for diametter
	d = keyboard.nextDouble(); // assign diameter into d
	
	r=d*1.0/2; // calculate r
	v= Math.pow(r, 3)*Math.PI*4/3; //calculate v
	
	System.out.println("the radius is " + r ); //print r
	System.out.println("the volume is " + v ); // print v
	} 
} 


