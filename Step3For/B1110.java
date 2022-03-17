package src.Step3For;

import java.util.Scanner;

public class B1110 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a;
		String b;
		String c; 
		int count =0;
		do{
			a = sc.nextLine();
			b = (a.charAt(0) + a.charAt(1))+"";
			c = a.charAt(a.length()-1) + b.charAt(b.length()-1)+"";
			count++;
		}while(!(a.equals(c)));
		
		System.out.println(count);
		
		
	}
}
