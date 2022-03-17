package src.Step3For;

import java.util.Scanner;

public class B10952 {
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		
		int a; 
		int b;
	do {
		 a = sc.nextInt();
		 b = sc.nextInt();
		 if((a+b) !=0) {
		System.out.println(a+b);
		}
		}while(a!=0&&b!=0);
	}
}
