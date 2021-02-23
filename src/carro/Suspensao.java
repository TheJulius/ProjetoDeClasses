package carro;

public class Suspensao {
	
	private double altura;
	private String tipo;
	
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		if(altura != 0)
			this.altura = altura;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		if(tipo.length() != 0)
			this.tipo = tipo;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Suspensao [altura=");
		builder.append(altura);
		builder.append(", tipo=");
		builder.append(tipo);
		builder.append("]");
		return builder.toString();
	}
	
	

}
