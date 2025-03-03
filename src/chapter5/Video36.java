package chapter5;

import java.util.ArrayList;
import java.util.Scanner;

public class Video36 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Double> numbers = new ArrayList<Double>();
		
		while(true) {
			System.out.print("Nhap so bat ki: ");
			Double x = scanner.nextDouble();
			numbers.add(x);
			System.out.print("Ban co muon nhap them khong? Y/N??? ");
			if(scanner.nextLine().equals("N") || scanner.nextLine().equals("n")) {
				break;
			}
		}
		
		System.out.println("Mang ban vua nhap la: " + numbers);
		
		double sum = 0;
		for(int i=0; i<numbers.size(); i++) {
			sum +=  numbers.get(i);
		}
		
		System.out.println("Tong mang ban vua nhap la: " + sum);

	}

}
