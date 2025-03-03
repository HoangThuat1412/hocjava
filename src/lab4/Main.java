package lab4;


public class Main {
	public static void main(String[] args) {
		Product sanPham = new Product();

		Product pr1 = sanPham.nhapThongTin("Computer", 200, 0.1);
		sanPham.xuatThongTin(pr1);
		System.out.println("TaxPrice: " + sanPham.getTaxPrice(pr1.getPrice(), pr1.getTax()));
		System.out.println("Last Price: " + sanPham.getLastPrice(pr1.getPrice(), pr1.getTaxPrice(pr1.getPrice(), pr1.getTax())));
		
	}
}