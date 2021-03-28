package assignment2;

public class Assignment2 {
	public static int addAllDigits(int inputNumber) {
		int sum = 0;
		while(inputNumber > 0) {
			sum += inputNumber % 10;
			inputNumber = inputNumber / 10;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(addAllDigits(530));
	}

}
