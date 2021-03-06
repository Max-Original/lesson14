package javacore14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Commodity{

	private static Commodity commodity;
	
	private List<Product> listProducts = new ArrayList<>();
	
	
	public static synchronized Commodity getCommodity() {
		if (commodity == null) {
			commodity = new Commodity();
		}
		return commodity;
	}
	
	public void addProduct() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter name of the product");
		scanner = new Scanner(System.in);
		String productName = scanner.next();

		System.out.println("Enter product weight");
		scanner = new Scanner(System.in);
		int productWeight = scanner.nextInt();

		System.out.println("Enter product width");
		scanner = new Scanner(System.in);
		int productWidth = scanner.nextInt();

		System.out.println("Enter product length");
		scanner = new Scanner(System.in);
		int productLength = scanner.nextInt();

		Product createdProduct = new Product(productName, productLength, productWidth, productWeight);

		listProducts.add(createdProduct);
		
		System.out.println(listProducts);
	}
	
	public void removeProduct() {
		
		System.out.println("Enter index of the product which will be deleted");
		Scanner scanner = new Scanner(System.in);
		int productIndex = scanner.nextInt();
		
		listProducts.remove(productIndex);
		
		System.out.println(listProducts);
	}
	
	public void replaceProduct() {
		System.out.println("Enter index of the product which will be deleted");
		Scanner scanner = new Scanner(System.in);
		int productIndex = scanner.nextInt();
		
		System.out.println("Enter name of the product");
		scanner = new Scanner(System.in);
		String productName = scanner.next();

		System.out.println("Enter product weight");
		scanner = new Scanner(System.in);
		int productWeight = scanner.nextInt();

		System.out.println("Enter product width");
		scanner = new Scanner(System.in);
		int productWidth = scanner.nextInt();

		System.out.println("Enter product length");
		scanner = new Scanner(System.in);
		int productLength = scanner.nextInt();

		Product createdProduct = new Product(productName, productLength, productWidth, productWeight);
		
		listProducts.set(productIndex,createdProduct);
	
		System.out.println(listProducts);
	}
	
	public void sortProductByName() {
		Collections.sort(listProducts, new ProductSortByName());
		System.out.println(listProducts);
	}

	public void sortProductByLength() {
		Collections.sort(listProducts, new ProductsSortByLength());
		System.out.println(listProducts);
	}

	public void sortProductByWidth() {
		Collections.sort(listProducts, new ProductSortByWidth());
		System.out.println(listProducts);
	}
	
	public void sortProductByWeight() {
		Collections.sort(listProducts, new ProductSortByWeigtht());
		System.out.println(listProducts);
	}
	
	public void getProductByIndex() {
		
		System.out.println("Enter index of the product which will be view");
		Scanner scanner = new Scanner(System.in);
		int productIndex = scanner.nextInt();
		
		System.out.println(listProducts.get(productIndex));
	}
	public void exitConsolle() {
		 System.exit(0);
	}
}
