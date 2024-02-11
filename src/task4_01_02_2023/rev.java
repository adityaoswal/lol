package task4_01_02_2023;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class rev {
public static void main(String[] args) {
	
	int i[]=new int[3];
	i[0]=10;
	i[1]=20;
	i[2]=30;
	System.out.println("original array: ");
	for(int j=0;j<i.length;j++)
	{
		System.out.println(i[j]+" ");
	}
	
	System.out.println();
	System.out.println("array in reverse order :");
	for(int j=i.length-1;j>=0;j--)
	{
		System.out.println(i[j]+" ");
	}
	
	
	
}
}
