package unidade5;

import java.util.Arrays;
import java.util.List;

public class LambdaApp2 {

	public static void main(String[] args) {
		/*
		 * Função realizada sem Lambda
		 * 
		 
		for( Integer inteiro:integers) {
			inteiro = inteiro + 10;
			System.out.println(inteiro);
		}
		*
		*Neste código o valor de x é incrementado em 10!
		*
		*/
		
		List<Integer> integers = Arrays.asList(1,2,3,4);
		integers.forEach(x->{
			x = x + 10;
			System.out.println(x);
			});

	}

}
