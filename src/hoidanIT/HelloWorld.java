package hoidanIT;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
		System.out.println("++ ------------------ ++");
		System.out.println("| 1. Cộng |");
		System.out.println("| 2. Trừ |");
		System.out.println("| 3. Kết thúc |");
		System.out.println("++ ------------------ ++");
		System.out.println("Lựa chọn của bạn là : ");
		
		int value = scanner.nextInt();
		switch (value) {
		case 1: 
			System.out.println("Plus");
			break;
		case 2: 
			System.out.println("Minus");
			break;
		case 3:
			System.out.println("Over");
			System.exit(0);
			break;
		default:
			System.out.println("hahsad");;
		}
		
		System.out.println("hsadhd jsah ");
		
		scanner.close();
	}
}
