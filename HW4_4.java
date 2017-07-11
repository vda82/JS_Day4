package day4.HWforwhileetc;
//there is array of 10 numbers. Calculate sum except of first and last elements
public class HW4_4 {

	public static void main(String[] args) {
		int [] a = {10,20,30,40,50,60,70,80,90,100};
		int s = 0;
		for (int i = 0;i < a.length; i++) {
		s = s + a[i] ;	
		
		}
		int f = a.length-a.length;
		int l = a.length - 1;
		int ff = a[f];
		int ll = a[l];
		int d = s - ff - ll;
		System.out.println(d);
		
	}

}
