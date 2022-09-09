package levering1;

import static java.lang.Integer.parseInt;

import java.util.Scanner;

public class O1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i<11 ; i++) {
			System.out.print("Enter inntekt:");
			Scanner input = new Scanner(System.in);
			int inntekt = parseInt(input.nextLine());
			int c = inntekt;

		if (c>0 && c <= 190349) {
			System.out.println(" Ingen trinnskatt");
		} else if (190350 <= c && c <= 267899){
			System.out.println(" Trinnskatt er 1,7%");
		} else if (267900 <= c && c <= 643799) {
			System.out.println(" Trinnskatt er 4,0%");
		} else if (643800 <= c && c <= 969199) {
			System.out.println(" Trinnskatt er 13,4%");
		} else if (969200 <= c && c <= 1999999) {
			System.out.println("  Trinnskatt er 16,4%");
		} else if (2000000 <= c) {
			System.out.println("  Trinnskatt er 17,4%");
		} else if ( c < 0){
			System.out.println(" feil input");			
			}
		}
	}	
}


