package task1_01_02_2023;
import java.util.Scanner;
public class B {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the size of the array");
	int i=s.nextInt();
	float f[]=new float[i];
	for(int j=0;j<i;j++)
	{
	
	System.out.println("Enter the "+(j+1)+"  value");
	f[j]=s.nextFloat();
	
	}
	System.out.println("the values are");
	for(int j=0;j<i;j++)
	{
		System.out.print(f[j]+" ");

	}
}
}
