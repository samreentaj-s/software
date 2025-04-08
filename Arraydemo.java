 package p1;

import java.util.Scanner;

public class Arraydemo {
	public static void main(String[]args) {
		int[]numbers=new int[12];
	   Scanner input =new Scanner(System.in);
	   System.out.println("enter 12 integers");
	   for(int i=0;i<12;i++){
		   numbers[i]=input.nextInt();
	 
	   }
	
	int count=0;
	for(int i=0;i<12;i++) {
		if(numbers[i]%2==0) {
			count=count+1;
		}
	}
	
	System.out.println("the numbers of elements divisible by 2 are "+count);
    }
}
			
			
		
	   
	   
	   
	   
	   
	
	


