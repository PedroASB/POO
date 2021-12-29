public class Util {
	private String cpf;

	public void setCPF(String cpf){
		this.cpf = cpf;
	}

	public String getCPF(){
		return this.cpf;
	}

	public boolean valido() {
		int soma1, soma2, resto1, resto2;
		byte[] bytes = this.cpf.getBytes();

		for (int i = 0; i < bytes.length; i++){
			bytes[i] = (byte) (bytes[i] - 48);
		}

		/* Validação dos CPFs inválidos conhecidos
		SE dig1 = dig2 = dig3 = dig4 = dig5 = dig6 =
			dig7 = dig8 = dig9 = dig10 = dig11 ENTAO
		CPF INVÁLIDO
		FIM_SE */

		soma1 = bytes[0] * 10 + bytes[1] * 9 + bytes[2] * 8 +
				bytes[4] * 7 + bytes[5] * 6 + bytes[6] * 5 +
				bytes[8] * 4 + bytes[9] * 3 + bytes[10] * 2;

		resto1 = (soma1 * 10) % 11;
		if (resto1 == 10) resto1 = 0;

		soma2 = bytes[0] * 11 + bytes[1] * 10 + bytes[2] * 9 +
				bytes[4] * 8 + bytes[5] * 7 + bytes[6] * 6 +
				bytes[8] * 5 + bytes[9] * 4 + bytes[10] * 3 + bytes[12] * 2;

		resto2 = (soma2 * 10) % 11;
		if (resto2 == 10) resto2 = 0;

		return ( (resto1 == bytes[12]) && (resto2 == bytes[13]) );
	}
}
