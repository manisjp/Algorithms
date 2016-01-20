import java.io.*;

class Algorithms {
	
	public static void main(String[] args) {
		int[] arr = {11, 8, 8, 1, 6, 3, 10};

		System.out.println(max(arr));

		int[] sortedArr = sort(arr);
		for (int i=0; i<arr.length; i++) {
			System.out.print(sortedArr[i] + ", ");
		}
	}
	
	public static int max(int[] array) {
		int maxVal = array[0];
		for (int i=0; i<array.length; i++) {
			if (array[i] > maxVal) {
				maxVal = array[i];
			}
		}
	  return maxVal;
	}

	public static int min(int[] array) {
		int minVal = array[0];

		for (int i=0; i<array.length; i++) {
			if (array[i] < minVal) {
				minVal = array[i];
			}
		}
	  return minVal;
	}

	public static int findIndex(int value, int[] array) {
		int index = 0;

		for (int i=0; i<array.length; i++) {
			if (value == array[i]) {
				index = i;
				break;
			}
		}
		return index;
	}

	public static int[] sort(int[] array) {
		int[] newArray = new int[array.length];
		int maxVal = max(array);
		for (int i=0; i<array.length; i++) {
			newArray[i] = min(array);
			array[findIndex(newArray[i], array)] = maxVal;
		}
		return newArray;
	}
}