package unidade4;

import java.util.LinkedHashSet;

public class LinkedHashSetApp {

	public static void main (String[] args) {
		
		/*
		 * 
		 * A Classe LinkedHashSet é uma subclasse de Hashset que adiciona 
		 * previsibilidade à ordem de interação sobre os elementos, isto é, 
		 * garante a ordem com que os elementos presentes no conjunto são
		 * recuperados.
		 *  
		 *	SAIDA: [vermelho, verde, amarelo] 
		 * 
		 */
		
		LinkedHashSet<String> lista = new LinkedHashSet<>();
		lista.add("vermelho");
		lista.add("verde");
		lista.add("verde");
		lista.add("amarelo");
		System.out.print(lista);

	}
}
