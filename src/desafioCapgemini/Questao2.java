package desafioCapgemini;

import java.util.Scanner;

/*
 * Desafio Capgemini
 * Quest�o 2
 * Data: 16/02/2022
 * Autor:Bruna Guimar�es de Barros Leal dos Santos
 * Fun��o: D�bora se inscreveu em uma rede social para se manter em contato com seus amigos. A p�gina de
 * cadastro exigia o preenchimento dos campos de nome e senha, por�m a senha precisa ser forte. 
 * O site considera uma senha forte quando ela satisfaz os seguintes crit�rios:
 * - Possui no m�nimo 6 caracteres.
 * - Cont�m no m�nimo 1 digito.
 * - Cont�m no m�nimo 1 letra em min�sculo.
 * - Cont�m no m�nimo 1 letra em mai�sculo.
 * - Cont�m no m�nimo 1 caractere especial. Os caracteres especiais s�o: !@#$%^&*()-+
 *	D�bora digitou uma string aleat�ria no campo de senha, por�m ela n�o tem certeza se � uma senha 
 * forte. Para ajudar D�bora, construa um algoritmo que informe qual � o n�mero m�nimo de caracteres
 * que devem ser adicionados para uma string qualquer ser considerada segura.
 */
public class Questao2 {
	
	public static void main(String[] args) {
		//utilizada para ler a entrada de dados
		Scanner leia = new Scanner(System.in);
		//variaveis
		boolean achaDigito = false;
	    boolean achaLetraMaiuscula = false;
	    boolean achaLetraMinuscula = false;
	    boolean achaCaractereEspecial = false;
	    String senha;
	    
	    System.out.println("Digite uma senha que satisfaz os seguintes crit�rios:"+ "\n" +
	            "- Possua no m�nimo 6 caracteres;"+ "\n" +
	            "- Contenha no m�nimo 1 digito;"+ "\n" +
	            "- Contenha no m�nimo 1 letra em min�sculo;" + "\n" +
	            "- Contenha no m�nimo 1 letra em mai�sculo;" + "\n" +
	            "- Contenha no m�nimo 1 caractere especial (!@#$%^&*()-+);");
	    //solicita do usuario a digita��o da senha para verifica��o do cumprimento dos crit�rios
	    System.out.print("Digite a senha: ");
	    senha = leia.next();
	    
		//Verifica a quantidade de caracteres da senha
		if (senha.length() < 6) {
			
			System.out.print("A senha digitada possui " + (senha.length()) 
					+ " caracteres, � necess�rio ter minimo 6 caracteres, faltam: " 
					+ (6 - senha.length() + " caractere(s) \n"));
		}
		else {//percorre a senha e verifica os diferentes caracteres que a senha possui
			for (char c : senha.toCharArray()) {
		         if (c >= '0' && c <= '9') {
		        	 achaDigito = true;
		         } else if (c >= 'A' && c <= 'Z') {
		        	 achaLetraMaiuscula = true;
		         } else if (c >= 'a' && c <= 'z') {
		        	 achaLetraMinuscula = true;
		         } else {
		        	 achaCaractereEspecial = true;
		         }
		    }//verifica se achou os caracteres obrigat�rios, caso n�o exista, aparece a mensagem na tela
			if(!achaDigito) {
				System.out.println("Sua senha precisa ter pelo menos um digito!");
			}
			if(!achaLetraMaiuscula) {
				System.out.println("Sua senha precisa ter pelo menos uma letra em maiusculo!");
			}
			if(!achaLetraMinuscula) {
				System.out.println("Sua senha precisa ter pelo menos uma letra em minusculo!");
			}
			if (!achaCaractereEspecial) {
				System.out.println("Sua senha precisa ter pelo menos um caractere especial");
			}
			//se valida todos os crit�rios, a senha � validada
			if(achaDigito && achaLetraMaiuscula && achaLetraMinuscula && achaCaractereEspecial) {
				System.out.println("Senha cadastrada com sucesso!");
			}
		}
				
		leia.close();
	}
}