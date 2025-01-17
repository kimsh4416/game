package d0117;

public class Static3 {
	static int age = 10; // static이 붙기전은 각각의 int age, 붙은 후는 같은 곳을 바라보는 int age 값ㅓ 
	int age2;
	public static void main(String[] args) {
		
		Static3 s1 = new Static3();
		System.out.println(s1.age); //10
		System.out.println(s1.age2);//0
		s1.age = 20; 
		s1.age2 = 10;
		Static3 s2 = new Static3();
		System.out.println(s2.age); // int age 의 값이 20으로 바뀌었기 때문에 20
		System.out.println(s2.age2);//0
		
	}
}
