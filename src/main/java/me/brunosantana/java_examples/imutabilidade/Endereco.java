package me.brunosantana.java_examples.imutabilidade;

//Classe Imutável
public class Endereco {
	
	private final String rua;
	private final int numero;
	
	public Endereco(String rua, int numero) {
		super();
		this.rua = rua;
		this.numero = numero;
	}
	
	public Endereco setRua(String novaRua) {
		return new Endereco(novaRua, numero);
	}
	
	public Endereco setNumero(int novoNumero) {
		return new Endereco(rua, novoNumero);
	}

	@Override
	public String toString() {
		return "Endereco [rua=" + rua + ", numero=" + numero + "]";
	}

}
