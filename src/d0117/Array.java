package d0117;

public class Array {

	public static void main(String[] args) {
		int[] nums = new int[2]; // 배열의 단점 : 방의 갯수를 정해주어야 한다. 방의 갯수를 늘이거나 줄일 수 없다.
		nums[0] = 20;
		nums[1] = 22;
		
		int[] tmps = nums; // {20,22}
		nums = new int[nums.length+1]; 
		for(int i =0;i<tmps.length;i++) {
			nums[i] = tmps[i];
		}
		
	}
}
