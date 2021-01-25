//we use Lambda expression to implement a function interface

//annotate interface 

@FunctionalInterface

//create a function interface 
interface Aritmatic{
	//create a method called operation, method argument  
	int operations (int a, int b);	
	
}
public class AritmaticOperationEx1 {

	//arithmetic operation
	//main method
	public static void main(String[] args) {
		
		//anonymous class implementation
		//addition operation 
		//lambda expression is an anonymous function(doesn't have any name)
		
		//convert anonymous class implementation to lambda expression 
		//Aritmatic addition = new Aritmatic() {	
			//@Override
			//public int operations(int a, int b) {
				//return (a+b); } };	
		
		Aritmatic add = ( a, b) -> (a + b);
		Aritmatic sub = ( a, b) -> (a - b);
		Aritmatic div = ( a, b) -> (a / b);
		Aritmatic mul = ( a, b) -> (a * b);
		//call the operation and pass the numbers
		System.out.println("Add = " + add.operations(40, 20));
		System.out.println("Sub = " + sub.operations(40, 20));
		System.out.println("Div = " + div.operations(40, 20));
		System.out.println("Mul = " + mul.operations(40, 20));
	}	
}
