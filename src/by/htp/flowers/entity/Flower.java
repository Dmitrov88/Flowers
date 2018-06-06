package by.htp.flowers.entity;

public class Flower extends Bocuetepart {
	// ѕропустил 2 зан€ти€ и чувствую себ€ тупым
	
	private String name;
	private int cutoffDays;
	private int price;
	private String color;
	private double lenght;
	
	
	public Flower(int price, String color, String name, double lenght, int cutoffDays) {
		this.price = price;
		this.color = color;
		this.name = name;
		this.lenght = lenght;
		this.cutoffDays = cutoffDays;
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
	
	public double getLenght() {
		return this.lenght;
	}
	
	public int getCutoffDays() {
		return this.cutoffDays;
	}

}
