import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Metodos{

	public void ordenamientoPorSeleccion(long[] numerosx) {
		int recorrido=0, intercambio=0;
		long tini, tfin;
		tini=System.currentTimeMillis();
		for (int i = 0; i < numerosx.length; i++) {
			int minimo=i;
			for (int j = i+1; j < numerosx.length; j++) {
				if (numerosx[j]<numerosx[minimo]) {
					minimo=j;
				}
				long aux=numerosx[i];
				numerosx[i]=numerosx[minimo];
				numerosx[minimo]=aux;
				intercambio++;
			}
			recorrido++;
		}
		tfin=System.currentTimeMillis();
		System.out.println("tiempo procesamiento: "+(tfin-tini));
		System.out.println("recorrido: "+recorrido);
		System.out.println("Intercambio: "+intercambio);
	}
	
	public void insercion(long numeros[]) {
		long tfin,tini, aux;
		int recorrido=0, j, intercambio=0, comparacion=0;
		tini=System.currentTimeMillis();
		for (int i = 1; i < numeros.length; i++) { // desde el segundo elemento hasta
			aux = numeros[i]; // el final, guardamos el elemento y
			j = i - 1; // empezamos a comprobar con el anterior
			comparacion++;
			while ((j >= 0) && (aux < numeros[j])) { // mientras queden posiciones y el
												// valor de aux sea menor que los
				numeros[j + 1] = numeros[j]; // de la izquierda, se desplaza a
				j--; 
				comparacion++;// la derecha
				
			}
			numeros[j + 1] = aux; // colocamos aux en su sitio
			intercambio++;
			recorrido++;
		}

		tfin=System.currentTimeMillis();
		System.out.println("Tiempo procesamiento: "+(tfin-tini));
		System.out.println("Recorrido: "+recorrido);
		System.out.println("Intercambio: "+intercambio);
		System.out.println("Comparacion: "+comparacion);
	}
	
	public void mostrarVector(long[] numeros) {
		System.out.println(Arrays.toString(numeros));
	}
}

public class PruebaMetodos {
public static void main(String[] args) {
	Random random = new Random();
	Scanner sc = new Scanner(System.in);
	System.out.println("Seleccion del metodo: ");
	System.out.println("1) Seleccion.");
	System.out.println("2) Insercion.");
	byte op = sc.nextByte();
	
	long [] numeros= new long[100];
	for (int i = 0; i < numeros.length; i++) {
		numeros[i]=random.nextInt(100);
	}
	
	long[] numeros2= new long[1000];
	for (int i = 0; i < numeros2.length; i++) {
		numeros2[i]=random.nextInt(100);
	}
	
	long[] numeros3= new long[10000];
	for (int i = 0; i < numeros3.length; i++) {
		numeros3[i]=random.nextInt(100);
	}
	
	long[] numeros4= new long[100000];
	for (int i = 0; i < numeros4.length; i++) {
		numeros4[i]=random.nextInt(100);
	}
	
	long [] numeros5= new long[1000000];
	for (int i = 0; i < numeros5.length; i++) {
		numeros5[i]=random.nextInt(100);
	}
	
	Metodos metodos = new Metodos();
	switch (op) {
	case 1: 
		System.out.println("~~~~~~~~~~~~~~~~ Metodo Seleccion~~~~~~~~~~~~~~~~~~");
		System.out.println("Prueba 100 numeros");
		metodos.mostrarVector(numeros);
		metodos.ordenamientoPorSeleccion(numeros);
		metodos.mostrarVector(numeros);
		System.out.println();
		System.out.println("Prueba 1000 numeros");
		metodos.mostrarVector(numeros2);
		metodos.ordenamientoPorSeleccion(numeros2);
		metodos.mostrarVector(numeros2);
		System.out.println();
		System.out.println("Prueba 10000 numeros");
		metodos.mostrarVector(numeros3);
		metodos.ordenamientoPorSeleccion(numeros3);
		metodos.mostrarVector(numeros3);
		System.out.println();
		System.out.println("Prueba 100000 numeros");
		metodos.mostrarVector(numeros4);
		metodos.ordenamientoPorSeleccion(numeros4);
		metodos.mostrarVector(numeros4);
		System.out.println();
		System.out.println("Prueba 1000000 numeros");
		metodos.mostrarVector(numeros5);
		metodos.ordenamientoPorSeleccion(numeros5);
		metodos.mostrarVector(numeros5);
		break;
	case 2:	
		System.out.println("~~~~~~~~~~~~~~~~~~~ Metodo Insercion~~~~~~~~~~~~~~~~~~");
		System.out.println("Prueba 100 numeros");
		metodos.mostrarVector(numeros);
		metodos.insercion(numeros);
		metodos.mostrarVector(numeros);
		System.out.println();
		System.out.println("Prueba 1000 numeros");
		metodos.mostrarVector(numeros2);
		metodos.insercion(numeros2);
		metodos.mostrarVector(numeros2);
		System.out.println();
		System.out.println("Prueba 10000 numeros");
		metodos.mostrarVector(numeros3);
		metodos.insercion(numeros3);
		metodos.mostrarVector(numeros3);
		System.out.println();
		System.out.println("Prueba 100000 numeros");
		metodos.mostrarVector(numeros4);
		metodos.insercion(numeros4);
		metodos.mostrarVector(numeros4);
		System.out.println();
		System.out.println("Prueba 1000000 numeros");
		metodos.mostrarVector(numeros5);
		metodos.insercion(numeros5);
		metodos.mostrarVector(numeros5); 
		break;
	default: System.out.println("Opcion incorrecta :)");break;
	}
	sc.close();
}
}
