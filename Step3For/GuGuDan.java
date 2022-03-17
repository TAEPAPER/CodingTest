package src.Step3For;

import java.util.Scanner;

public class GuGuDan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("紐뉖떒�쓣 異쒕젰�븷源뚯슂?");
		int input = sc.nextInt();
		
		for(int i =1; i<=9; i++) {
			System.out.println(input+" * "+i+" = "+ input*i);
		}
		
		
	}

}
