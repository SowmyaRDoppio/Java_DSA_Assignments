package Problems;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Day1 {
  public static void main(String args[]) {
	  Scanner ob=new Scanner(System.in);
	  System.out.println("Enter a number");
	  int N=ob.nextInt();
//	  Set<Integer> numbers = new HashSet<>();
	  int temp=N;
	  int count=0;
	  while(temp>0) {
		  int digit=temp%10;
		  temp/=10;
		  if(digit!=0) {
//			  if(!numbers.contains(digit))
			  if(N%digit==0)
				  count++;
		  }
	  }
	  System.out.println("The count of the number that divides is "+count);
  }
}

