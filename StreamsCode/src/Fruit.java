

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Fruit {

	
	private String fName;
	private int fCalories;
	private int fPrice;
	private String fColor;
	
	
	public String getfName() {
		return fName;
	}


	public void setfName(String fName) {
		this.fName = fName;
	}


	public int getfCalories() {
		return fCalories;
	}


	public void setfCalories(int fCalories) {
		this.fCalories = fCalories;
	}


	public int getfPrice() {
		return fPrice;
	}


	public void setfPrice(int fPrice) {
		this.fPrice = fPrice;
	}
	


	public String getfColor() {
		return fColor;
	}


	public void setfColor(String fColor) {
		this.fColor = fColor;
	}


	public Fruit(String FruitName, int FruitCalories, int FruitPrice, String FruitColor) {
		super();
		this.fName = FruitName;
		this.fCalories = FruitCalories;
		this.fPrice = FruitPrice;
		this.fColor = FruitColor;
	}


	
	@Override
	public String toString() {
		return "Fruit [FruitName=" + fName + ", FruitCalories=" + fCalories + ", FruitPrice=" + fPrice + ", FruitColor=" + fColor + "]";
	}


	public static void main(String[] args) {
		List<Fruit> fruits = Arrays.asList(
			
				new Fruit("Apple",   100,  88, "Red"),
				new Fruit("Banana",  120, 74,  "Yellow"),
				new Fruit("Cucumber",20,  32,  "Green"),
				new Fruit("Tomato",  30,  25,  "Red"),
				new Fruit("Orange",  140, 47,  "Orange")
				
				);
	//1. fruit names of low calories fruits. sorted in descending order of calories.		
		
		List<Fruit> descendCarlories= fruits.stream()
		.filter(f-> f.getfCalories()<100)		
		.sorted(Comparator.comparingInt(Fruit::getfCalories).reversed())
		.collect(Collectors.toList());
		
		descendCarlories.forEach(System.out::println);
		System.out.println("");
		
		
	//2. Display color wise list of fruit names. 

		List<Fruit> colorWised= fruits.stream()
				.sorted(Comparator.comparing(Fruit::getfColor))
				.collect(Collectors.toList());
						
		colorWised.forEach(System.out::println);
		
		System.out.println("------------------------------------");
		
	//3. Display only RED color fruits sorted 
				
		 List<Fruit>sortedPriceList= fruits.stream()
				 .filter(f->f.getfColor()=="red")
				 .sorted(Comparator.comparingInt(Fruit::getfPrice))
				 .collect(Collectors.toList());
		 sortedPriceList.forEach(System.out::println);	 
		 	 
	}

}
