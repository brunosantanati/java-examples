package me.brunosantana.java_examples.classe_interna_anonima;

class Popcorn{
	public void pop() {
		System.out.println("popcorn");
	}
}

public class Food {
	
	Popcorn p = new Popcorn() {
		public void sizzle() {
			System.out.println("anonymous sizzling popcorn");
		}
		
		public void pop() {
			System.out.println("anonymous popcorn");
			sizzle(); //usar o método de dentro da classe OK
		}
	};

	public static void main(String[] args) {
		new Popcorn().pop();
		
		Food f = new Food();
		f.p.pop();
		//f.p.sizzle(); //Inválido, pois Popcorn não tem método sizzle()! erro:
		//The method sizzle() is undefined for the type Popcorn
	}

}
