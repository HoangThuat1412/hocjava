package chapter9;

import java.util.Scanner;

public class Video56 {
	public static String nhapMsv(Scanner scanner) {
		String result;
		while (true) {
			System.out.print("Nhap ma sinh vien: ");
			try {
				result = scanner.nextLine();
				System.out.println("Run here");
				break;
			} catch (Exception e) {
				System.out.println("Ma sinh vien khong hop le. ");
				scanner.next();
				// TODO: handle exception
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String masv = nhapMsv(scanner);
		System.out.print("Nhap ho va ten: ");
		String hoTen = scanner.nextLine();
		
		double diem;
		while(true) {
			System.out.println("Nhap diem cua sinh vien: ");
			try {
				diem = scanner.nextDouble();
				if(diem >= 0 && diem <= 10) {
					break;
				} else {
					System.out.println("Loi nhap lai diem tu 0 - 10");
				}
			} catch (Exception e) {
				System.out.println("Nhap lai diem");
				// TODO: handle exception
			}
		}
		
		int age;
		while(true) {
			System.out.print("Nhap tuoi cua sinh vien: " );
			try {
				age = scanner.nextInt();
				if(age<0) {
					System.out.println("Nhap lai tuoi khong hop le");
				}else {
					break;
				}
			} catch (Exception e) {
				System.out.println("Loi gi day");
				// TODO: handle exception
			}
		}
		
		SinhVien sv = new SinhVien(masv, hoTen, diem, age);
		System.out.println("Sinh vien infor: " + sv);
		
		scanner.close();
	}
}
