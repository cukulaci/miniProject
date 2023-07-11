package miniProjeAsalSayi;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = -1;
		int remainder = number % 2;
		int result = 0;
		int counter = 0;
		boolean isPrime = true;
		// System.out.println(remainder);
		
		for (int i = 1; i<=number; i++) {
			result = number % i;
				if (result == 0) {
					counter=counter+1;
				}
		}
				
		if (counter==2) {
				System.out.println("Sayı asal sayıdır.");
			}
		else {
				System.out.println("Sayı asal sayı değildir.");
			}
		
		
		/////////// Hocanın yazılımı alttaki //////////
		
		if (number==1) {
			System.out.println("Sayı asal değildir.");
			return;
		
		}
		
		if (number<1) {
			System.out.println("Geçersiz sayı.");
			
		}

		for (int i = 2; i<number; i++) {
			if(number % i == 0) {
				isPrime = false;
			}
		}
		
		if (isPrime) {
			System.out.println("Sayı asaldır.");
		}
		else {
			System.out.println("Sayı asal değildir.");
		}
		

	}

}
