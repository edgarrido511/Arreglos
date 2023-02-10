
public class Programa {

	public static void main(String[] args) {
		Programa b = new Programa();
		int[] guardaNumeros = new int[15];
		int[] prueba = new int[20];
		String[] guardaNombres = new String[20];
		Estudiante a = new Estudiante();
		String[] estudiantes = new String[100];
		for (int i = 0;i<estudiantes.length;i++) {
			estudiantes[i] = a.nombre;
			//System.out.println(i+1 + " " + estudiantes[i]);
		}
		for(int i = 0;i<prueba.length;i++) {
			prueba[i] = i+1;
		}
		guardaNumeros[9] = 5;
		guardaNombres[0] = "Francisco";
		//b.imprimeNumeros(guardaNumeros);
		//b.imprimeNombres(estudiantes);
		//b.buscaArregloNum(guardaNumeros, 9);
		//b.buscaArregloNom(estudiantes, 6);
		//b.remplazaArreglo(prueba, 5);
		for (int i = 19;i>=prueba[5];i--) {
			prueba[i-1]=prueba[i];
		}
		for(int i = 0;i<prueba.length;i++) {
			System.out.println(prueba[i]);
		}
	}
	public static void imprimeNumeros(int[]arreglo) {
		for(int i = 0;i<arreglo.length;i++) {
			System.out.println(arreglo[i]);
		}
	}
	public static void imprimeNombres(String[]arreglo) {
		for(int i = 0;i<arreglo.length;i++) {
			System.out.println(arreglo[i]);
		}
	}
	public static void buscaArregloNum(int[]arreglo,int posicion) {
		System.out.println(arreglo[posicion]);
	}
	public static void buscaArregloNom(String[]arreglo,int posicion) {
		System.out.println(arreglo[posicion]);
	}
	public static void remplazaArreglo(int[] arreglo, int posicion) {
		for (int i = arreglo.length-1;i>posicion;i--) {
			if(posicion == i) {
				arreglo[i] = posicion-1;
			}
		}
		for(int i = 0;i<arreglo.length;i++) {
			System.out.println(arreglo[i]);
		}
	}
}
