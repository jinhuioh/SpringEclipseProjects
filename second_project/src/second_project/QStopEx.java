package second_project;

import java.io.IOException;

public class QStopEx {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub

		int keyCode;
		while (true) {
			keyCode=System.in.read();
			System.out.println("keyCode:"+keyCode);
			if(keyCode==113) {
				break;
			}
		}
		System.out.println("Á¾·Î");
	}

}
