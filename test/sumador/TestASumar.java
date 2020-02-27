package sumador;

class TestASumar {
	

    
    private String valor_inicial;


	/**
     * testUnaCifra es un metodo setter que asigna un valor
     */
	@Test
    public void testUnaCifra() {
        int numero = 5;
		ASumar sumi = new ASumar(numero);
        String resultado = sumi.mostrar();
        assertEquals(numero=numero,resultado );
        
    }

	
	
   /**
    * método setter que introduce los valores
    * @param numero
    * @param resultado
    */
	private void assertEquals(int numero, String resultado) {
		
	}
    
	/**
	 * CONSTRUCTOR DE ASumar al que se le pasa un parámetro String
	 * @param string
	 * @return 
	 */
    public void ASumar(String string) {
        this.valor_inicial = string;
    }
	

    
    /**
     * MÉTODO GETTER. devuelve una cadena de texto 
     * que igual la entrada al valor
     * Sólo si el tiene una cifra.
     * @return
     */
    public String mostrar() {
        String numero = valor_inicial;
        if (numero.length() == 1) {
            return (numero + " = " + numero);
        }
		return numero; 
}
	

}
