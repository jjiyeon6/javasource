package product;

import java.util.Scanner;

public class ProductProcess {
	
	private Product[] arr;
	private Scanner sc;
	private int menu;
	private boolean flag = true;
	private int cnt = 0;
	
	public ProductProcess(){
		arr = new Product[30];
		sc = new Scanner(System.in);
	}
	
	public void add(Product name) {
		System.out.println("add()");
		for(int i=0; i<arr.length; i++) {
			arr[cnt++] = name;
		}
	}
	
	public void search() {
		
	}
	
	public void update() {
		System.out.println("update()");
	}
	
	public void delete() {
		
	}
	
	public void printAll() {
		
	}
	

}
