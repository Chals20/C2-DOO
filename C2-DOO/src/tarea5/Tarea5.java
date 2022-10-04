package tarea5;

public class Tarea5 {

	public static void main(String[] args) {

		int A = 1;
		int B = 5;
		int C = 11;
		int D = 19;
		
		System.out.println("Valor inicial A: " +A);
		System.out.println("Valor inicial B: " +B);
		System.out.println("Valor inicial C: " +C);
		System.out.println("Valor inicial D: " +D);
		
		B = C;	//reasignacion valores
		C = A;
		A = D;
		D = B;	//como B es uno de las variables ya reasignadas, D toma el valor inicail de C, por lo que B y D seran iguales
		
		System.out.println("Valor final A: " +A);
		System.out.println("Valor final B: " +B);
		System.out.println("Valor final C: " +C);
		System.out.println("Valor final D: " +D);

	}

}
