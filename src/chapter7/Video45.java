package chapter7;

public class Video45 {
	public static void main(String[] args) {
		SinhVien sv1 = new SinhVienIT(10, 7);
		System.out.println("Diem TB cua ban sinh vien it la: "+ sv1.getDiem());
		
		SinhVien sv2 = new SinhVienCoKhi(9, 6);
		System.out.println("DTB cua sinh vien co khi la: " + sv2.getDiem());
	}
}
