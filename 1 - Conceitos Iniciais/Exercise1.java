import java.util.Scanner;

class Exercise1 {
	public static void main(String[] args) {
		int value1, value2, value3, value4;
		int sum, mult;

		Scanner input = new Scanner(System.in);

		value1 = input.nextInt();
		value2 = input.nextInt();
		value3 = input.nextInt();
		value4 = input.nextInt();

		sum = value1 + value2 + value3 + value4;
		mult = value1 * value2 * value3 * value4;

		System.out.printf("Sum = %d\n", sum);
		System.out.printf("Multiplication = %d\n", mult);

		input.close();
	}
}