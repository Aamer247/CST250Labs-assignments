package assignment1;

import java.util.Arrays;

public class Assignment1 {

	public static void main(String[] args) {

		copyPrintArray();

		int[] intArray = { 5, 4, 7, 8, 9, 6, 2, 3, 6 };
		System.out.println(Arrays.toString(removeElement(intArray, 2)));

		System.out.println(getSumOfEvenNumbers());
		
		System.out.println(highestElement(intArray));
	}

	private static void copyPrintArray() {
		String[] array1 = { "word1", "word2", "word3", "word4" };
		String[] array2 = new String[array1.length];

		for (int i = 0; i < array1.length; i++) {
			array2[i] = array1[i];
			array1[i] = "_" + array1[i];
		}

		System.out.println("Array 1 Elements");
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " ");
		}

		System.out.println("\nArray 2 Elements");
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + " ");
		}
		System.out.println();
	}

	private static int[] removeElement(int[] array, int n) {
		int[] newArray = new int[array.length - 1];
		int index = 0;
		for (int i = 0; i < newArray.length; i++) {
			if (i != n) {
				newArray[index++] = array[i];
			}
		}
		return newArray;
	}

	private static int getSumOfEvenNumbers() {
		int[] array1 = { 45, 21, 22, 31, 44, 65, 12, 56, 78, 19, 100 };

		int totalEven = 0;
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] % 2 == 0) {
				totalEven++;
			}
		}

		int newArray[] = new int[totalEven];
		int index = 0;
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] % 2 == 0) {
				newArray[index++] = array1[i];
			}
		}

		int sum = 0;
		for (int i = 0; i < newArray.length; i++) {
			sum += newArray[i];
		}
		return sum;
	}

	public static int highestElement(int[] inputArray) {
		int highestElement = Integer.MIN_VALUE;
		for(int i = 0; i < inputArray.length; i++) {
			if(inputArray[i] > highestElement) {
				highestElement = inputArray[i];
			}
		}
		return highestElement;
	}
}
