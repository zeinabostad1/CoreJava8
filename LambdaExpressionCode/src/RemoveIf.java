import java.util.ArrayList;

public class RemoveIf {

	public static void main(String[] args) {
		ArrayList<String> mylist1 = new ArrayList<String>();
		mylist1.add("zeinab");
		mylist1.add("Ali");
		mylist1.add("Alex");
		mylist1.add("Max");
		mylist1.add("Lian");
		mylist1.add("ThisIsjava80");
		mylist1.removeIf(name -> name.length() % 2  ==1);
		
		
		System.out.println(mylist1);
	}

}
