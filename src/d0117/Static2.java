package d0117;

public class Static2 {
	int age = 1;
	static int height;
	
	//return - 무언가 값을 내뱉거나 method를 나가버린다.
	
	void test(int n) {
		System.out.println("테스트 시작");
		if(n==1) {
			return;
		}
		System.out.println("테스트 종료");
	}
	
	
	public static void main(String[] args) {
		height = 1;
		System.out.println(height);
		
		Static2 s = new Static2();
		
		System.out.println(s.age); //1
		System.out.println(s.height); //1
		s.test(1);
	}
}
