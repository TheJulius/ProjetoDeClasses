package carro;

public class Motor {
	
	private double potencia;
	
	public Motor() {
		
	}
	
	public Motor(double potencia) {
		setPotencia(potencia);
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		if(potencia != 0)
			this.potencia = potencia;
	}
	
	public boolean ligarDesligar(int comando) {
		if(comando == 0)
			return false;
		
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Motor [potencia=");
		builder.append(potencia);
		builder.append("]");
		return builder.toString();
	}
	
	

}
