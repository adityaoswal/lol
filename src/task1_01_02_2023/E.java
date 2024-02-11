package task1_01_02_2023;
import java.util.Scanner;
public class E {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the size of the array");
	int i=s.nextInt();
	int x[]=new int[i];
	for(int j=0;j<i;j++)
	{
		System.out.println("enter the "+(j+1)+" value");
		x[j]=s.nextInt();
		
	}
	int sum=0;
	for(int j=0;j<i;j++)
	{
		
		sum=x[j]+sum;

	}
	System.out.print("the sum of the number is:-"+sum);

}
}
