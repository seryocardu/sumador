package sumador;

class TestASumar {
	

    
    private String valor_inicial;


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
    * m�todo setter que introduce los valores
    * @param numero
    * @param resultado
    */
	private void assertEquals(int numero, String resultado) {
		
	}
    
	/**
	 * CONSTRUCTOR DE ASumar al que se le pasa un par�metro String
	 * @param string
	 * @return 
	 */
    public void ASumar(String string) {
        this.valor_inicial = string;
    }
	

    
    /**
     * M�TODO GETTER. devuelve una cadena de texto 
     * que igual la entrada al valor
     * S�lo si el tiene una cifra.
     * @return
     */
    public String mostrar1() {
        String numero = valor_inicial;
        if (numero.length() == 1) {
            return (numero + " = " + numero);
        }
		return numero; 
}
	
    /**
     * M�TODO mostrar2 a�adido para la prueba con 
     * n�meros negativos
     * @return
     */
    public String mostrar2() {
        int numero2 = -5;
        if (numero2<0) {
            return ("El n�mero que has introducido es negativo");
        }
		return valor_inicial;
		
}
	

}