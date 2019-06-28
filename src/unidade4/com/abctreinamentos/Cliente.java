package unidade4.com.abctreinamentos;

public class Cliente {

	
	String cpf;
	String nome;
	String email;
	
	public Cliente(String cpf, String nome, String email) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + "]";
	}
	
	
	
	
	
//	public static void main(String[] args) {
//		
//		Curso java8 = new Curso("java8");
//		Curso oracle12c = new Curso("oracle12c");
//		
//		Set<Curso> cursosA = new HashSet<>();
//		Set<Curso> cursosB = new HashSet<>();
//		
//		cursosA.add(java8);
//		cursosA.add(oracle12c);
//		
//		cursosB.add(java8);
//		
//		//interseção
////		cursosA.retainAll(cursosB);
////		System.out.println("A intersec B");
////		System.out.println(cursosA);
//		
//		//Qual A - B
////		cursosA.removeAll(cursosB);
////		System.out.println("A - B");
////		System.out.println(cursosA);
//		
//		
//		cursosB.removeAll(cursosA);
//		System.out.println("B - A");
//		System.out.println(cursosB);
//		
//		
//	}
	
}
