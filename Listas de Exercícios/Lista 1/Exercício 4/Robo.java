public class Robo {
	/* Atributos */
	private int id;
	private String status;
	private int posicaoX;
	private int posicaoY;
	private double limiteArmazenamento;
	private double porcentagemRepositorio;
	private static int cont = 0;

	/* Métodos */

	// Construtor
	public Robo(double limiteArmazenamento){
		cont++;
		id = cont;
		this.status = "desligado";
		this.posicaoX = this.posicaoY = 0;
		this.porcentagemRepositorio = 0.0;
		setLimiteArmazenamento(limiteArmazenamento);
	}

	// toString
	public String toString(){
		return "ID: " + id + "\nStatus: " + status +
				"\nPosicao X: " + posicaoX + "\nPosicao Y: " +
				posicaoY + "\nLimite de armazenamento (cm^3): " +
				limiteArmazenamento + "\nPorcentagem do repositorio: "
				+ (porcentagemRepositorio * 100) + "%";
	}

	// Operações
	public void ligar(){
		status = "ligado";
	}

	public void desligar(){
		status = "desligado";
	}

	public boolean andar(int posicaoX, int posicaoY){
		if (status.equals("desligado"))
			return false;
		this.posicaoX += posicaoX;
		this.posicaoY += posicaoY;
		this.status = "andando";
		return true;
	}

	public boolean aspirar(double quantidadePo){
		if (status.equals("desligado") || limiteArmazenamento == 0)
			return false;

		porcentagemRepositorio += quantidadePo / limiteArmazenamento;

		if (porcentagemRepositorio * limiteArmazenamento >= limiteArmazenamento){
			System.out.println("O limite de armazenamento de po foi atingido."
								+ " Robo desligando.");
			desligar();
		}

		return true;
	}

	public boolean parar(){
		if (status.equals("desligado"))
			return false;
		this.status = "parado";
		return true;
	}

	// Getters
	public int getID() {
		return id;
	}

	public String getStatus() {
		return status;
	}

	public double getPosicaoX() {
		return posicaoX;
	}

	public double getPosicaoY() {
		return posicaoY;
	}

	public double getLimiteArmazenamento() {
		return limiteArmazenamento;
	}

	public double getPorcentagemRepositorio() {
		return porcentagemRepositorio;
	}

	// Setters
	public void setID(int id) {
		this.id = id;
	}

	public void setStatus(String status) {
		if (status.equals("ligado") || status.equals("andando")
				|| status.equals("parado") || status.equals("desligado")) {
			this.status = status;
		}
	}

	public void setPosicaoX(int posicaoX) {
		this.posicaoX = posicaoX;
	}

	public void setPosicaoY(int posicaoY) {
		this.posicaoY = posicaoY;
	}

	public void setLimiteArmazenamento(double limiteArmazenamento) {
		if (limiteArmazenamento > 0)
			this.limiteArmazenamento = limiteArmazenamento;
	}

	public void setPorcentagemRepositorio(double porcentagemRepositorio) {
		if (porcentagemRepositorio >= 0)
			this.porcentagemRepositorio = porcentagemRepositorio;
	}
}
