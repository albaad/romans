import java.util.Scanner;

public class Test {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		String rom1 = in.next();
		String rom2 = in.next();

		Romans r = new Romans();
		
		int r1 = r.toInt(rom1);
		int r2 = r.toInt(rom2);
		int total = r1 + r2;

		String totalR = r.toRoman(total);

		System.out.print(totalR);
	}
	
}
