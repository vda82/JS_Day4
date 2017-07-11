package day4.HWforwhileetc;
//find min and max in the array
public class HW4_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = {1,2,3,89, 65, -4, -10};
		int max = array[0]; int min = array[0];
		for (int i = 0; i<array.length; i++) {
			if (max<array[i])
				max = array[i];
			if (min>array[i])
				min = array[i];
			System.out.println("max is" + max);
			System.out.println("min is" + min);
		}
	}

}
