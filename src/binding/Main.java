package binding;

public class Main {
	public static void main(String[] args) {
		Super super1 = new Super();
		Super sub = new Sub();

		super1.printA();
		super1.printB();
		
		sub.printA();
		sub.printB();
		Sub.printB();
	}
}
