public class Cereal {
	// Atributos
	private String name;
	private String minerals;
	private boolean gluten;
	private double fiberContent;

	// Getters
	public String getName(){
		return this.name;
	}

	public String getMinerals(){
		return this.minerals;
	}

	public double getFiberContent(){
		return this.fiberContent;
	}

	// Setters
	public void setName(String name){
		this.name = name;
	}

	public void setMinerals(String minerals){
		this.minerals = minerals;
	}

	public void setFiberContent(double fiberContent){
		this.fiberContent = fiberContent;
	}

	public void setGluten(boolean gluten){
		this.gluten = gluten;
	}

	// Outros métodos
	public boolean hasGluten(){
		return gluten;
	}

	public String toString(){
		return ("Nome: " + this.name + "\nMinerais: " +
				this.minerals + "\nContem Gluten: " +
				(this.gluten ? "sim" : "nao") +
				"\nTeor de fibras: " + this.fiberContent);
	}
}
