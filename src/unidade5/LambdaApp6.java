package unidade5;

import java.util.Arrays;
import java.util.List;

public class LambdaApp6 {
	public static void main(String[] args) {
		/*
		 * 
		 * Neste código é passado um parâmetro do tipo Integer!    
		 * 
		 */
		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
		integers.forEach((Integer x)->{
			x = x + 10;
			System.out.println(x);
		});

	}

}
