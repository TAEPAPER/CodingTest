package forTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class PrintNReverse {
public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	int c = Integer.parseInt(br.readLine());
	for(int i =c; i>=1; i--) {
		    bw.write(i +"\n");
	}
      bw.flush();
}
}
