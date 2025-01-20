package d0120;

public class Constructor {
	public Constructor() {
		System.out.println("어? 내 메모리를 생성했구나~");
	}
	public static void main(String[] args) {
		Constructor c = new Constructor();
		c = new Constructor();
	}
}
