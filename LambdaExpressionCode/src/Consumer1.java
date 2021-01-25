import java.util.function.Consumer;
class student{
	private String name;
public String getName() {
		return name;}public void setName(String name) {
		this.name = name;}}
//what Consumer dose: Modifies Date... there s no out put in that

public class Consumer1 {

	public static void main(String[] args) {
		
		student s= new student();
		Consumer<student> setName=t->t.setName("Hi java 8, this is Zizi");
		setName.accept(s);
		System.out.println(s.getName());
				
	}

}
