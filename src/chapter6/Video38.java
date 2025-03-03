package chapter6;

import java.util.ArrayList;

public class Video38 {
	public static void main(String[] args) {
		Student st1 = new Student("Hoang Thuat", "1");
		Student st2 = new Student("Nguyen Van At", "1");
		Student st3 = new Student("Ha Thi B", "1");
		Student st4 = new Student("Nguyen Van C", "1");
		Student st5 = new Student("Do Thi T", "1");
		
		ArrayList<Student> arr = new ArrayList<Student>();
		arr.add(st1);
		arr.add(st2);
		arr.add(st3);
		arr.add(st4);
		arr.add(st5);
		
		for(int i=0; i<arr.size(); i++) {
			if(arr.get(i).getName().startsWith("Nguyen")) {
				System.out.println("Start with Nguyen: " + arr.get(i));
			}
		}
		
		System.out.println("Check array: "+arr);
	} 
}
