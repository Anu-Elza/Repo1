package excelread;

import java.io.IOException;

public class Excelread1 {

	public static void main(String[] args) throws IOException {
		String y=Excelread.getStringData(1, 0);
		System.out.println(y);
		String z=Excelread.getIntegerData(1, 1);
		System.out.println(z);

	}

}
