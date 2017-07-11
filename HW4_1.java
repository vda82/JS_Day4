package day4.HWforwhileetc;
// print out all numbers from 10 to 20 using all cycles

public class HW4_1 {

	public static void main(String[] args) {
		for(int i = 10; i <= 20; i++) {
			System.out.println("i =" + i);
		}
		
		int x = 10;
		while (x <= 20) {
			System.out.println("x =" + x);	
		     x = x + 1;
		}
		
		int y = 10;
		do {
			System.out.println("y = " + y++);
		} while (y <=20 );
		
		
		int [] f = {10,11,12,13,14,15,16,17,18,19,20};
		for (int p:f)
			System.out.println("p = " + p);
		
		int[] ff = new int[11];
		int res = 10;
		for (int cc:ff)
			System.out.println("res = " + res++);
		
	}

}



