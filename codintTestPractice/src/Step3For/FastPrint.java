package src.Step3For;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class FastPrint {

	public static void main(String[] args) throws NumberFormatException, IOException {
	// 별찍기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		   int n = Integer.parseInt(br.readLine());   
		   for(int i=1; i<=n; i++) {
			for(int j =1; j<=i; j++) {
				bw.write('*');
			}
		        bw.write("\n");
		}
		bw.flush();
	}

}
	