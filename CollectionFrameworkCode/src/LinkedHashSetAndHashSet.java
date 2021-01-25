import java.util.Arrays;
	import java.util.HashSet;
	import java.util.LinkedHashSet;
	import java.util.Set;
	import java.util.TreeSet;
	public class LinkedHashSetAndHashSet {
	    public static void main(String args[]){            
	        HashSet<String> fruitsStore = new HashSet<String>();
	        LinkedHashSet<String> fruitMarket = new LinkedHashSet<String>();
	        TreeSet<String> fruitBuzz = new TreeSet<String>(); 
	        for(String fruit: Arrays.asList("class1", "class2", "class3","class4")){
	            fruitsStore.add(fruit);
	            fruitMarket.add(fruit);
	            fruitBuzz.add(fruit); }   
	        //no ordering in HashSet – elements stored in random order
	        System.out.println("Ordering in HashSet :" + fruitsStore);
	        //insertion order or elements – LinkedHashSet storeds elements as insertion
	        System.out.println("Order of element in LinkedHashSet :" + fruitMarket);
	        //should be sorted order – TreeSet stores element in sorted order
	        System.out.println("Order of objects in TreeSet :" + fruitBuzz);
	        //Performance test to insert 10M elements in HashSet, LinkedHashSet and TreeSet
	        Set<Integer> numbers = new HashSet<Integer>();
	        long startTime = System.nanoTime();
	        for(int i =0; i<10000000; i++){
	            numbers.add(i);  }}}
