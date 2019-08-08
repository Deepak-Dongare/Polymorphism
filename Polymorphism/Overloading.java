package Polymorphism;

import java.util.Scanner;
class Demo{
	
	void accept(int a,int b){
		int c= a+ b;
		System.out.println(c);
		
	}
	void accept(float a,float  b){
		float c= a+ b;
		System.out.println(c);
		
	}
}
public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Demo d=new Demo();
		//System.out.println("Enter tow number");
		/*
		 * int a=sc.nextInt(); int b=sc.nextInt(); d.accept(a,b); float
		 * x=sc.nextFloat(); float y=sc.nextFloat(); d.accept(x,y);
		 */
		
		
		d.accept(20,30);
		d.accept(1.0f,1.0f);

	}

}
