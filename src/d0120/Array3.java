package d0120;

public class Array3 {
	
	public static void main(String[] args) {
		String[] strs = new String[10];
		// 1, 2, 짝, 4, 만세, 짝, 7, 8, 짝, 만세
		
		for(int i=0;i<strs.length;i++) {
			if((i+1)%3==0) {
				strs[i] = "짝";
			} else if((i+1)%5==0) {
				strs[i]= "만세";
			}else {
			strs[i] = i+1+"";
			}
		}
		for(int i=0;i<strs.length;i++) {
		System.out.println(i+":"+strs[i]);
		}
	}	
}
