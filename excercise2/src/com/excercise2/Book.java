package com.excercise2;

public class Book {

	private int id;
	private String bookName;
	private String author;
	private double price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public Book(int id, String bookName, String author, double price, String customerType) {
		super();
		this.id = id;
		this.bookName = bookName;
		this.author = author;
		this.price = price;
		
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
