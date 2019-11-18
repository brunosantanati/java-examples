package me.brunosantana.java_examples.classe_interna;

public class MyOuter {

	private int x = 7;
	
	class MyInner{
		public void seeOuter() {
			System.out.println("Outer x is " + x);
		}
	}
	
	// Instanciando uma classe interna dentro da classe externa
	public void makeInner() {
		MyInner in = new MyInner();
		in.seeOuter();
	}
	
	public static void main(String[] args) {
		new MyOuter().makeInner();
	}

}
