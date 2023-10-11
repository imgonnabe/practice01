package binding;

// @Controller
public class Super {
	
	/*private final TestService testService;
	
	@Autowired
	public Super(TestService testService) {// 생성자를 이용한 의존성 주입 : 생성되는 시점에 오류 확인
		this.testService = testService;
	}*/
	public void printA() {
		System.out.println("Super A");
	}
	
	public static void printB() {
		System.out.println("Super B");
	}
}
