package funciones;

public class Utilidades {

	/**
	 * Constante que contiene el número de horas de una joranda normal
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
		return null;
	}
	
	
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
	 * Método que deveulve el menor elemento de un array dado como parámetro, 
	 * por ejemplo un vector [2,3,-1,9] devolvería -1
	 * @param v int [] vector de enteros con los números
	 * @return int con el menor número del vector.
	 */
	public double devuelveMenor(int v[]) {
		return 0;
	}
	
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
