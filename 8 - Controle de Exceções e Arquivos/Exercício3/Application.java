package Exercício3;

import java.io.*;

public class Application {
	public static void main(String args[]) {
		BufferedReader reader = null;
		PrintWriter writer = null;

		try {
			reader = new BufferedReader(
					new InputStreamReader(
							new FileInputStream("first_file.txt")));

			writer = new PrintWriter(
					new OutputStreamWriter(
							new FileOutputStream("second_file.txt")));

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
