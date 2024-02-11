package task3_01_02_2023;
import java.util.Scanner;
public class test {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("for how many employee you want to enter the data");
	int a=sc.nextInt();
	employee e[]=new employee[a];
	for(int i=0;i<a;i++)
	{
		employee emp=new employee();
		System.out.println("Enter the id of the employee");
		int b=sc.nextInt();
		emp.setId(b);
		System.out.println("enter the name of the employee");
		String c=sc.next()+sc.nextLine();
		emp.setName(c);
		System.out.println("enter address of the employee ");
		String d=sc.next()+sc.nextLine();
		emp.setAddr(d);
		System.out.println("enter the salary of the employee");
		double f=sc.nextDouble();
		emp.setSalary(f);
		System.out.println("enter the mobile number of the employee");
		long g=sc.nextLong();
		emp.setMobileno(g);
		System.out.println("enter the designatioin of the employee");
		String h=sc.next()+sc.nextLine();
		emp.setDesignation(h);
		System.out.println("enter the company name");
		String j=sc.next()+sc.nextLine();
		emp.setCompanyname(j);
		System.out.println("enter the company address");
		String k=sc.next()+sc.nextLine();
		emp.setCompanyaddr(k);
		
		e[i]=emp;
		}
	for(int i=0;i<a;i++)
	{
		employee emp1=e[i];
		System.out.println(emp1.getAddr()+" "+emp1.getCompanyaddr()+" "+emp1.getCompanyname()+" "+emp1.getDesignation()+" "+emp1.getId()+" "+emp1.getMobileno()+" "+emp1.getName()+" "+emp1.getSalary());
	}
}
}
