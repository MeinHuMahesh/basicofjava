package feb2nd;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter size of the list");
		int listnum=scan.nextInt();
		
		List<Integer> li=new ArrayList<Integer>();
		
		for(int i=0;i<listnum;i++) {
			
			li.add(scan.nextInt());
		}
		
		System.out.println("Odd Numbers are");
		li.forEach(s->
		{
			if(s%2==1) //lambda expression is used to compare each elements of the list
			System.out.print(" "+s);
			
		});
		
	}

}
