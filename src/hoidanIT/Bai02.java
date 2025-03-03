package hoidanIT;

import java.util.Scanner;

//Viết chương trình nhập vào 3 số nguyên a, b, c. Tính toán nghiệm của phương trình
//trên
//Gợi ý:
//- Nếu a = 0 => làm tương tự ví dụ bài 1
//- Nếu a # 0:
//- Tính delta = b^2 - 4ac.
//- Nếu delta < 0 => thông báo "phương trình vô nghiệm"
//- Nếu delta = 0 => thông báo "nghiệm kép x = -b/(2*a)
//- Nếu delta > 0 => thông báo có 2 nghiệm riêng biệt
//x1 = (-b + căn(delta))/(2*a)
//x2 = (-b - căn(delta))/(2*a)

public class Bai02 {
	public static void giaiPhuongTrinhBacNhat(int a, int b) {
		
		if(a == 0 && b == 0) {
			System.out.println("Phuong trinh co vo so nghiem");
		} else if (a == 0 && b != 0) {
			System.out.println("Phuong trinh vo nghiem");
		} else {
			float x =  (float)-b/a;
			System.out.println("Phuong trinh co mot nghiem x: " + x);
		}
		
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Tinh nghiem phuong trinh ax^2 + bx + c = 0");
		System.out.print("Nhap a: ");
		int a = scanner.nextInt();
		System.out.print("Nhap b: ");
		int b = scanner.nextInt();
		System.out.print("Nhap c: ");
		int c = scanner.nextInt();
		if(a == 0) {
			giaiPhuongTrinhBacNhat(b, c);
		} else {
			int delta = (int) (Math.pow(b, 2) - 4*a*c);
			if(delta < 0) {
				System.out.println("Phuong trinh vo nghiem");
			} else if (delta == 0) {
				float x = (float)-b/(2*a);
				System.out.println("Nghiem kep x= "+ x);
			} else {
				float x1 = (float) ((-b + Math.sqrt(delta))/(2*a));
				float x2 = (float) ((-b - Math.sqrt(delta))/(2*a));
				System.out.println("Phuong trinh co 2 nghiem phan biet x1: "+ x1 + " x2: "+ x2);
			}
			
		}
		
		scanner.close();
	}
}
