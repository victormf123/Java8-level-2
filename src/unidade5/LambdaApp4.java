package unidade5;

import java.util.Arrays;
import java.util.List;

public class LambdaApp4 {
	
	static int numero;
	int somatorio;
	public static void main(String[] args) {
		/*
		 * 
		 * Deferente das variáveis locais, o acesso aos atributos de objeto
		 * e de classe podem ser lidos e modificados.Lambda    
		 * 
		 */
		
		List<Integer> integers = Arrays.asList(1,2,3,4);
		LambdaApp4 app = new LambdaApp4();
		integers.forEach(x->{
			numero = 10;
			x = x + numero;
			app.somatorio = app.somatorio + x;
			System.out.println(x);
		});
		System.out.println(app.somatorio);

	}

}
