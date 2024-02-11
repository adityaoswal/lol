package task6_15_02_2023;
import java.util.*;
public class Test {
public static void main(String[] args) {
	Employee e[]= new Employee[2];
	
	Scanner sc = new Scanner(System.in);
	for(int i=0;i<e.length;i++)
	{Employee emp = new Employee();
	Company c= new Company();
		System.out.println("Enter Employee id");
		emp.setId(sc.nextInt());
		System.out.println("Enter Employee name");
		emp.setEname(sc.next());
		System.out.println("Enter company id");
		c.setCid(sc.nextInt());
		System.out.println("Enter company address");
        c.setCaddr(sc.nextInt());
        
        emp.setComp(c);
        
		

		e[i]=emp;
		
	
	
		
	}
	for(int i=0;i<e.length;i++)
	{
		Employee em= e[i];
		System.out.println(em.getId());
		System.out.println(em.getEname());
		System.out.println(em.getComp().getCid());
		System.out.println(em.getComp().getCaddr());
		
		
	}
	
}
}
