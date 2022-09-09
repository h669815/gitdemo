package levering1;

import static java.lang.Integer.parseInt;

import java.util.Scanner;

public class O2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String k = ""; // K er karakter
		String ka = ""; // Ka er karakter
		int n = 10; // antall elever

		
			for (int i = 1; i <= n; i++) {

				System.out.print("Enter elev nr " + i + " poeng: ");
				Scanner input = new Scanner(System.in);

				int c = parseInt(input.nextLine());
				// c er poeng
				

				if (90 <= c && c <= 100) {
					k = "A";
					System.out.print("elev karakter er " + k + "\n");

				}
				if (80 <= c && c <= 89) {
					k = "B";
					System.out.print("elev karakter er " + k + "\n");

				}
				if (60 <= c && c <= 79) {
					k = "C";
					System.out.print("elev karakter er " + k + "\n");

				}
				if (50 <= c && c <= 59) {
					k = "D";
					System.out.print("elev karakter er " + k + "\n");

				}
				if (40 <= c && c <= 49) {
					k = "E";
					System.out.print("elev karakter er " + k + "\n");

				}
				if (0 <= c && c <= 39) {
					k = "F";
					System.out.print("elev karakter er " + k + "\n");

				}

				else if (c < 0 || c > 100) {

					for (int j = 0; j >= 0; j--) {

						System.out
								.print("Wrong input enter only number" + " between 0-100 : \n" + j + "forsøk igien.\n");
					}
					int point = parseInt(input.nextLine());
					int x = point;

					if (90 <= x && x <= 100) {
						ka = "A";

					}
					if (80 <= x && x <= 89) {
						ka = "B";

					}
					if (60 <= x && x <= 79) {
						ka = "C";

					}
					if (50 <= x && x <= 59) {
						ka = "D";

					}
					if (40 <= x && x <= 49) {
						ka = "E";

					}
					if (0 <= x && x <= 39) {
						ka = "F";

					}
					System.out.print("elev nr " + i + " karakter er " + ka + "\n");
				} else if (c < 0 && c > 100) {
					System.out.print("elev nr " + i + " karakter er " + k + "\n");
					parseInt(input.nextLine());
			}
		}
	}
}