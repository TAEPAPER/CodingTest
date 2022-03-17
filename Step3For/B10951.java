package src.Step3For;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class B10951 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		/*
		 * while(sc.hasNext()) { int a = sc.nextInt(); int b = sc.nextInt();
		 * System.out.println(a+b); } sc.close();
		 */
			
		//buffer이용하기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		String str;
		
	 while((str = br.readLine())!=null) {
		 st = new StringTokenizer(str," ");
		 int a = Integer.parseInt(st.nextToken());
		 int b = Integer.parseInt(st.nextToken());
		 
		 bw.write(a+b+"\n"); 
	 }
	 
	 br.close();
	 bw.flush();
	 bw.close();
		
	}
}
