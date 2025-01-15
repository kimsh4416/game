package d0115;

public class Method {
	
	int test() {
		return 0;
	}
	String test1() {
		return "";
	}
	// 데이터 타입 - 기본형,참조형
	// 메소드 - 데이터타입을 리턴하는것 , 아무것도 리턴하지 않는 것(void)
	public static void main(String[] args) {
		Method m = new Method();
		int i = m.test();
		String str = m.test1();
		System.out.println(i);
		System.out.println(str);
	}
}
