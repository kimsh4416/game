package d0122;

public class Method {
	
	/*
	 * void or DataType
	 * 메소드 명이 같다고 하더라도 매개변수의 갯수가 다르거나 데이터타입이 다르거나
	 * 갯수와 데이터 타입이 같더라도 순서가 다르면 다른 메소드
	 */
	void test(int i) {
	}
	int number(String i) {
		return 0;
	}
	int test(int i, String s) {
		return 0;
	}
	int test(String s, int i) { 
		return 0;
	}
	public static void main(String[] args) {
		
	}
}
