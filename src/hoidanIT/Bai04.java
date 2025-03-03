package hoidanIT;

import java.util.Arrays;
import java.util.Scanner;

public class Bai04 {

	public static void main(String[] args) {

		int[] num = {8,2,3,4,213,31,22,45};
		
		for(int i = 0; i < num.length - 1; i++) {
			for(int j = i+1; j < num.length; j++) {
				if(num[i] < num[j]) {
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(num));
		
		System.out.println("ai do da tung noi: \"Muon ngoi vi tri khong ai ngoi duoc thi phai chiu cam giac khong ai chiu duoc\"");
	}
}
