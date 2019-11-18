package me.brunosantana.java_examples.classe_interna;

public class MyOuter2 {

	private int x = 7;
	
	class MyInner{
		public void seeOuter() {
			System.out.println("Outer x is " + x);
		}
	}

}

class Tester{
	// Instanciando uma classe interna fora da classe externa	
	public static void main(String[] args) {
		MyOuter2.MyInner in = new MyOuter2().new MyInner();
		in.seeOuter();
	}
}
