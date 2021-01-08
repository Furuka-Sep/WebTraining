package model;

import java.io.Serializable;

public class Product implements Serializable{
	private String name;
	private String price;
	private String total;
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = String.valueOf(Integer.parseInt(this.total)+Integer.parseInt(total));
	}
	public Product(){}
	public Product(String name,String price,String product){
		this.name=name;
		this.price=price;
		this.total="product";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

}
