import java.util.Scanner;

class Exercise3 {
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		int i, maxValue = 0;
		int[] values = new int[5];
		double mean = 0;

		for (i = 0; i < 5; i++){
			values[i] = input.nextInt();
		}

		i = 0;
		while (i < 5){
			if (i == 0)
				maxValue = values[i];
			else if (values[i] > maxValue)
				maxValue = values[i];

			mean += values[i];
			i++;
		}
		mean /= 5;

		System.out.printf("Mean = %.2f\nMax Value = %d\n", mean, maxValue);

		input.close();
	}
}