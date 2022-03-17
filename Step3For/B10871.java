package src.Step3For;

import java.util.Scanner;

public class B10871 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //배열의 개수
		int x = sc.nextInt(); //숫자입력받기
		int[] arr = new int[n];//n개 짜리 배열이 만들어짐 
        //배열에 담아주고 
		for(int i =0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i =0; i<arr.length; i++) {
			if( x > arr[i]) {
				System.out.print(arr[i]+" ");
			}
		}
		
		

	}

}
