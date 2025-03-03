package lab4;

import java.util.Scanner;

public class Product {
	private String name;
	private double price;
	private double tax;
	private double taxPrice;
	
	public Product() {
		
	}
	
	public Product(String name, double price, double tax) {
		this.name = name;
		this.price = price;
		this.tax = tax;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getTax() {
		return this.tax;
	}
	
	public void setTax(double tax) {
		this.tax = tax;
	}
	
	public Product nhapThongTin(String name, double price, double tax) {
		Product pr = new Product(name, price, tax);
		return pr; 
	}
	
	public void xuatThongTin(Product pr) {
		System.out.println("Name product is: " +  pr.getName() + " price: "+ pr.getPrice()  + " tax: " + pr.getTax());
	}
	
	public double getTaxPrice(double price, double tax) {
		 return price * tax;
	}
	
	public double getLastPrice(double price, double getTaxPrice) {
		return price - getTaxPrice;
	}
}
