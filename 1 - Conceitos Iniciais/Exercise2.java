import java.util.Scanner;

class Exercise2 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double grade1, grade2, grade3, mean;

		String student = input.nextLine();

		grade1 = input.nextDouble();
		grade2 = input.nextDouble();
		grade3 = input.nextDouble();

		mean = (grade1 + grade2 + grade3) / 3.0;

		System.out.println(student);
		System.out.println(mean);

		input.close();
	}
}