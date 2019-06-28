package unidade5;

public interface Formula {

	double calcular(); // apenas 1 método abstrato!
	
	default double sqrt(int a) {
		return Math.sqrt(a);
	}
	
	default double sqrtX(int a , int b)
	{
		return Math.pow(a, 1/b);
	}
}
