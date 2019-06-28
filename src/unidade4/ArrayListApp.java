package unidade4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListApp {

	public static void main(String[] args) {
		
		/*
		 * 
		 * A classe ArrayList utiliza internamente um vetor (array) de objetos,
		 * cujo tamanho inicial é de 10 posições. Caso não seja suficiente, um 
		 * novo vetor é alocado com tamanho igual a 1.5 vezes maior e todo o conteúdo
		 * é copiado para este novo vetor.
		 * 
		 * Esta implementação é preferível quando o tamanho da lista é
		 * previsível (evitando realocações) e as operações de inserção 
		 * e remoção são feitas, em sua maioria, no fim da lista 
		 * (evitando deslocamentos), ou quando a lista é mais lida do que modificada
		 * (otimizado para leitura aleatória).
		 * 
		 * SAIDA: [amarelo, verde, verde, vermelho]
		 * 
		 */
		
		List<String> arraylist = new ArrayList<>();
		arraylist.add("vermelho");
		arraylist.add("verde");
		arraylist.add("verde");
		arraylist.add("amarelo");
		Collections.sort(arraylist);
		System.out.println("ArrayList: " + arraylist);
		

	}

}
