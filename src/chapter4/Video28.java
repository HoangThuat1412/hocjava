package chapter4;

public class Video28 {
	public static void main(String[] args) {
		Student st1 = new Student();
		
		Student st2 = new Student("Thuat", 22,"HaiDuong");
		st2.setName("Thuat new setName");
		st2.setAge(23);
		System.out.println("Ten: " + st2.getName() + " and age: " +st2.getAge() + " hometown: " + st2.getAddress());
	}
}
