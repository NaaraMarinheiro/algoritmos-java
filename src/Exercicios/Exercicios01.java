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
		//exercicio6();
		//exercicio7();
		//exercicio8();
		//exercicio9();
		//exercicio10();
		//exercicio11();
		//exercicio12();
		exercicio13(); // Pendente
		//exercicio14(); // Pendente
		//exercicio15();
		//exercicio16();
		//exercicio17();
		//exercicio18();
		//exercicio19();
		//exercicio20(); 
		//exercicio21();
		//exercicio22();
		//exercicio23();
		//exercicio24();
		//exercicio25();
		//exercicio26();
		//exercicio27();
		//exercicio28();
		//exercicio29();
		//exercicio30();
	}

/** 1. Elabore um programa que l� o valor das vari�veis x, y e z, do tipo int.
 *  Em seguida, calcule o resultado da express�o a seguir: r = x� + y� + xyz
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

//Elabore um programa que imprime o resto da divis�o 100000/3 
public static void exercicio2() {
	int restoDivisao = 100000 % 3;
	System.out.println(restoDivisao); // Resultado = 1 	
}

/**Elabore um programa que l� o valor das vari�veis a, b, c, d e e do tipo float 
*  e, em seguida, calcula o resultado da express�o a seguir:
*  x = a� * ( (b + c)/d + e) 
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
/**Elabore um programa que l� o valor de x1, x2, e x3 para calcular ( e imprimir) o resultado
* da express�o y = (x1 + 3)^4  + (x2 * x3)� 
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
 *  seja impresso separado por 3 espa�os em branco do pr�ximo digito.
 *  Por exemplo, o inteiro 42339 deve ser impresso desta forma:
 *  4   2   3   3   9
 * 
 */
public static void exercicio5() {
	Scanner sc = new Scanner (System.in);
	int numero;
	System.out.println("Digite um n�mero inteiro com 5 digitos:");
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
   * Fa�a um programa que le dois pontos P1 = (x1, y1) e p2 = (x2, y2) e calcula e imprima
   * a distancia entre esses dois pontos, cujo valor � dado pela seguinte formula:
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
	System.out.println("A dist�ncia �:" + distancia);
	
	sc.close();
}

/**	Crie um programa que calcula a hipotenusa de um tri�ngulo ret�ngulo.
* Para isso, o usu�rio dever� digitar os valores dos catetos. 
* H = sqrt (c1� + c2�)
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
/** Crie um programa que l� a hipotenusa h de um tri�ngulo ret�ngulo e o angulo alfa que 
 * este forma com um dos catetos. Em seguida, imprima o valor dos tr�s lados deste tri�ngulo.
 * 
 * Dica: o cateto adjacente ao �ngulo alfa ter� o tamanho c1 = cos(alfa) x h
 * enquanto o cateto oposto ter� o tamanho c2 = sen(alfa) x h.
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
	System.out.printf("Os lados do tri�ngulo s�o:" + hipotenusa + cateto1 + cateto2);
	sc.close();	
}

/**
 * Crie um programa que l� dois n�meros inteiros em ordem crescente: n1 e n2 
 * (ou seja, n1 menor ou igual n2). Em seguida, o programa deve imprimir na tela um numero
 * aleat�rio no intervalo { n1, ..., n2}
 */

public static void exercicio9() {
	Scanner sc = new Scanner (System.in);
	int n1;
	int n2;
	System.out.println("Digite dois n�meros em ordem crescente:");
	n1 = sc.nextInt();
	n2 = sc.nextInt();
	
	Random gerador = new Random();
	for (int i = n1; i < 1; i++) {
	}
	System.out.println(gerador.nextInt(n2));
	sc.close();
}
/**
 * Escreva um programa que retorna a dist�ncia entre dois pontos (x1, y1) e (x2, y2).
 * Obs.:Todos os npumero e valores de entrada/sa�da deveem ser do tipo double.
 * Dica: a dist�ncia de dois pontos (x1, y1) e (x2, y2) � calculada como 
 * dist = raiz quadrada de (x1 -x2)� + (y1 - y2)�
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
	System.out.println("A dist�ncia entre os dois pontos �:" + distancia);
	
	sc.close();
}

/** Fa�a um programa que leia dois n�meros inteiros e verifique qual deles � maior.
 * imprima uma mensagem informando qual deles � maior; 
 */
