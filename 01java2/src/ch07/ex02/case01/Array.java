package ch07.ex02.case01;

public class Array {
	public static void main(String args){
		int[] arr = new int[3];
		System.out.println(arr);
		System.out.printf("%d %d %d\n", arr[0], arr[1], arr[2]);
		
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		System.out.printf("%d %d %d\n", arr[0], arr[1], arr[2]);
		
		for(int i=0; i<arr.length; i++){
			arr[i] = i ;
		}
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		for(int i : arr) System.out.print(i + " ");
		
		int[] array = {0,1,2};
		array = new int[]{0,1,2};
	}
}
