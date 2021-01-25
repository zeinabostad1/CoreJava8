

	import java.util.ArrayList;
	import java.util.ListIterator;
	public class Backward {
	   public static void main(String[] args) {
	      ArrayList<String> aList = new ArrayList<String>();
	      aList.add("Zizi");
	      aList.add("Alex");
	      aList.add("Sarah");
	      aList.add("Amin");
	      aList.add("Max");
	      ListIterator<String> li = aList.listIterator();
	      while (li.hasNext()) {
	         li.next();
	      }
	      System.out.println("The ArrayList elements in the reverse direction are: ");
	      while (li.hasPrevious()) {
	         System.out.println(li.previous());
	      }
	   }
	}
