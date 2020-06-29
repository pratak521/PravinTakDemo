package com.pat;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistDemo {
	
	public static void main(String[] args) {
		
		
		ArrayList<Integer> al=new ArrayList<>();
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter the number");
			al.add(scan.nextInt());
		}
		al.forEach(n->{if(n>10)System.out.println(n);});
		System.out.println(al);
	
	}

}
