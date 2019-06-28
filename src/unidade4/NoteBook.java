package unidade4;

import java.util.ArrayList;

public class NoteBook {
	
	/*
	 * Essa aplicação cria um lista de notas.
	 * Resolução exercicio 2, 3 e 4.
	 * 
	 * */
	
	static ArrayList<String> anotacoes;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		anotacoes = new ArrayList<String>();
		anotacoes.add("Comprar Pão");
		anotacoes.add("Vender Carro");
		anotacoes.add("Encontro ás 11h30");
		
		double t1 = System.currentTimeMillis();
		for (int i = 3; i < 10003; i++) {
			anotacoes.add("texto_"+i);
		}
		double t2 = System.currentTimeMillis();
		System.out.println((t2 - t1)/1000); // exercicio 4
		//System.out.println(anotacoes); // exercicio 3
	}

}