public static void exercicio11() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite dois n�meros:");
	int n1 = sc.nextInt();
	int n2 = sc.nextInt();
	
	if ( n1 > n2) {
		System.out.println("O meior n�mero �:" + n1);
	} else {
		System.out.println("O maior n�mero �:" + n2);
	}
	
	sc.close();;
	
}
/**
 * Dadas as seguintes informa��es de um funcion�rio: matr�cula (somente numeros), idade
 * e o seu sal�rio bruto, considere:
 * O sal�rio bruto teve um reajuste de 38%;
 * O funcion�rio receber� uma gratifica��o de 20% do sal�rio bruto;
 * O sal�rio total � descontado em 15%.
 * Fa�a um programa para: 1. Imprimir a matr�cula; 2. Calcular e imprimir o sal�rio bruto;
 * 3. Calcular e imprimir o sal�rio liquido.
 */
public static void exercicio12() { // N�O CONSEGUI FAZ 
	Scanner sc = new Scanner(System.in);
	System.out.println("Informe a matricula, idade e o salario bruto:");
	int matricula = sc.nextInt();
	int idade = sc.nextInt();
	double salarioBruto = sc.nextDouble();

	double percentualReajuste = (38f/100f) * salarioBruto;
	double salarioReajustado =  salarioBruto + percentualReajuste;
	double gratificacao = 0.2 * salarioReajustado;
	double salarioBrutoFinal = salarioReajustado + gratificacao;
	
	double salarioDescontado = salarioBrutoFinal - ((0.15) * salarioBrutoFinal);
	
	System.out.println("Matricula: " + matricula);
	System.out.println("Sal�rio Bruto: " + salarioBrutoFinal);
	System.out.println("Sal�rio l�quido: " + salarioDescontado);

	sc.close();
	
}


/**
 * Uma companhia de carros paga a seu vendedor um salario de R$ 2.000,00 por mes mais uma comiss�ao
de R$ 500,00 para cada carro vendido e mais 5% do valor da venda. Todo mes a companhia prepara
os seguintes dados para um determinado vendedor: matricula (somente numeros), numero de carros
vendidos e o valor total das vendas. Elabore um algoritmo para calcular e imprimir o salario do
vendedor num dado mes.
 */
public static void exercicio13() {
//	Scanner sc = new Scanner(System.in);
//	int ncarros;
//	
//	double salario = 2000.0;
//	double comiss�o = nCarros * 500;
//	double percentualVenda = 0.5 * valorDoCarro;
//	
//	
//	}
//	
	
}

/** Numa concessionaria de veiculos, o vendedor recebe mensalmente, um salario fixo mais comiss�ao, que
 * e baseada na quantidade e modelo vendido, conforme a tabela abaixo:
 * Tipo: luxo / Comiss�o (R$ por veiculo vendido) 2000,00
 * Tipo: padr�o / Comiss�o (R$ por veiculo vendido) 1000,00
 * 
 * Sabendo-se ainda que o vendedor tem um desconto de 8% sobre seu sal�ario bruto para o INSS, fa�ca
 * um algoritmo que leia o salario fixo e o n�umero de carros de cada modelo que esse funcion�ario vendeu
e, calcule e imprima o salario bruto, o desconto para o INSS e o salario liquido desse vendedor.
 */
public static void exercicio14() {
	
}

/** Elabore um algoritmo que dados dois lados de um triangulo retangulo, 
 * calcule a respectiva hipotenusa, dado por: h = raiz quadrada de l1� + l2�
 */
