package Exercício2;
import java.util.UUID;

public class Application {
	public static void main(String[] args){
		Endereco enderecoGenerico = new Endereco("Cydad", "Setor B", "R-04", "85147-142", 15);
		Produto produto1 = new Produto("ProdutoUm", "CategoriaUm", 78.0);
		Produto produto2 = new Produto("ProdutoDois", "CategoriaDois", 85.0);

		Gerente gerente1 = new Gerente("Fulano", "459782145-98", "4002-8922",
									enderecoGenerico, "7985132", 5000.0, 200.0);
		Gerente gerente2 = new Gerente("Ciclano", "154785362-47", "2298-2004",
									enderecoGenerico, "4567814", 8001.0, 50.0);

		Archive arquivo = new Archive();

		UUID ids[] = new UUID[4];
		ids[0] = gerente1.getID();
		ids[1] = gerente2.getID();
		ids[2] = produto1.getID();
		ids[3] = produto2.getID();

		arquivo.insert(gerente1);
		arquivo.insert(gerente2);
		arquivo.insert(produto1);
		arquivo.insert(produto2);

		int i = 0;
		for (Archivable archivable : arquivo.archivablesList){
			archivable = arquivo.find(ids[i]);
			System.out.println("\n| ARQUIVO " + (i + 1) + "|\n");
			System.out.println(archivable);
			i++;
		}

	}
}
