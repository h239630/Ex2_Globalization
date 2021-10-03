package no.hvl.dat152;

import java.util.ArrayList;
import java.util.List;

public class ProductMockDAO {
	
private List<Product> products;
private List<Description> descriptions;

	public ProductMockDAO() {
		products = new ArrayList<Product>();
		descriptions = new ArrayList<Description>();
		
		Product p1 = new Product(1, "White Coffee Cup(TM)", 6.50, "images/whitecup.jpg");
		Product p2 = new Product(2, "Black Coffee Cup(TM)", 4.75, "images/blackcup.jpeg");
		products.add(p1);
		products.add(p2);

		Description d11 = new Description(1, "no", 
				"Dette er den ultimate kaffe koppen for programvareutviklere til å fylle på med energi på sene kvelder.");

		Description d12 = new Description(1, "en", 
				"This is the ultimate coffee cup for software developers to replenish energy when doing a late night session.");
		
		Description d13 = new Description(1, "es", 
				"Esta es la taza de café definitiva para que los desarrolladores de software la repongan con energía nocturna.");
		
		Description d21 = new Description(2, "no", 
				"Denne svarte koppen er spesielt egnet til varme drikker som kaffe, te og kakao.");
		
		Description d22 = new Description(2, "en", 
				"This black cup is especially suitable for hot drinks such as coffee, tea and cocoa");
		
		Description d23 = new Description(2, "es", 
				"Esta taza negra es especialmente adecuada para bebidas calientes como café, té y cacao.");
		
		
		descriptions.add(d11);
		descriptions.add(d12);
		descriptions.add(d13);
		descriptions.add(d21);
		descriptions.add(d22);
		descriptions.add(d23);
	}
	
	
	public List<Product> getProdutcts() {
		return products;
	}
	
	public List<Description> getDescriptions() {
		return descriptions;
	}

}
