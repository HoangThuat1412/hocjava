package hoidanIT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bai01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Khai báo ArrayList để chứa các số nguyên
        ArrayList<Integer> numbers = new ArrayList<>();

        // Nhập số lượng phần tử
        System.out.print("Nhập số lượng phần tử của danh sách: ");
        int n = scanner.nextInt();

        // Nhập các phần tử
        System.out.println("Nhập các phần tử:");
        for (int i = 0; i < n; i++) {
            numbers.add(scanner.nextInt());
        }

        // Sắp xếp danh sách
        Collections.sort(numbers);

        // Xuất kết quả
        System.out.println("Danh sách sau khi sắp xếp: " + numbers);
        System.out.println("Phần tử nhỏ nhất: " + numbers.get(0));
        System.out.println("Phần tử lớn nhất: " + numbers.get(n - 1));

        scanner.close();
    }
}
