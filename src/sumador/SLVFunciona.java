package sumador;

import java.util.Scanner;

public class SLVFunciona {public static void main(String[] args) {
	
	try (/**
		 * OBJETO ESCANER PARA METER NUMERO POR TECLADO
		 */
	Scanner sc = new Scanner(System.in)) {
		/**
		  * Aqu� empieza las sentencias para la prueba de un s�lo d�gito
		  */
		 System.out.println("introduce un n�mero para la prueba de un digito");
		 
		 String numero = sc.nextLine();
		 
		 TestASumar objetotest= new TestASumar();
		 
		 objetotest.ASumar(numero);
		 

		 System.out.println(objetotest.mostrar1(numero));
		 
		 
		 
		 /**
		  * Aqu� empieza las sentencias para la prueba de un d�gito negativo
		  */
		 System.out.println("introduce un n�mero para la prueba de un numero negativo");
		 	     
		 	     
		 TestASumar objetotestnegativo= new TestASumar();
		 
		 int numero2 = sc.nextInt();
		 
		 //objetotestnegativo.ASumar2(numero2)
		 
		 System.out.println(objetotestnegativo.mostrar2(numero2));
		 
		 
		 /**
		  * Aqu� empieza las sentencias para la prueba de un numero de varios d�gitos 
		  */
		 System.out.println("introduce un n�mero para la prueba de un numero de varios d�gitos");
		 	     
		 	     
		 TestASumar objetotestvarios= new TestASumar();
		 
		 int numero3 = sc.nextInt();
		 
		 //objetotestnegativo.ASumar3(n)
		 
		 System.out.println(objetotestvarios.mostrar3(numero3));
	}
	    

}

}