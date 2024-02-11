package task2_01_02_2023;
import java.util.Scanner;
public class test {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int i=sc.nextInt();
		student s[]=new student[i];
		for(int j=0;j<i;j++)
		{
			student stu=new student();
			System.out.println("enter rollno");
			int a=sc.nextInt();
			stu.setRollno(a);
			System.out.println("enter name");
			String m=sc.next()+sc.nextLine();
			stu.setName(m);
			System.out.println("enter division");
			char d=sc.next().charAt(0);
			stu.setDiv(d);
			s[i]=stu;
			}
		for(int z=0;z<s.length;z++)
		{
			student s1=s[i];
			System.out.println(s1.getRollno());
			System.out.println(s1.getDiv());
			System.out.println(s1.getName());
		
		}
}
}