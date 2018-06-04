package by.htp.flowers.entity;

public class Flower extends Bocuetepart {
	// ѕропустил 2 зан€ти€ и чувствую себ€ тупым
	
	private int price;
	private String color;
	private String name;
	private int lenght;
	
	public Flower() {
		
	}
	
	public Flower(int price, String color, String name, int lenght) {
		this.price = price;
		this.color = color;
		this.name = name;
		this.lenght = lenght;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getLenght() {
		return this.lenght;
	}

}
