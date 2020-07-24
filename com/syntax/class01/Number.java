package com.syntax.class01;

public class Number {
	void add(int a, int b) {
		if (a>b){
			System.out.println("Num a is largest"+a);
		}else
		System.out.println("Num " +a+" is smallest "+b);
	}
	void evenOdd(int n) {
		if (n%2==0) {
			System.out.println("The number " +n+" is even");
		}else 
			System.out.println("The number " +n+" is odd ");
	}

	void hello (String str) {
	switch (str) {
	case"tajikistan":
	System.out.println("Assalom");
	break;
	case"uzb" :
			System.out.println("Salom");
			break;
			case "arab" :
			System.out.println("Yalla");
			break;
			
		
		 default:
			 System.out.print("unknown");
		
			
	
	}}	
}