public static void exercicio15() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite os dois lados de um tri�ngulo ret�ngulo:");
	double l1 = sc.nextDouble();
	double l2 = sc.nextDouble();
	double resultado = Math.sqrt( Math.pow(l1, 2) + Math.pow(l2, 2) );
	System.out.println("A hipotenusa do tri�ngulo �:" + resultado);
	sc.close();
}

/** A convers�ao de graus Farenheit para Celsius � obtida atraves da formula 
 * C = 5/9(F - 32). Elabore um algoritmo que receba uma temperatura em Farenheit
 * e a transforme para graus Celsius
 */
public static void exercicio16() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Informe a temperatura em Farenheit:");
	double tempFarenheit = sc.nextDouble();
	double tempCelsius =(tempFarenheit - 32)* 5/9 ;
	System.out.println("A temperatura em Celsiu �:" + tempCelsius);
	sc.close();
}


/** Construa um algoritmo que leia as dimens�oes dos lados de um retangulo, 
 * calcule e imprima a area e perimetro deste retangulo, dados, respectivamente,
 *  por A = b � h e P = 2b + 2h, onde b � a base e h a altura.
 */
public static void exercicio17() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Informe a base e a altura do retangulo:");
	double b = sc.nextDouble();
	double h = sc.nextDouble();
	double area = b * h;
	double perimetro = (2 * b) + (2 * h);
	System.out.println("A area e o perimentro do retangulo s�o:" + area + " e " + perimetro);
	
	sc.close();
}

/** Elabore um algoritmo que leia um numero r, calcule e imprima o comprimento da circunferencia,
 *  a area do circulo e o volume da esfera de raio r, dados por C = 2 PI r, A = PIr� e
 *   V = 4/3 pi r�, respectivamente.
 */
public static void exercicio18() {
	Scanner sc = new Scanner(System.in);
	
	final double PI = 3.14;
	System.out.println("Informe um n�mero r");
	double r = sc.nextDouble();
	double c = 2 * PI * r;
	double a = PI * Math.pow(r, 2);
	double v = 4/3 * PI * Math.pow(r, 3);
	
	System.out.printf("c = %f%n a = %f%n v = %f%n", c, a, v );

	sc.close();
}

/** Construa um algoritmo que leia os valores das bases e altura de um trapezio,
 *  calcule e imprima o valor da sua area, dada por AT = (b1 + b2) * h / 2. 
 * 
 */
public static void exercicio19() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Informe os valores da base maior, base menor e altura do trapezio:");
	double b1 = sc.nextDouble();
	double b2 = sc.nextDouble();
	double h = sc.nextDouble();
	double area = ((b1 + b2) * h)/2;
	System.out.println("A area do trapezio �: " + area);
	sc.close();
	
}

/** Elabore um algoritmo que leia o primeiro termo (a1) de uma Progress�o Aritm�tica (PA),
 * sua raz�o r, um n�mero n, e a seguir , calcule e imprima o en�simo termo da PA.
 * F�rmula geral da PA an = a1 + (n - 1) r 
 */
public static void exercicio20() {
	Scanner sc =  new Scanner(System.in);
	System.out.println("Informe os termos a1, r e n de uma PA:");
	int a1 = sc.nextInt();
	int r = sc.nextInt();
	int n = sc.nextInt();
	
	int PA = a1 + (n - 1) * r;
	System.out.println(PA);
	sc.close();
}

/** Desenvolva um algoritmo que leia um n�mero n, o primeiro termo a1, e a raz�o q de uma
 * Progress�o Geom�trica (PG), calcule e imprima o n-�simo termo desta PG. 
 * F�rmula geral da PG : an = a1 x q^n-1
 */
public static void exercicio21() {
	Scanner sc =  new Scanner(System.in);
	System.out.println("Informe os termos a1, q e n de uma PG:");
	double a1 = sc.nextDouble();
	double q = sc.nextDouble();
	double n = sc.nextDouble();
	
	double PG = a1 * Math.pow(q, n-1);
	System.out.println(PG);
	sc.close();
}

