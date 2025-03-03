package chapter9;


public class SinhVien {
	private String maSinhVien;
	private String hoTen;
	private double diem;
	private int age;
	
	public SinhVien(String masv, String hoTen, double diem, int age) {
		this.maSinhVien = masv;
		this.hoTen = hoTen;
		this.diem = diem;
		this.age = age;
	}

	public String getMaSinhVien() {
		return maSinhVien;
	}

	public void setMaSinhVien(String maSinhVien) {
		this.maSinhVien = maSinhVien;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public double getDiem() {
		return diem;
	}

	public void setDiem(double diem) {
		if(diem>=0 && diem <=10) {
			this.diem = diem;
		} else {
			throw new IllegalArgumentException("Diem tu 0-10");
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "SinhVien [maSinhVien=" + maSinhVien + ", hoTen=" + hoTen + ", diem=" + diem + ", age=" + age + "]";
	}
	
	
}
