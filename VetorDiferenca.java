package Models;

public class VetorDiferenca {

	public static int diferencaNum(int[] nums, int num) {
		int result = 0;
		int elemento = nums[1];
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = 1; j < nums.length; j++) {
				if (nums[i] - elemento == num || nums[j] - nums[i] == num) {
					result ++;
				}
			}
		}
		return result;
	}
}
