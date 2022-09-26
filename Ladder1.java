package day6_arrays;

import java.util.Scanner;

public class Ladder1
{

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int y[][]= new int[3][];
		y[0]=new int[2];
		y[1]= new int[3];
		y[2]= new int[4];
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<y[i].length;j++)
			{
				System.out.println("enter number");
				y[i][j]= s.nextInt();
			}
		}
		
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<y[i].length;j++)
			{
				System.out.print("  "+y[i][j]);
			}
			System.out.println();
		}

	}

}
