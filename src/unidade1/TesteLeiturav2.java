
package unidade1;

import java.io.IOException;

public class TesteLeiturav2 {

	public static void main(String[] args) throws IOException {
		byte[] bytes = new byte[10];
		System.out.println("Digite algo: ");
			System.in.read(bytes);
		System.out.println("\n Eco: " + new String(bytes));
	}
}
