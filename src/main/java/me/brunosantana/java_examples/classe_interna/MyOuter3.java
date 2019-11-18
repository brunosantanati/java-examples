package me.brunosantana.java_examples.classe_interna;

public class MyOuter3 {

	private int x = 7;
	
	public void makeInner() {
		MyInner in = new MyInner();
		in.seeOuter();
	}
	
	class MyInner{
		
		private int y = 10;
		
		// Referenciando a instância interna ou externa de dentro da classe interna
		public void seeOuter() {
			System.out.println("Inner class ref is " + this);
			System.out.println("Inner y is " + this.y);
			System.out.println("Outer class ref is " + MyOuter3.this);
			System.out.println("Outer x is " + MyOuter3.this.x);
			System.out.println("Outer x is " + x);
		}
	}
	
	public static void main(String[] args) {
		MyOuter3 outer = new MyOuter3();
		MyOuter3.MyInner inner = outer.new MyInner();
		inner.seeOuter();
	}
}
