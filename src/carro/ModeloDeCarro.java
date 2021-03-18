package carro;

import java.util.ArrayList;
import java.util.List;

public abstract class ModeloDeCarro{
	
	private String nome;
	private int ano;
	private double valor;
	
	List<Motor> lmotor = new ArrayList<Motor>();
	List<Roda> lroda = new ArrayList<Roda>();
		
	public ModeloDeCarro(String nome, int ano, double valor) {
		super();
		this.nome = nome;
		this.ano = ano;
		this.valor = valor;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public final void juntarPecas(Motor motor, Roda roda) {
		lmotor.add(motor);
		lroda.add(roda);
	}
	
	public static final int DefinirTipoCarro() {
		
		TipoCarro tipo = TipoCarro.SUV;
		
		switch(tipo) {
			case POPULAR: System.out.println("Carro Popular");
				break;
			case ESPORTIVO: System.out.println("Carro Esportivo");
				break;
			case SUV: System.out.println("Carro SUV");
		default: System.out.println("Tipo nao definido");
			break;
		}
		
		return tipo.getTipoDeCarro();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ModeloDeCarro [nome=");
		builder.append(nome);
		builder.append(", ano=");
		builder.append(ano);
		builder.append(", valor=");
		builder.append(valor);
		builder.append(", lmotor=");
		builder.append(lmotor);
		builder.append(", lroda=");
		builder.append(lroda);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
