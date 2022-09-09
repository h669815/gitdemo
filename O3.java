package levering1;

import static java.lang.Integer.parseInt;

import java.util.Scanner;

public class O3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter n : ");
		int  factu=1;

		int y = parseInt(input.nextLine());
		
		for (int n = 1; n<=y; n++) {
			
			factu =factu*n;
			System.out.print( n + "!=");
			System.out.println(factu);
		}						
	}
}
	

	
