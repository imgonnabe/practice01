package binding;

public class Main {
	public static void main(String[] args) {// 실무 x
		// static final (변하지 않음) -> 환경변수로 빼놓기도 한다.
		
		Super super1 = new Super();
		Super sub = new Sub();

		super1.printA();
		super1.printB();
		
		sub.printA();
		sub.printB();// static
		Sub.printB();
	}
}
