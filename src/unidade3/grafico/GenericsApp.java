package unidade3.grafico;

import java.util.List;
import java.util.ArrayList;

public class GenericsApp {

	public static void main(String[] args) {
		List<Shape> lista = new ArrayList<>();
		lista.add(new Circle());
		lista.add(new Rectangle());
		
//		Rectangle ret = lista.get(1); //Errado
		
//		List<?> ls = lista;

	}

}
