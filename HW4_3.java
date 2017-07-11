package day4.HWforwhileetc;
import java.util.Arrays;
public class HW4_3 {

	public static void main(String[] args) {
		int[] a = new int[101];
		int k = 100;
		for (int i = 0; i < 101; i++) {
		a[i] = k;
		k--;
		
		    }
		System.out.println(Arrays.toString(a));

	}

}
