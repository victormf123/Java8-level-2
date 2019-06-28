package unidade4;

import java.util.LinkedList;

public class LinkedListApp {

	public static void main(String[] args) {
		
		/*
		 * 
		 * A classe LinkedList utiliza internamente uma lista duplamente encadeada e a
		 * busca pelos seus elementos é feita de forma sequencial (via padrão Iterator)
		 * ou nas extremidades, e não de forma aleatória (por índices).
		 * 
		 * Um exemplo de uso é como uma fila (FIFO), onde os elementos são retirados 
		 * da lista na mesma sequência em que são adicionadas
		 * 
		 * SAIDA: [vermelho, verde, verde, amarelo]
		 * 
		 */
		
		LinkedList<String> linkedlist = new LinkedList<>();
		linkedlist.add("vermelho");
		linkedlist.add("verde");
		linkedlist.add("verde");
		linkedlist.add("amarelo"); 
		linkedlist.removeFirst();
		linkedlist.removeLast();
		System.out.println("LinkedList: " + linkedlist);
		
		

	}

}
