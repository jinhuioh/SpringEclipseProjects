package com.hi.mvc04;

public class ProductVo {

	private String id;
	private String price;
	private String title;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "ProductVo [id=" + id + ", price=" + price + ", title=" + title + "]";
	}

	
}
