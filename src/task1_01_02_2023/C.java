package task1_01_02_2023;
import java.util.Scanner;
public class C {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	double d[]=new double[3];
	System.out.println("Enter the first value");
	d[0]=s.nextDouble();
	System.out.println("Enter the second value");
	
	d[1]=s.nextDouble();
	System.out.println("enter the thrid value");
	d[2]=s.nextDouble();
	System.out.println("the values are:-"+d[0]+"  "+d[1]+"  "+d[2]);

}
}
