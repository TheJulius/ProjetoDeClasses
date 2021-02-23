package carro;

public class Freio {
	
	private String pinca;
	private String disco;
	
	public Freio() {
		
	}
	
	public Freio(String pinca, String disco) {
		setPinca(pinca);
		setDisco(disco);
	}
	
	public String getPinca() {
		return pinca;
	}
	public void setPinca(String pinca) {
		if(pinca.length() != 0)
			this.pinca = pinca;
	}
	public String getDisco() {
		return disco;
	}
	public void setDisco(String disco) {
		if(disco.length() != 0)
			this.disco = disco;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Freio [pinca=");
		builder.append(pinca);
		builder.append(", disco=");
		builder.append(disco);
		builder.append("]");
		return builder.toString();
	}
	
	
}
