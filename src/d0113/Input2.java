package d0113;

import java.util.Random;
import java.util.Scanner;

public class Input2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		
		System.out.print("원하는 숫자를 적으세요 : ");
		String numStr = s.nextLine();
		int num = Integer.parseInt(numStr);
		int targetNum = r.nextInt(100)+1;
		
		while(num!=targetNum) {
		if(num<targetNum) {
			System.out.println("Up");
		}else if(num>targetNum) {
			System.out.println("Down");
		}
		System.out.println("원하는 숫자를 적으세요 : ");
		numStr = s.nextLine(); 
		
		System.out.println("맞췄다!");
		System.out.println("니가 쓴 숫자 : " + numStr);
		}
	}	

}
