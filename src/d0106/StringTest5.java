package d0106;

public class StringTest5 {

	public static void main(String[] args) {
		String str1 = "안녕하십니까?" ;
		for(int i=0; i<7;i++) {
			String str = str1.substring(i,i+1);
			if("하".equals(str)) {
				System.out.println(i);
				}
			}
			System.out.println(str1.indexOf("하")); // index는 처음 수부터 찾으며 찾으면 찾기를 종료함
			System.out.println(str1.lastIndexOf("하")); // 끝에서부터 찾는 index
	}
}
