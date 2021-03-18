package carro;

public class Roda {
	
	private int aro;
	
	public Roda() {
		
	}
	
	public Roda(int aro) {
		setAro(aro);
	}

	public int getAro() {
		return aro;
	}

	public void setAro(int aro) {
		this.aro = aro;
	}
	
	public void trocarPecas(Suspensao suspensao, Freio freio) {
		System.out.println(suspensao.toString());
		System.out.println(freio.toString());
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Roda [aro=");
		builder.append(aro);
		builder.append("]");
		return builder.toString();
	}
}
