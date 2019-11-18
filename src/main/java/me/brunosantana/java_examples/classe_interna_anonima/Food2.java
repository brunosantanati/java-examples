package me.brunosantana.java_examples.classe_interna_anonima;

interface Cookable{
	public void cook();
}

public class Food2 {
	
	Cookable c = new Cookable() {

		public void cook() {
			System.out.println("anonymous cookable implementer");			
		}
		
	};

	public static void main(String[] args) {
		new Food2().c.cook();
	}

}
