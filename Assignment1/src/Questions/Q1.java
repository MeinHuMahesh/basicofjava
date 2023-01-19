package Questions;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=60,b=60,c=70,d=80,e=90;
		Scanner s1 = new Scanner(System.in);
		System.out.println("Game Start");
		System.out.println("         Triangle  Game       ");
		System.out.println("Please Enter the angle1 from Below");
		System.out.println(" Angles are: "+a+" "+b+" "+c+" "+d+" "+e);
		System.out.println("Angle 1:");
		int angle1=s1.nextInt();
		if(angle1==a||angle1==b||angle1==c||angle1==d||angle1==e) {
			System.out.println("Please Enter the Angles from the board");
		}
		else {
		System.out.println("Please Enter the angle2 from Below");
		System.out.println(" Angles are: "+a+" "+b+" "+c+" "+d+" "+e);
		System.out.println("Angle 2:");
		int angle2=s1.nextInt();
		if(angle2!=a||angle2!=b||angle2!=c||angle2!=d||angle2!=e) {
			System.out.println("Please Enter the Angles from the board");
		}
		else {
		System.out.println("Please Enter the angle3 from Below");
		System.out.println(" Angles are: "+a+" "+b+" "+c+" "+d+" "+e);
		int angle3=s1.nextInt();
		System.out.println("Angle 3:");
		if(angle3!=a||angle3!=b||angle3!=c||angle3!=d||angle3!=e) {
			System.out.println("Please Enter the Angles from the board");
		}
		}
		}
		
		
	}

}
