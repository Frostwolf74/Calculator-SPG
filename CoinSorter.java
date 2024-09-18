package misc;

import java.util.Scanner;

public class CoinSorter {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double inputAmt;
		int t, l, q, d, n, p;
		
		System.out.print("Enter the amount (xx.xx): $");
		inputAmt = input.nextDouble();
		
		for(t = 0; inputAmt >= 2; ++t) {
			inputAmt = inputAmt-2;
		}
		for(l = 0; inputAmt >= 1; ++l) {
			inputAmt = inputAmt-1;
		}
		for(q = 0; inputAmt >= 0.25; ++q) {
			inputAmt = inputAmt-0.25;
		}
		for(d = 0; inputAmt >= 0.1; ++d) {
			inputAmt = inputAmt-0.1;
		}
		for(n = 0; inputAmt >= 0.05; ++n) {
			inputAmt = inputAmt-0.05;
		}
		for(p = 0; inputAmt >= 0.009; ++p) { // 0.009 to compensate for logical rounding error
			inputAmt = inputAmt-0.009;
		}
		
		System.out.println("There are " + t + " toonies, " + l + " loonies, " + q + " quarters, " 
							+ d + " dimes, " + n + " nickles and " + p + " pennies.");
	}
}
