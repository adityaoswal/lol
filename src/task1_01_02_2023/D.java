package task1_01_02_2023;
import java.util.Scanner;
public class D {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	char c[]=new char[2];
	System.out.println("Enter first character");
	c[0]=s.next().charAt(0);
	System.out.println("enter second character");
	c[1]=s.next().charAt(0);
	System.out.println("the characters are:-"+c[0]+" "+c[1]);
	
	
}
}
