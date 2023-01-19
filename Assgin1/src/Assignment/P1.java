package Assignment;

import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total=0;
		int a=60,b=90,c=120,d=45,e=30;
		System.out.println("Triangle Game");
		System.out.println("Game Start");
		System.out.println("Board: "+a+" "+b+" "+c+" "+d+" "+e);
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter a angle1");
		int a1=s1.nextInt();
		System.out.println("Enter a angle2");
		int a2=s1.nextInt();
		System.out.println("Enter a angle3");
		int a3=s1.nextInt();
		total=a1+a2+a3;
		if(total==180) {
			
			if(a1==90 || a2==90 || a3==90) {
				System.out.println("Congratulation you won Prize 2");
			}
			else if(a1==60 && a2==60 && a3==60) {
				System.out.println("Congratulation you won Prize 3");
			}
			else {
				System.out.println("Prize 1");
			}
		}
		
		else {
			System.out.println("No Prize");
			
		}
	}

}
