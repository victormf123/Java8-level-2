package unidade5;

import java.util.Arrays;
import java.util.List;

public class LambdaApp3 {
	public static void main(String[] args) {
		/*
		 * 
		 * As variáveis podem ser lidas 'fora'do escopo das Expresões Lambdas 
		 * Contudo, essas variáveis não podem ser modificadas.   
		 * 
		 */
		int numero = 10;
		List<Integer> integers = Arrays.asList(1,2,3,4);
		integers.forEach(x->{
			
			x = x + numero;
			System.out.println(x);
		});

	}

}
