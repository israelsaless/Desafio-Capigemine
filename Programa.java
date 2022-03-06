package Application;

import java.util.Arrays;

import Models.MedianaArray;
import Models.VetorDiferenca;

public class Programa {

	public static void main(String[] args) {
		
		int num = MedianaArray.medianaList(Arrays.asList(9,2,1,4,6));
		System.out.println(num);
		
		int num2 = VetorDiferenca.diferencaNum(new int[]{1,5,3,4,2}, 2);
		System.out.println(num2);
		
	}
}