/** Reescreva as express�es matem�ticas abaixo em linguagem Java:
 * 1. x = (3y / 5y + 7) + 2y
 * 2. y = (x + 3b) / (2x + c)
 * 3. y = ( a� + raiz quadrada de 3b) / 5x�
 * 4. x = y + raiz quadrada de 2b / a + b 
 * 5. X = A + (B/C)/ D - (E/F)
 * 6. Y = ((2x� - 3x^x+1)/2) +  ((raiz quadrada de x+ 1)/x)/ 2�
 */
public static void exercicio22() {

	double y = 10;
	double x = 10;
	double a = 10;
	double b = 10;
	double c = 10;
	double d = 10;
	double e = 10;
	double f = 10;
	
	double q1 = (3*y)/(5*y + 7) + 2*y;
	double q2 = (x + 3*b) / (2*x + c);
	double q3 = (a*a) + Math.sqrt((3 * b))/ 5 * Math.pow(x, 3);
	double q4 = y + Math.sqrt((2*b)/(a + b));
	double q5 = (a + (b/c)) / (d - (e/f));
	double q6 = (     ( (2*Math.pow(x, 2) - 3*Math.pow(x,(x+1)))/2 ) +  
								+ (Math.sqrt((x+1))/x)    )
									/ Math.pow(2, x);
	
	System.out.printf("%.2f / %.2f / %.2f / %.2f / %.2f / %.2f", q1, q2, q3, q4, q5, q6);
	
}

/** Indique o resultado das seguintes express�es:
 * 1. 2> 3  ----  2. (6<8) || (3>7) ---- 3. 1/2 ----- 4. 1%2 
 * 5. 1/2.0 ----- 6. (((10/2) % 6) < 5) && (3< (2||2)) -----7. !(2<3)
 * 8. pow(5,2) + 3  
 */
public static void exercicio23() {
	boolean q1 = 2 > 3;
	boolean q2 = (6<8)||(3>7);
	float q3 = 1/2;
	float q4 = 1%2;
	float q5 = (1f/2.0f);
	boolean q6 = (((10/2) % 6) < 5) && (3<2);
	boolean q7 = !(2<3);
	double q8 = Math.pow(5, 2)+ 3;
	
	System.out.println(q1);
	System.out.println(q2);
	System.out.println(q3);
	System.out.println(q4);
	System.out.println(q5);
	System.out.println(q6);
	System.out.println(q7);
	System.out.println(q8);
}

/** Escreva um problema que leia tr�s n�meros inteiros A, B, C e calcula a seguinte express�o:
 * d = (r + s)/2 , onde r = (a + b)� e s = (b + c)�.
 */
public static void exercicio24() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite tr�s n�mero inteiros:");
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	
	int r = (int) Math.pow((a+b), 2);
	int s = (int) Math.pow((b+c), 2);
	
	int d = (r + s)/2;
	System.out.println(d);
	
	sc.close();
}

/** Elabore um algoritmo que leia 2 valores e verifique se um � divis�vel pelo outro.
 */
public static void exercicio25() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Escreva dois n�meros inteiros:");
	int n1 = sc.nextInt();
	int n2 = sc.nextInt();
	
	if (n1 % n2 == 0) {
		System.out.println(" � divis�vel");	
	} else {
		System.out.println(" N�o � divis�vel");
	}
	sc.close();
}

/**
 * Fa�a um programa que, dados a matr�cula (somente npumeros) e sal�rio de dois funcion�rios,
 *  imprima a matricula e o sal�rio do funcion�rio que tem maior sal�rio
 */
public static void exercicio26() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Primeiro funcion�rio, matricula e salario:");
	int matriculaf1 = sc.nextInt();
	double salariof1 = sc.nextDouble();
	System.out.println("Segundo funcion�rio, matricula e salario:");
	int matriculaf2 = sc.nextInt();
	double salariof2 = sc.nextDouble();
	
	if (salariof1 > salariof2) {
		System.out.println(matriculaf1);	
	} else {
		System.out.println(matriculaf2);
	}
	sc.close();
}

