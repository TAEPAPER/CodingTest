package forTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class printwe {
public static void main(String[] args) throws NumberFormatException, IOException {
	//몇번?
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	int n = Integer.parseInt(br.readLine());  //T를 뜻함
	for(int i =0; i<n; i++) {
		String c = br.readLine();
		int a =Integer.parseInt(c.split(" ")[0]);
		int b =Integer.parseInt(c.split(" ")[1]);
		bw.write(a+b+"\n");
	}
	bw.flush();
    
	
	
}
}
