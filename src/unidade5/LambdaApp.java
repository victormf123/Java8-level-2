package unidade5;

import java.util.Arrays;
import java.util.List;

public class LambdaApp {

	public static void main(String[] args) {
		/*
		 * 
		 * O método forEacg(...) aceita a função anônima como entrada e
		 * chamada a referida função para cada elemento da lista   
		 * 
		 * A função anônima é representada pela expressão abaixo, onde x 
		 * é o seu parâmentro do tipo inteiro.
		 * 
		 * x->System.out.println(x)
		 * 
		 */
		
		List<Integer> integers = Arrays.asList(1,2,3,4);
		integers.forEach(x->System.out.println(x));

	}

}
