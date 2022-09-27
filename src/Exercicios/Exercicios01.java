package Exercicios;

public class Exercicios01 {

	public static void main(String[] args) {
		
		//exercicio1();
		//exercicio2();
		//exercicio3();
		exercicio4();
		
	}

/** 1. Elabore um programa que lê o valor das variáveis x, y e z, do tipo int.
 *  Em seguida, calcule o resultado da expressão a seguir: r = x³ + y² + xyz
 *  Imprima o resultado no formato do exemplor abaixo: 
 *  x = 10, y = 10, z = 10
 *  r = 2100 
 */
public static void exercicio1() {	
	int x = 10;
	int y = 10;
	int z = 10;
	int r = (x * x * x) + (y * y) + (x * y * z);
			
	System.out.println("x = " + x + ", y = " + y + ", z = " + z );
	System.out.println("r = " + r);
}

//Elabore um programa que imprime o resto da divisão 100000/3 
public static void exercicio2() {
	int restoDivisao = 100000 % 3;
	System.out.println(restoDivisao); // Resultado = 1 	
}

/**Elabore um programa que lê o valor das variáveis a, b, c, d e e do tipo float 
*  e, em seguida, calcula o resultado da expressão a seguir:
*  x = a³ * ( (b + c)/d + e) 
*  O resultado deve ser impresso no formato do exemplo abaixo:
*  a = 10, b = 10, c = 10, d = 10, e = 10
*  x = 12000           
*/ 
public static void exercicio3() {
	float a = 10;
	float b = 10;
	float c = 10;
	float d = 10;
	float e = 10; 
	
	float x = (a * a * a) * ( (b + c )/d + e);
	System.out.printf("x = %.0f%n" , x);  
	System.out.printf("a =  %.0f , b = %.0f , c = %.0f , d = %.0f , e = %.2f", a, b, c, d, e);
}
/**Elabore um programa que lê o valor de x1, x2, e x3 para calcular ( e imprimir) o resultado
* da expressão y = (x1 + 3)^4  + (x2 * x3)³ Resultado y = 1028561.000
*/
public static void exercicio4() {
	double x1 = 10;
	double x2 = 10;
	double x3 = 10;
	
	double y = Math.pow((x1 + 3), 4) + Math.pow((x2 * x3), 3);
	System.out.println(y);
	
}






}
