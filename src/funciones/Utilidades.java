package funciones;


/**
 * clase de utilidades
 * @author IFCD0111ADRI
 *
 */
public class Utilidades {

	/**
	 * Constante que contiene el número de horas de una jornada normal
	 * {@value}
	 */
	public static final int HORASJORNADA = 38;
	
	/**
	 * Método de la clase que devuelve la representación textual de la nota
	 * pasada como parámetro
	 * @param nota double con la nota a comprobar
	 * @return Una cadena de tipo String con el texto resultante (Suspenso, Bien,
	 * Notable, Sobrasaliente o Matrícula)
	 * @throws ArithmeticException cuando la nota no está entre 0 y 10
	 */
	public String devuelveNota(double nota) {
		
		String not; //no es necesario crear esta variable poque se puede poner un return y la palabra como si fuese un String
		
		if (nota < 0 || nota > 10) 
			throw new ArithmeticException("Se puede poner cualquier mensaje aqui");
		
		if (nota >= 0 && nota < 5) {
			not = "Suspenso";
		}else if (nota >= 5 && nota < 6.5) {
			not = "Bien";
		}else if (nota >= 6.5 && nota < 8.5) {
			not = "Notable";
		}else if (nota >= 8.5 && nota <= 9.9) {
			not = "Sobresaliente";
		}else { 
			not = "Matrícula";
		}	
		return not;
		}
	
	
/**
 * Metodo que calcula el salario de un empleado dado el numero de horas que ha trabajado, el precio por hora y el precio de las horas extras
 * se pagaran hasta {@link HORASJORNADA} con el precioHoras, el resto se pagaran a precioExtra
 * @param numHoras numero horas jornada laboral
 * @param precioHoras precio que cobra la hora
 * @param precioExtras precio de las horas extras
 * @return double con el valor del salario completo
 * @throws aritmeticexception cuando las horas o precios lanzan 0 o numeros negativos
 */

	public double calculaSalario(int numHoras, double precioHoras, double precioExtras) {
		int extras=0;
		int horas=numHoras;
		if (numHoras<=0 || precioHoras<=0 || precioExtras <= 0 ) {
			throw new ArithmeticException(); 
		}
		if (numHoras>HORASJORNADA) {
			extras = numHoras-HORASJORNADA;
			horas = HORASJORNADA;
		}
		return horas*precioHoras+extras*precioExtras;		
	}
	
/**
 * Metodo que devuelve el numero de divisores que tiene el numero pasado como  parametro
 * @param num numero a comprobar
 * @return devuelve el numero de divisores
 */
	public int cuentaDivisores(int num) {
		int cuenta=0;
		
		for (int i = 1; i <= num; i++) {
			if (num%i==0) {
				cuenta++;
			}
		}
		return cuenta;
	}
	
	/**
	 * Método que devuelve el menor elemento de un array dado como parámetro, 
	 * por ejemplo un vector [2,3,-1,9] devolvería -1
	 * @param v int [] vector de enteros con los números
	 * @return int con el menor número del vector.
	 */
	public double devuelveMenor(int v[]) {
		int menor = v[0];
		for (int i = 1; i < v.length; i++) {
			if(v[i]< menor) {
				menor=v[i];
			}
		}
		return menor;
	}
	
/**
 * Algoritmo que ordena un vector a traves del metodo de la burbuja
 * @param v int [] vector a ordenar, 
 * @return
 */
	public int [] burbuja(int[] v)
    {
      int auxiliar;
      int[] ordenado;
      for(int i = 1; i < v.length; i++)
      {
        for(int j = 0;j < v.length-i;j++)
        {
          if(v[j] > v[j+1])
          {
            auxiliar = v[j];
            v[j] = v[j+1];
            v[j+1] = auxiliar;
          }   
        }
      }
      ordenado = v;
      return ordenado;
    }
}
