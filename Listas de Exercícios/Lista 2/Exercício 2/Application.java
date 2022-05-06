import java.util.Locale;
import java.io.*;

public class Application {
	public static void main(String args[]) {
		/* Para imprimir os valores decimais
		com ponto no lugar da vírgula */
		Locale.setDefault(Locale.US);

		BufferedReader reader = null;
		PrintWriter writer = null;

		try {
			reader = new BufferedReader(
					new InputStreamReader(
							new FileInputStream("funcionarios.txt")));

			writer = new PrintWriter(
					new OutputStreamWriter(
							new FileOutputStream("saida.txt")));

			String string;
			while ((string = reader.readLine()) != null) {
				String[] tokens = string.split(";", 4);

				double salary = Double.parseDouble(tokens[3]);

				double percentage = 0.0;
				// Nota: Se 'salary' <= 1903.98 então 'percentage' permanece 0.0

				if (salary > 1903.98 && salary <= 2826.65)
					percentage = 7.5;
				else if (salary > 2826.65 && salary <= 3751.05)
					percentage = 15;
				else if (salary > 3751.05 && salary <= 4664.68)
					percentage = 22.5;
				else if (salary > 4664.68)
					percentage = 27.5;

				double tax = salary * percentage / 100;

				writer.printf("%s;%.1f;%.2f\n", tokens[0], percentage, tax);
			}

		}
		catch (IOException ioException) {
			ioException.printStackTrace();
		}
		finally {
			try { if (reader != null) reader.close(); }
			catch (IOException ioException) { ioException.printStackTrace(); }

			if (writer != null) writer.close();
		}

	}
}
