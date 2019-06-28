package unidade4;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetApp {

public static void main (String[] args) {
		
		/*
		 * 
		 * A Classe TreeSet oferece um conjunto ordenado de elementos
		 * por intermédio de árvores balanceada red-black. 
		 *  
		 *	SAIDA:  [amarelo, verde, vermelho]
		 * 
		 */
		
		/*
		 * Programe orientado a Interfaces
		 * Utilizando aqui a classe Set
		 * 
		 */
	
		Set<String> lista = new TreeSet<>();
		lista.add("vermelho");
		lista.add("verde");
		lista.add("verde");
		lista.add("amarelo");
		System.out.print(lista);

	}
}
