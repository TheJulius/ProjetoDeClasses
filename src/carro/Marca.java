package carro;

public class Marca {
	
	private String nome;
	
	public Marca (String nome) {
		setNome(nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(nome.length() != 0)
			this.nome = nome;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Marca [nome=");
		builder.append(nome);
		builder.append("]");
		return builder.toString();
	}
	
	

}
