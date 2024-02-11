package task5_15_02_2023;

public class A {
public static void main(String[] args) {
	int x[] =  new int [5];
	x[0]=1;
	x[1]=2;
	x[3]=3;
	System.out.println(x[1]);
	int x1[] = {0,1,2,3,4};
//	x1[0]=1;
//	x1[1]=2;
//	//x1[2]=3;
	System.out.println(x1[2]);
	for(int i=0;i<x1.length;i++) {
		System.out.print(x1[i]);
	}
	System.out.println();
	System.out.println("______________________");
	for(int i : x1) {
		System.out.println(i);
	}	
		System.out.println("--------------------------");
		
		int h [][]= new int [4][1];
		h[0][0]=1;
		h[1][0]=2;
		h[2][0]=3;
		h[3][0]=4;
		
		
		//System.out.println(h[1][0]);
		
		for(int i=0;i<h.length;i++)
		{
			for (int j=0;j<h[0].length;j++)
			{
				System.out.println(h[i][j]);
			}
		}
		
		int v[][]=new int [3][2];
		v[0][0]=1;
		v[0][1]=2;
		v[1][0]=3;
		v[1][1]=4;
		v[2][0]=5;
		v[2][1]=6;
		
		for(int i=0;i<v.length;i++)
		{
			for(int j=0;j<v[0].length;j++)
			{
				System.out.println(v[i][j]);
			}
		}
		
	
}
}
