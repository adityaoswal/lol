package task7_15_02_2023;
import java.util.*;
import java.util.List;

public class A {
public static void main(String[] args) {
	
	Scanner sc= new Scanner (System.in);
	
//	int x[]= {1,2,8,6,7};
//	Arrays.sort(x);
//	
//	System.out.println("Enter any number");
//	int y= sc.nextInt();
//	
//	int index = Arrays.binarySearch(x, y);
//	//for(index)
//	
//		if(x[index]==y)
//		{
//			System.out.println(index);
//			System.out.println(x[index]);
//		}
//		else
//		{
//			System.out.println("Enter correct number");
//			
//		}

	
//	int x[]= {2,5,10,4};
//	int y=0;
//	List<int []> l =  Arrays.asList(x);
//	
//	System.out.println(l);
//	for (int i :x)
//	{
//		System.out.println(i);
//	}
//	
	
//	for(int i=x.length-1;i>=0;i--)
//	{
//		y=x[i];
//		System.out.print(" "+y+" ");
//	}


//	for(int i=0;i<x.length;i++)
//	{
//		if(x[i]%2==0)
//		{
//			y=y+x[i];
//		
//		}
//		else
//		{
//		System.out.println();	
//			
//		}
//		
//	}
	//System.out.println(y);
//	int u[]= {2,5,10,4,45};
//    List<int[]> l = Arrays.asList(u);
//    
//   Collections.reverse(l);
//   System.out.println("----------------");
//   
//   for(int[] i : l)
//   {
//	   System.out.println(i);
//   }
   int g[][]= {{1,2,3},{4,5,6},{7,8,9}};
   int l[][]= {{9,8,7},{6,5,4},{3,2,1}};
   int p[][] = new int[3][3];
   for(int i=0;i<g.length;i++)
   {
	   for(int j=0;j<l.length;j++)
	   {
		   p[i][j]=0;
		   for(int k =0;k<l.length;k++)
		   {
			 p[i][j]=p[i][j]+g[i][k]*g[k][j];
			 
		   }
	   }
   }
  
   for(int i[] : p)
   {
	   for(int j : i)
	   {
		   System.out.print(" "+j);
	   }
	   System.out.println();
   }
}
}
