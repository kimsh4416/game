package d0120;

public class Method {
	
	int i = 1;
	
	void test() {
		System.out.println(i); // 5번 라인과 7번 라인은 두 라인이 다 non static 이라 i를 8번 라인에서 사용할 수 있다.
		int i = 2;
		System.out.println(i);
	}
	int test(int i) {
		return 1;
	}
}
