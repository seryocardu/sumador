package sumador;

class TestASumar {
	

    
    String valor_inicial;
	private String valor_inicial2;
	private String valor_inicial3;


	/**
     * testUnaCifra es un metodo setter que asigna un valor
     */
	@Test
    public void testUnaCifra() {
        int numero = 5 ;
		ASumar sumi = new ASumar(numero);
        String resultado = sumi.mostrar();
        assertEquals(numero=numero,resultado );
        
    }

	
	/**
     * testnegativo es un metodo setter que asigna un valor en este caso negativo
     */
	@Test
    public void negativo() {
        int numero2 = -5 ;
		ASumar sumi = new ASumar(numero2);
        String resultado = sumi.mostrar();
        assertEquals(numero2=numero2,resultado );
        
    }
	
	/**
	 * Tercera prueba. Para valores mayores que 9
	 * @return
	 */
    public int total() {
        int suma = 0;

        for (int i = 0; i < valor_inicial.length(); i++) {
            // Cadena de un d�gito.
            String numero3 = valor_inicial.substring(i, 1);
            suma = suma + Integer.getInteger(numero3);
        }
        return suma;

    }
	
	

   /**
    * m�todo setter que introduce los valores
    * @param numero
    * @param resultado
    */
	private void assertEquals(int numero, String resultado) {
		
	}
    
	/**
	 * CONSTRUCTOR DE ASumar al que se le pasa un par�metro String
	 * @param numero
	 * @return void
	 */
    public void ASumar(String numero) {
        this.valor_inicial = numero;
    }
	
	/**
	 * CONSTRUCTOR DE ASumar2 al que se le pasa un par�metro String
	 * @param numero2
	 * @return void
	 */
    public void ASumar2(String numero2) {
        this.valor_inicial2 = numero2;
    }
    
	/**
	 * CONSTRUCTOR DE ASumar3 al que se le pasa un par�metro String
	 * @param numero3
	 * @return void
	 */
    public void ASumar3(String numero3) {
        this.valor_inicial3 = numero3;
    }
    
    /**
     * M�TODO GETTER. devuelve una cadena de texto 
     * que igual la entrada al valor
     * S�lo si el tiene UNA CIFRA
     * @return
     */
    public String mostrar1(String numero) {
        numero = valor_inicial;
        if (numero.length() == 1) {
            return ("El n�mero que has introducido tiene una cifra: " + numero + " = " + numero);
        }
		return ("El n�mero que has introducido tiene una cifra"); 
}
	
    /**
     * M�TODO mostrar2 a�adido para la prueba con 
     * n�meros NEGATIVOS
     * @return
     */
    public String mostrar2(int numero2) {
        
        if (numero2<0) {
            return ("El n�mero que has introducido es " + numero2 + " y es un n�mero negativo");
        }
		return valor_inicial2;
		
}


    /**
     * M�TODO mostrar3 a�adido para la prueba con 
     * n�meros de VARIOS D�GITOS
     * @return
     */
    public String mostrar3(int n) {
        
    	/*String suma = "";
        for (int i = 0; i < valor_inicial3.length(); i++) {
            // Cadena de un d�gito.
            String digito = valor_inicial3.substring(i, 1);
            suma = suma + digito + " + "; //Atenci�n puede que as� no funcione**
        }
        return suma;*/

    	
    	int total = 0;
    	while(n != 0){
    	total=total+n%10;
    	n=n/10;
    	}
    	return ("La suma de las cifras de tu n�mero es "+total);
 	

}



}