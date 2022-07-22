package test10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class test10951_1 {

	public static void main(String[] args) {
		try {
			BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
			while(r.readLine()!=null) {
				String[] strArr = r.readLine().split(" ");
				int i1 = Integer.parseInt(strArr[0]);
				int i2 = Integer.parseInt(strArr[1]);
				w.write(i1+i2+"\n");
			}
			w.flush();
			w.close();
		}catch(IOException e) {
			
		}
	}
}