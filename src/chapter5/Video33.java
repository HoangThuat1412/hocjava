package chapter5;

import java.util.ArrayList;

import chapter4.Student;

public class Video33 {
	public static void main(String[] args) {
		int a = 10;
		ArrayList a2 = new ArrayList();
		
		ArrayList<String> a1 =  new ArrayList<String>(); // generic
		ArrayList<Student> a3 = new ArrayList<Student>();
		a1.add("Hoang Thuat");
		a1.add("Hoang Thuat hi");
		a1.add("Hoang Thuat bar");
		
		a1.remove(1);
		System.out.println(a1.toString() + " " + a1.get(1));
	}
}
