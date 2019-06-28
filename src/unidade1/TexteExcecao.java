package unidade1;

public class TexteExcecao {
	
	@SuppressWarnings("all")
	public static void main(String[] args) {
		
		try {
			
			int i = 50;
			//i = i /0;
			
			System.out.println("O resultado  "+ i);
			Object c = new Mec();
			System.out.println("O resultado  "+ c.toString());
			
		} catch (ArithmeticException | NullPointerException e) {
			e.printStackTrace();
		}
		
	}

}
