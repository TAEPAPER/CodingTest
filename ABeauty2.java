package forTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ABeauty2 {
public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	int c =	Integer.parseInt(br.readLine());
	for(int i=1; i<=c; i++) {
		String s =br.readLine();
		int a = Integer.parseInt(s.split(" ")[0]);
		int b = Integer.parseInt(s.split(" ")[1]);
		bw.write("Case #"+i+": "+ a +" + "+b+" = "+(a+b)+"\n");
	}
	
	bw.flush();
	
}
}
