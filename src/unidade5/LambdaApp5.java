package unidade5;

import java.util.Arrays;
import java.util.List;

public class LambdaApp5 {
	public static void main(String[] args) {
		/*
		 * 
		 * Neste código é criado uma variável local y!    
		 * 
		 */
		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
		integers.forEach(x->{
			int y = x/2;
			System.out.println(y);
		});

	}

}
