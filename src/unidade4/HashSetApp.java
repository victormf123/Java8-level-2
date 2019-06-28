package unidade4;

import java.util.HashSet;

public class HashSetApp {

	public static void main (String[] args) {
		
		/*
		 * 
		 * A Classe HashSet utiliza uma tabela hash para guardar os seus elementos,
		 * sem garantir a ordem de interação, nem que a mesma permanecerá constante
		 * com o tempo. Por utilizar o algoritimo de tabela hash, o acesso é rápido,
		 * tanto para leitura quanto para modificação. 
		 *  
		 *	SAIDA: [vermelho, amarelo, verde] 
		 * 
		 */
		
		HashSet<String> lista = new HashSet<>();
		lista.add("vermelho");
		lista.add("verde");
		lista.add("verde");
		lista.add("amarelo");
		System.out.print(lista);
		
		
		
		
	}
}
