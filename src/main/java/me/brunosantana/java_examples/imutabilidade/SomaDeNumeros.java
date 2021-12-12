package me.brunosantana.java_examples.imutabilidade;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SomaDeNumeros {
	
	Integer total;
	List<Integer> numeros;
	
	public SomaDeNumeros() {
		total = 0;
		numeros = new ArrayList<>();
	}
	
	public void addNumero(Integer numero) {
		numeros.add(numero);
		Integer contador = 0;
		for(Integer n : numeros) {
			contador += n;
		}
		total = contador;
	}
	
	public Integer getTotal() {
		return total;
	}
	
	public List<Integer> getNumeros() {
		return Collections.unmodifiableList(numeros);
	}

}
