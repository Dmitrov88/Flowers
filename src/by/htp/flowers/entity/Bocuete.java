package by.htp.flowers.entity;

public class Bocuete {

	private Flower[] flowers ;
	
	public Bocuete(Flower[] flowers) {
		this.flowers = flowers;
	}
	
	public int getPrice( ) {
		int price = 0;
		
		for (Flower flower:this.flowers) {
			price += flower.getPrice();
			
		}
					
		return price;
		
	}
	
}
