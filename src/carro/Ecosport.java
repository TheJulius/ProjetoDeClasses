package carro;

public class Ecosport extends Carro {
	
	private String modelo;
	private int ano;
	
	public void addMarca(String nome) {
		Marca m = new Marca(nome);
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		if(modelo.length() != 0)
			this.modelo = modelo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		if(ano != 0)
			this.ano = ano;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Ecosport [modelo=");
		builder.append(modelo);
		builder.append(", ano=");
		builder.append(ano);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

	
	
	
	
	
}
