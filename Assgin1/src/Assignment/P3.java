package Assignment;

import java.util.Scanner;

public class P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1,b=2,c=3,d=4;
		int e=1,f=2,g=3,h=4;
		Scanner s1 =new Scanner(System.in);
		System.out.println("Enter a Student roll no");
		int roll=s1.nextInt();
		if(e==roll) {
			System.out.println("You are Sapphire");
		}
		else if(f==roll) {
			System.out.println("You are pearl");
		}
		else if(g==roll) {
			System.out.println("You are ruby");
		}
		else if(h==roll) {
			System.out.println("You are emerald");
		}
		if(roll<=25) {
			while(a<=25) {
				a=a+4;
				if(a==roll) {
					
					System.out.println("You are Sapphire");
				}	
			}
			while(b<=25) {
				b=b+4;
				if(b==roll ) {
					System.out.println("You are pearl");
				}
			}
			while(c<=25) {
				c=c+4;
				if(c==roll) {
					System.out.println("You are ruby");
				}
			}
			while(d<=25) {
				d=d+4;
				if(d==roll) {
					
					System.out.println("You are emerald");
				}
			}
			
		}
		
	}

}
