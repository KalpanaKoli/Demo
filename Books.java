package java_programs;

import java.util.Scanner;

//wap to store books details and display them 
//scanner is example of predefined class
//books is user defined class 
public class Books 
{
	String bname;
	String aname;
	int price;
	//return type functioname  ( arguments...)  {  }
	void input()
	{
		Scanner s= new Scanner(System.in);
		System.out.println("enter book name");
		bname=s.next();
		System.out.println("enter book  author name");
		aname=s.next();
		System.out.println("enter book price");
		price=s.nextInt();
	}
	void display()
	{
		System.out.println(bname +"  "+ aname+"   "+price);
	}

	
}
