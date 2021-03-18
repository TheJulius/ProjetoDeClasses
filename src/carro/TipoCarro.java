package carro;

public enum TipoCarro {
	
	POPULAR(1), ESPORTIVO(2), SUV(3);
	
	private TipoCarro(final int tipoDeCarro) {
		this.tipoDeCarro = tipoDeCarro;
	}
	
	private int tipoDeCarro;
	
	public int getTipoDeCarro() {
		return tipoDeCarro;
	}
}
