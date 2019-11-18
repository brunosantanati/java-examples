package me.brunosantana.java_examples.classe_interna_local_de_metodo;

public class MyOuter {
	
	private String x = "Outer";
	
	void doStuff() {
		
		String z = "local variable";
		final String y = "local variable";
		
		class MyInner{
			public void seeOuter() {
				System.out.println("Outer x is " + x);
				
				//System.out.println("z is " + z); //Não compila, gera erro: 
				//Cannot refer to the non-final local variable z defined in an enclosing scope
				
				System.out.println("y is " + y); //Pode acessar variável local de método somente se for final
			}
		}
		
		// Precisa criar a instância da classe interna de método, 
		// de dentro do método, mas abaixo da definição da classe
		MyInner mi = new MyInner();
		mi.seeOuter();
	}
	
	public static void main(String[] args) {
		new MyOuter().doStuff();
	}
}
