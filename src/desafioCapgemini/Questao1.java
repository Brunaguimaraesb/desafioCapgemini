package desafioCapgemini;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Desafio Capgemini
 * Quest�o 1
 * Data: 16/02/2022
 * Autor:Bruna Guimar�es de Barros Leal dos Santos
 * Fun��o: Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere *
 * e espa�os. A base e altura da escada devem ser iguais ao valor de n. A �ltima linha n�o 
 * deve conter nenhum espa�o.
 */
public class Questao1 {
	
	public static void main(String[] args) {
		
		//utilizado para ler a entrada dos dados	
		Scanner leia = new Scanner(System.in);
		//declara��o de vari�veis
		List<String> batentes = new ArrayList<>(); //instancia uma lista contendo os batentes da escada
		int  qtdBatentes; //quantidade de degraus que existe entre a base e a altura da escada
	 
		//solicita��o para o usu�rio digitar a quantidade de batentes
		System.out.print("Digite a quantidade de batentes: \n");
		qtdBatentes = leia.nextInt();		 
		
		//loop para incrementar a quantidade de asteriscos de acordo com o degrau
		for (int i = 0; i < qtdBatentes; i++) {
		batentes.add(" ".repeat(qtdBatentes - i) + "*".repeat(i + 1));
		}
		//imprime a escada
		for (String b : batentes ) {
		System.out.println(b);
		}
		
		leia.close();
	}

}
