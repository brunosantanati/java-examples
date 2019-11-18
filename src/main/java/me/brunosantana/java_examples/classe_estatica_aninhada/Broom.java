package me.brunosantana.java_examples.classe_estatica_aninhada;

class BigOuter {
	// Uma classe aninhada estática não tem acesso as variáveis e aos métodos não-estáticos de instância da classe externa
	// Ela é um membro estático da classe encapsuladora, pois não existe classe estática.
	// Por ser um membro estático, isso signifca que ela pode ser acessada sem ter uma instância da classe externa
	static class Nest { void go() { System.out.println("hi"); } }
}

public class Broom{
	
	static class B2 { void goB2() { System.out.println("hi 2"); } }
	
	public static void main(String[] args) {
		BigOuter.Nest n = new BigOuter.Nest();
		n.go();
		B2 b2 = new B2();
		b2.goB2();
	}
}
