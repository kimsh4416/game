package d0115;

import java.util.Scanner;

public class Scanner2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("1-9까지 원하는 숫자를 적어주세요 : ");
		String numStr = s.nextLine();

		int num = Integer.parseInt(numStr);
		for(int i=1;i<100;i++) {
			if(i%10==num||i/10==num) {
				System.out.println(i+":짝");
			}else {
				System.out.println(i);	
			}
		}
		
	}

}
