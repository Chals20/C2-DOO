package tarea3;

public class Tarea3 {

	public static void main(String[] args) {

		int X = 5;	//variables
		int Y = 10;
		double N = 7.5;
		double M = 3.7;
		
		System.out.println("Valor de la variable X: " +X);	//valores de las variables por pantalla
		System.out.println("Valor de la variable Y: " +Y);
		System.out.println("Valor de la variable N: " +N);
		System.out.println("Valor de la variable M: " +M);
		
		int sumaInt = X+Y;	//operaciones int
		int diferenciaInt = X-Y;
		int productoInt = X*Y;
		double cocienteInt = X/Y; //el cociente puede ser double aunque al ser una operacion entre integrales no dara resultado decimal
		int restoInt = X%Y;
		
		System.out.println("Suma X+Y: " +sumaInt);
		System.out.println("Diferencia X-Y: " +diferenciaInt);
		System.out.println("Producto X*Y: " +productoInt);
		System.out.println("Cociente X/Y: " +cocienteInt);
		System.out.println("Resto X%Y: " +restoInt);
		
		double sumaDouble = N+M; //operaciones double
		double restaDouble = N-M;
		double productoDouble = N*M;
		double cocienteDouble = N/M;
		double restoDouble = N%M;
		
		System.out.println("Suma N+M: " +sumaDouble);
		System.out.println("Diferencia N-M: " +restaDouble);
		System.out.println("Producto N*M: " +productoDouble);
		System.out.println("Cociente N/M: " +cocienteDouble);
		System.out.println("Resto N%M: " +restoDouble);
		
		double suma = X+N;
		double cociente = Y/M;
		double resto = Y%M;
		
		System.out.println("Suma X+N: " +suma);
		System.out.println("Cociente Y/M: " +cociente);
		System.out.println("Resto Y%M: " +resto);
		
		int dobleX = X*2;
		int dobleY = Y*2;
		double dobleN = N*2;
		double dobleM = M*2;
		double sumaTotal = X+Y+N+M;
		double productoTotal = X*Y*N*M;
		
		System.out.println("Doble X: " +dobleX);
		System.out.println("Doble Y: " +dobleY);
		System.out.println("Doble N: " +dobleN);
		System.out.println("Doble M: " +dobleM);
		System.out.println("Suma total: " +sumaTotal);
		System.out.println("Producto total: " +productoTotal);
		
	}

}
