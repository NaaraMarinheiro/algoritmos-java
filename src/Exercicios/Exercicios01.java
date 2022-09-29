package Exercicios;

import java.util.Scanner;
import java.lang.Math;
import java.util.Random;

public class Exercicios01 {

	public static void main(String[] args) {
		
		//exercicio1();
		//exercicio2();
		//exercicio3();
		//exercicio4();
		//exercicio5();
		exercicio6();
		//exercicio7();
		//exercicio8();
		//exercicio9();
		//exercicio10();
		
		
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
	float a = 10f;
	float b = 10f;
	float c = 10f;
	float d = 10f;
	float e = 10f; 
	
	float x = (a * a * a) * ( (b + c )/d + e);
	System.out.printf("x = %.0f%n" , x);  
	System.out.printf("a =  %.0f , b = %.0f , c = %.0f , d = %.0f , e = %.2f", a, b, c, d, e);
}
/**Elabore um programa que lê o valor de x1, x2, e x3 para calcular ( e imprimir) o resultado
* da expressão y = (x1 + 3)^4  + (x2 * x3)³ 
* x1=10, x2=10, x3=10 - Resultado y = 1028561.0
*/
public static void exercicio4() {
	System.out.println("Digite 3 valores:");
	double x1 = 10.0;
	double x2 = 10.0;
	double x3 = 10.0;
	
	double y = Math.pow((x1 + 3), 4) + Math.pow((x2 * x3), 3);
	System.out.println(y);
	
}
/** Codifique um programa que leia um numero inteiro composto por 5 digitos
 * O programa deve imprimir este numero, de tal modo que cada digito
 *  seja impresso separado por 3 espaços em branco do próximo digito.
 *  Por exemplo, o inteiro 42339 deve ser impresso desta forma:
 *  4   2   3   3   9
 * 
 */
public static void exercicio5() {
	Scanner sc = new Scanner (System.in);
	int numero;
	System.out.println("Digite um número inteiro com 5 digitos:");
	numero = sc.nextInt(); 
	int n1 = numero/10000;
	int n2 = (numero/1000) - n1*10;
	int n3 = (numero/100) - n1*100 - n2*10;
	int n4 = (numero/10) - n1*1000 - n2*100 - n3*10;
	int n5 = (numero) - n1*10000 - n2*1000 - n3*100 - n4*10; 
	System.out.print(n1 + "   " + n2 + "   " + n3 + "   " + n4 + "   " + n5);
	
	sc.close();
}
  /** 
   * Faça um programa que le dois pontos P1 = (x1, y1) e p2 = (x2, y2) e calcula e imprima
   * a distancia entre esses dois pontos, cujo valor é dado pela seguinte formula:
   * dist = raiz quadrada de (x2 - x1)^2 + (y2 - y1) 
   */

public static void exercicio6() {

	Scanner sc = new Scanner(System.in);
	double x1;
	double y1;
	double x2;
	double y2;
	System.out.println("Digite valores para x1, y1, x2 e y2:");
	x1 = sc.nextDouble();
	y1 = sc.nextDouble();
	x2 = sc.nextDouble();
	y2 = sc.nextDouble();
	
	double distancia = Math.sqrt( Math.pow((x2 - x1), 2) + (y2 -y1) );
	System.out.println("A distância é:" + distancia);
	
	sc.close();
}

/**	Crie um programa que calcula a hipotenusa de um triângulo retângulo.
* Para isso, o usuário deverá digitar os valores dos catetos. 
* H = sqrt (c1² + c2²)
* c1 =8, c2=5 Resultado = 9.433981132056603
*/

public static void exercicio7() {
	Scanner sc = new Scanner (System.in);
	System.out.println("Digite os valores dos catetos:");
	double c1;
	double c2;
	c1 = sc.nextDouble();
	c2 = sc.nextDouble();
	
	//double h = Math.hypot(c1, c2);
	double h = Math.sqrt( Math.pow(c1, 2) + Math.pow(c2, 2));
	System.out.println(h);
	
	sc.close();
}
/** Crie um programa que lê a hipotenusa h de um triângulo retângulo e o angulo alfa que 
 * este forma com um dos catetos. Em seguida, imprima o valor dos três lados deste triângulo.
 * 
 * Dica: o cateto adjacente ao ângulo alfa terá o tamanho c1 = cos(alfa) x h
 * enquanto o cateto oposto terá o tamanho c2 = sen(alfa) x h.
 */
public static void exercicio8() {
	Scanner sc = new Scanner (System.in);
	double hipotenusa;
	double alpha;
	System.out.println("Digite os valores da hipotenusa e do angulo alpha:");
	hipotenusa = sc.nextDouble();
	alpha = sc.nextDouble();
	
	double cateto1 = Math.cos(alpha) * hipotenusa;
	double cateto2 = Math.sin(alpha) * hipotenusa;
	System.out.printf("Os lados do triângulo são:" + hipotenusa + cateto1 + cateto2);
	sc.close();	
}

/**
 * Crie um programa que lê dois números inteiros em ordem crescente: n1 e n2 
 * (ou seja, n1 menor ou igual n2). Em seguida, o programa deve imprimir na tela um numero
 * aleatório no intervalo { n1, ..., n2}
 */

public static void exercicio9() {
	Scanner sc = new Scanner (System.in);
	int n1;
	int n2;
	System.out.println("Digite dois números em ordem crescente:");
	n1 = sc.nextInt();
	n2 = sc.nextInt();
	
	Random gerador = new Random();
	for (int i = n1; i < 1; i++) {
	}
	System.out.println(gerador.nextInt(n2));
	sc.close();
}
/**
 * Escreva um programa que retorna a distância entre dois pontos (x1, y1) e (x2, y2).
 * Obs.:Todos os npumero e valores de entrada/saída deveem ser do tipo double.
 * Dica: a distância de dois pontos (x1, y1) e (x2, y2) é calculada como 
 * dist = raiz quadrada de (x1 -x2)² + (y1 - y2)²
 *  Resultado: 1, 1, 5, 5 - distancia: 5.656854
 */
public static void exercicio10() {
	Scanner sc = new Scanner (System.in);
	double x1;
	double y1;
	double x2;
	double y2;
	System.out.println("Digite os valores de x1, y1, x2, y2:");
	x1 = sc.nextDouble();
	y1 = sc.nextDouble();
	x2 = sc.nextDouble();
	y2 = sc.nextDouble();
	
	double distancia = Math.sqrt( Math.pow((x1 - x2), 2)+ Math.pow((y1 - y2), 2) );
	System.out.println("A distância entre os dois pontos é:" + distancia);
	
	sc.close();
}

/**
 * 
 */
public static void exercicio11() {
	
}
}
