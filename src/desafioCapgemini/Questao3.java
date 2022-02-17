package desafioCapgemini;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/*
 * Desafio Capgemini
 * Questão 3
 * Data: 16/02/2022
 * Autor:Bruna Guimarães de Barros Leal dos Santos
 * Função:Duas palavras podem ser consideradas anagramas de si mesmas se as letras de uma palavra podem ser realocadas 
 * para formar a outra palavra. Dada uma string qualquer, desenvolva um algoritmo que encontre o número de pares 
 * de substrings que são anagramas.
 * 
 */
public class Questao3 {

	public static void main(String[] args) {
		
		// Para leitura da entrada de dados
		Scanner leia = new Scanner(System.in);
		
		// Variáveis
		String frase;

		// solicita ao usuario que digite uma string qualquer
		System.out.println("Digite uma frase : ");
		frase = leia.nextLine();

		// chamando a função anagrama
		anagrama(frase);
	}

	// Criando uma função
	static void anagrama(String string) {

		// Guarda o valor dos caracteres inseridos
		HashMap<String, Integer> mapa = new HashMap<>();

		for (int i = 0; i <= string.length(); i++) {

			for (int j = i; j < string.length(); j++) {

				// array de caracteres para armazenamento
				char[] caractere = string.substring(i, j + 1).toCharArray();
				Arrays.sort(caractere);
				String subCaract = new String(caractere);

				// Verificação de cada substring
				if (mapa.containsKey(subCaract)) {
					mapa.put(subCaract, mapa.get(subCaract) + 1);
				} else {
					mapa.put(subCaract, 1);
				}
			}
		}

		// verificação dos anagramas
		//variavel
		int contaPares = 0;

		for (String cont : mapa.keySet()) {

			int n = mapa.get(cont);
			contaPares += (n * (n - 1)) / 2;
		}//imprime a quantidade de pares que são anagramas
		System.out.print("Quantidade de pares que são anagramas é de " + contaPares);
	}
}

