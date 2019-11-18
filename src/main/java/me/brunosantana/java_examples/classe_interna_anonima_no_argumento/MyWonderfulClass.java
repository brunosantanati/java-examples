package me.brunosantana.java_examples.classe_interna_anonima_no_argumento;

interface Foo{
	void foof();
}

class Bar{
	void doStuff(Foo f) {
		f.foof();
	}
}

public class MyWonderfulClass {
	
	void go() {
		Bar b = new Bar();
		b.doStuff(new Foo() {
			public void foof() {
				System.out.println("foofy");
			}
		});
	}

	public static void main(String[] args) {
		new MyWonderfulClass().go();
	}

}