/** Uma loja deseja mandar uma correspon�ncia a um dos clientes anunciando um b�nus especial.
 * Escreva um algoritmo que leia o valor das compras desse cliente no ano passado e calcule
 * um b�nus de 10%, se o valor das compras for menor que R$ 50.000,00, e de 15%, 
 * caso contr�rio. O algoritmo deve imprimir o b�nus cedido ao cliente. 
 * 
 */
public static void exercicio27() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Qual o valor das compras do cliente?");
	double valorCompras = sc.nextDouble();
	
	if (valorCompras < 50000.0) { 
		System.out.println("B�nus de 10%");
	} else {
		System.out.println("B�nus de 15%");
	}
	sc.close();
}

/** Fa�a um programa que leia a matr�cula (somente n�meros), o cargo (uma letra) e
 * e o sal�rio de um funcion�rio e calcule seu novo sal�rio reajustado.
 * Se o cargo for operador (O), o funcion�rio dever� receber um reajuste de 20%,
 * se o cargo for programador (P), o funcion�rio dever� receber um reajuste de 18%.
 * O programa deve escrever a matr�cula e o novo sal�rio do funcion�rio, j� reajustado.
 * 
 */
public static void exercicio28() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Informe a matricula, o cargo (uma letra) e o salario:");
	int matricula = sc.nextInt();
	char cargo = sc.next().charAt(0);
	double salario = sc.nextDouble();
	
	if ( cargo == 'O') {
		double novoSalario = (salario * 0.20) + salario;
		System.out.printf("Matricula %d , novo sal�rio R$ %.2f ", matricula, novoSalario);
	} else {
		double novoSalario = (salario * 0.18) + salario;
		System.out.printf("Matricula %d , novo sal�rio R$ %.2f ", matricula, novoSalario);
	}
	sc.close();
	
}
/** Elabore um programa que leia o salario atual de um funcionario de uma firma 
 * e calcule e imprima o novo salario com percentual de reajuste dependendo do 
 * salario atual conforme a seguinte tabela:
 * - salario atual menor que 1000,0 - reajuste 15%
 * - salario atual maior ou igual a 1000,0 e maior ou igual a 2000,00 - reajuste 10%
 * - salario atual maior que 2000,0 - reajuste 5%
 */
public static void exercicio29() {
	Scanner sc = new Scanner (System.in);
	System.out.println("Digite o sal�rio:");
	double salario =sc.nextDouble();
	if ( salario < 1000.0) {
		double novoSalario = (0.15 * salario) + salario;
		System.out.println("Novo sal�rio :R$" + novoSalario);
	} else if ( salario > 2000.0) {
		double novoSalario = (0.05 * salario) + salario;
		System.out.println("Novo sal�rio :R$" + novoSalario);
	} else {
		double novoSalario = (0.10 * salario) + salario;
		System.out.println("Novo sal�rio :R$" + novoSalario);
	}

	sc.close();
}
/** Fa�a um programa que, dados dois numeros e um caracter ( +, -, *, /), calcule e imprima:
 * 1. A soma desses n�meros, caso seja digitado o caracter +
 * 2. A subtra��o dos dois numeros, caso seja digitado o caracter -
 * 3. A multiplica��o desses n�meros, caso seja digitado o caracter *
 * 4. A divis�o desses n�meros, caso seja digitado o caracter /
 */
public static void exercicio30() {
	Scanner sc = new Scanner (System.in);
	int n1 = 10;
	int n2 = 5;
	System.out.println("Escolha uma opera��o:");
	char operador = sc.next().charAt(0);
	
	if ( operador == '+') {
		int result = n1 + n2;
		System.out.println(result);
	} else if ( operador == '-') {
		int result = n1 - n2;
		System.out.println(result);
	} else if ( operador == '*') {
		int result = n1 * n2;
		System.out.println(result);
	} else if ( operador == '/') {
		int result = n1 / n2;
		System.out.println(result);
	} else {
		System.out.println("Operador inv�lido");
	}
	sc.close();
}





}
