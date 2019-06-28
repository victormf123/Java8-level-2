package unidade5;

import java.util.ArrayList;
import java.util.List;

/*
 * O Stream traz para o Java uma forma mais funcional de se trabalhar com coleções 
 *  usando uma interface especifica para isso.
 * 
 * A interface Stream<T> representa uma sequencia de elementos nos quais uma ou 
 * mais operações(filter, sorted, map, match, count, reduce) poderão ser executadas
 * 
 * Essas operações poderão ser utilizado em outra operação. A segunda já retorna o 
 * resultado esperado.
 * 
 * Um novo método default stream() foi adicionado à interface Collection.
 * Como esta interface é "pai" de todas outras coleções, todas elas herdam 
 * esse novo método.
 * 
 * A execução dessas operações se dá de forma sequencial
 * (Collection.stream()) ou de forma paralela (Collection.parallelStream())
 * 
 * É importante ressaltar que o Stream gerado acima não é uma outra coleção. 
 * Ele não possui uma estrutura de dados interna para armazenar cada um dos elementos! 
 * Na verdade, ele usa uma coleção para executar uma serie de operações de forma sequencial
 * ou paralela
 * 
 * SOURCE -> PIPELINE -> TERMINAL
 * 
 * Um Stream possui:
 * 
 * Source - representa a fonte dos objetos a serem manipulados;
 * Pipeline - representa o conjunto de operações intermediárias que irão atuar nos 
 * elementos do Stream
 * 
 * Terminal - representa a operação final que irá extrair os elemnetos desejados.
 * 
 * É importante ressaltar que as operações intermediárias(pipeline) não executam, 
 * apenas preparam as estruturas para execução
 * 
 * Nas operações finais (terminal) as operações intermediárias (pipeline) são
 * executadas e é produzido um resultado.
 * 
 * MAP
 * É o métododefinido na interface Stream<T> que converte cada elemento recebido
 * em um outro objeto, de acordo com a função passada. É uma operação intermediária
 * 
 * É importante observar que a interface Map não prove suporte ao método stream().
 * 
 */

public class SteamApp {

	static List<String> funcionarios;
	
	public static void filtrar(String letra) {
		//FILTER
		// É o método definido na interface Stream<T> que realiza um 'filtro'
		// nos elementos de uam coleção
		funcionarios.stream().filter(s->s.startsWith(letra)).forEach(System.out::println);
	}
	public static void ordenar(String letra) {
		//SORTED
		// É o método definido na interface Stream<T> que realiza ordena os elementos 
		// de uam coleção. É uma operação intermediária.
		funcionarios.stream().sorted().filter(s->s.startsWith(letra)).forEach(System.out::println);
	}
	public static void contar(String letra) {
		long contador = funcionarios.stream().filter(s->s.startsWith(letra)).count();
		System.out.println(contador);
	}
	
	public static void main(String[] args) {
		
		funcionarios = new ArrayList<>();
		funcionarios.add("Antonio");
		funcionarios.add("José");
		funcionarios.add("Pedro");
		funcionarios.add("João");
		funcionarios.add("Andreia");
		
		//filtrar("A");
		//ordenar("A");
		contar("A");

	}

}
