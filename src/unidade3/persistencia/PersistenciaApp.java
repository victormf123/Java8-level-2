package unidade3.persistencia;

public class PersistenciaApp {
	
	public static void main(String[] args) {
		
		GenericDAO<Object> admin = new  GenericDAO<Object>();
		admin.create(admin);
	}

}
