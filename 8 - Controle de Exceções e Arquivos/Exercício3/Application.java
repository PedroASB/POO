package Exercício3;

import java.io.*;

public class Application {
	public static void main(String args[]) {
		BufferedReader reader = null;
		PrintWriter writer = null;

		try {
			reader = new BufferedReader(
					new InputStreamReader(
							new FileInputStream("D:\\Projetos Java\\ProjectJava\\Aula 11\\src\\Exercício3\\first_file.txt")));

			writer = new PrintWriter(
					new OutputStreamWriter(
							new FileOutputStream("D:\\Projetos Java\\ProjectJava\\Aula 11\\src\\Exercício3\\second_file.txt")));

			String str;
			while ((str = reader.readLine()) != null) {
				writer.println(str);
			}

		} catch (IOException ioException) {
			ioException.printStackTrace();
		} finally {
			try {
				if (reader != null) reader.close();
			} catch (IOException ioException) {
				ioException.printStackTrace();
			}

			if (writer != null) writer.close();
		}

	}
}
