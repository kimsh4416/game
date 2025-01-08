package d0103;

public class Variable {

		public static void main(String[] args) {
			int num1 = 1;
			int num2 = 2;
			// 배열
			
			int[] nums = new int[5]; // int 배열 속 각각의 수는 int
			
			 // 배열이 생성될때 초기화 하지 않아도 기본수는 0 논리는 false
			
			for(int i=0; i<5 ; i++) {
				nums[i] = i+1;
			}
			
			for(int i=0; i<5 ; i++) {
				System.out.println(nums[i]);
			}
		}
}
