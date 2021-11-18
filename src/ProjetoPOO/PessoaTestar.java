package ProjetoPOO;

import java.util.Scanner;

public class PessoaTestar {

	public static void main(String[] args) {
		
		//CRIANDO VARI�VEIS
		
		int opcao;
		String nome;
		int cadastro;
		
		int convite;
		int horario;
				
		//CRIANDO OBJETO COM O PRIMEIRO CONSTRUCTOR
		Morador m1 = new Morador ();
		
		Visitante v1 = new Visitante();
		
				
		Scanner escreva = new Scanner(System.in);
				
				
		//CRIANDO O PROGRAMA
		do {
			System.out.println("\n-------------------------------");
			System.out.println("MENU");
			System.out.println("Escolha uma das op��es");
			System.out.println("1 - Morador");
			System.out.println("2 - Visitante");
			System.out.println("3 - Nenhum dos dois");
			System.out.println("0 - SAIR");
			
			opcao = escreva.nextInt();
			escreva.nextLine();
				
			switch (opcao) {
			case 1:
				System.out.print("Nome: ");
				nome = escreva.nextLine();
				System.out.print("Cadastro? 1 - SIM / 2 - N�O ");
				cadastro = escreva.nextInt();
				
				//PUXANDO CONSTRUCTOR E PAR�METROS
				m1 = new Morador (nome, cadastro);
				//PUXANDO M�TODO
				m1.entrar();
				
				m1.status();
				break;
			
			case 2:
				System.out.print("Nome: ");
				nome = escreva.nextLine();
				System.out.print("Horario da visita? ");
				horario = escreva.nextInt();
				System.out.print("Posui autoriza��o do morador? 1 - SIM / 2 - N�O");
				convite = escreva.nextInt();
				
				//PUXANDO CONSTRUCTOR E PAR�METROS
				v1 = new Visitante(nome, horario, convite);
				//PUXANDO M�TODO
				v1.entrar();
				
				v1.status();
				break;
						
			case 3:
				break;
						
			case 0:
				System.out.println("At� mais senhor...");
				break;
						
			default:
				System.out.println("Op��o inv�lida..");
				}
			
			} while (opcao != 0);
		
		
		

	}

}
