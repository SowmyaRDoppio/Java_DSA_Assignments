package Problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reversal {
	public static void main(String args[]) {
Scanner ob=new Scanner(System.in);
List<Character> unique=new ArrayList<>();
StringBuilder answer=new StringBuilder();
System.out.println("Enter the stirng");
String s=ob.nextLine();
for(int i=s.length()-1;i>=0;i--) {
	if(!unique.contains(s.charAt(i)) && s.charAt(i)!=' ') {
		unique.add(s.charAt(i));
		answer.append(s.charAt(i));
	}
}
System.out.println("The reversal answer is ---->"+answer.toString());
}
}
