

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Trader {
	private String name; 
	private String city;
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	@Override
	public String toString() {
		return "Trader [name=" + name + ", city=" + city + "]";
	}



	public Trader(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}



	public static void main(String[] args) {
		List<Trader> trader =Arrays.asList(
				
				new Trader("Zeinab", "Atlanta"),
				new Trader("Sarah", "Boston"),
				new Trader("Alex", "Washington"),
				new Trader("Eric", "Washington"),
				new Trader("Foji", "New York")
					
				);	
		
		//9.unique cities in Traders
		List<Trader>uniqueCity=trader.stream()
				.distinct()
				.collect(Collectors.toList());
		
		uniqueCity.forEach(c->System.out.println(c.getCity()+" "));
	
		//10.Show all traders from Pune and sort them by name. 
		List<Trader> puneList = trader.stream()
				.filter(t->t.getCity().equals("Pune"))
				.sorted(Comparator.comparing(Trader::getCity))
				.collect(Collectors.toList());
		puneList.forEach(System.out::println);
		System.out.println("");
		
		
		//11.sort alphabetically 
		List<Trader>nameList=trader.stream()
				.sorted(Comparator.comparing(Trader::getName))
				.collect(Collectors.toList());
		nameList.forEach(n->System.out.print(n.getName()+" "));
		System.out.println("\t");
		System.out.println("");
		
		
		//12.traders based in Indore? 
		List<Trader> basedIndore = trader.stream()
				.filter(c->c.getCity().equals("Indore"))
				.collect(Collectors.toList());
		basedIndore.forEach(c->System.out.println(c.getName()));
	}


}
