package ex5_generic;

public class Gen2Main {
	public static void main(String[] args) {
		Integer arr[] = {1,2,3,4,5};
		Double arr1[] = {1.1, 2.2, 3.3, 4.4 , 5.5};
		Character arr2 [] = {'A', 'B', 'C', 'D', 'E'};
		
		Gen gen = new Gen();
		
		gen.printArr(arr);
		gen.printArr(arr1);
		gen.printArr(arr2);
	}
}
