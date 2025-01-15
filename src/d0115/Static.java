package d0115;

public class Static {//static 은 메모리를 생성하지 않아도 된다.
	static int i;
	static int test() {
		return 1;
	}
	
	public static void main(String[] args) {
		System.out.println(i);
		test();
	}
}
