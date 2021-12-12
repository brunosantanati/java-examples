package me.brunosantana.java_examples.imutabilidade;

public class Principal {
	
	public static void main(String[] args) {
		
		//Testando Classe Imutável
		
		Endereco minhaCasa = new Endereco("Rua xpto", 1000);
		
		System.out.println(minhaCasa);
		
		Endereco outroEndereco = minhaCasa.setNumero(1200);
		
		System.out.println();
		System.out.println(minhaCasa);
		System.out.println(outroEndereco);
		
		Endereco trabalho = minhaCasa
				.setRua("Rua do trabalho")
				.setNumero(2000);
		
		System.out.println();
		System.out.println(minhaCasa);
		System.out.println(trabalho);
		
		// Testando Collections.unmodifiableList
		
		SomaDeNumeros soma = new SomaDeNumeros();
		soma.addNumero(10);
		soma.addNumero(20);
		soma.addNumero(15);
		System.out.println(soma.getTotal());
		System.out.println(soma.getNumeros());
		//soma.getNumeros().add(20); //Lança java.lang.UnsupportedOperationException
	}

}
