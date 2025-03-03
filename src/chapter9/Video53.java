package chapter9;

import java.util.Scanner;

public class Video53 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		try {
			int a = scanner.nextInt();
			System.out.println("Run try");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Run catch");
		}
		finally {
			System.out.println("Run finally");
			scanner.close();
		}
	}
}
