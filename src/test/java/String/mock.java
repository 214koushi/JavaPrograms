package String;

import java.util.Scanner;

public class mock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	int count=0;
HashSet<Integer> hs=new HashSet<Integer>();
		int[]a= {1,2,3,4,5,1,2,3};
		
		for (int i = 0; i < a.length; i++) {
			hs.add(a[i]);
		}
		System.out.println(hs);
	
		for(Integer abc:hs) {
			for (int i = 0; i < a.length; i++) {
				if () {
					count++;
				}
			}
		}
		System.out.println(count);
		*/	
	
	
	// primenos
	
	Scanner s= new Scanner(System.in);
     System.out.println("Enter the number");
     int num=s.nextInt();
     int count=0;
     for (int i = 2; i <=num/2; i++) {
		if (num%i==0) {
		count++;
		
		}
	}
     if (count>0) {
    	 System.out.println("number is not prime");
		
	} else {
          System.out.println("number is prime");
	}
	
	}
}
