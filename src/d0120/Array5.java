package d0120;

public class Array5 {
	
	public static void main(String[] args) {
		int[] nums = new int[6];
		// 1-45까지의 난수를 6개 생성하여
		//nums의 0번째부터 5번째 방까지 대입
		for(int i = 0;i<nums.length;i++) {
			int rNum = (int)(Math.random()*45); // 0-44
			nums[i] = rNum + 1;// 1-45
		}
		for(int i = 0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
	}
}
