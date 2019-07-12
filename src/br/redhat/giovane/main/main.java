package br.redhat.giovane.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import br.redhat.giovane.controller.*;

import javax.swing.JOptionPane;

import model.Funcionarios;

public class main {

	public static void main(String[] args) {
		Cadastro Cadastro = new Cadastro();
		ArrayList<Funcionarios> cadastros = new ArrayList<Funcionarios>();

		do {

			boolean loop = false;

			try {

				System.out.println("#### MENU DE OPÇÕES ####");
				System.out.println("1 - Cadastrar usuário");
				System.out.println("2 - Listar usuários");
				System.out.println("3 - Modificar dados cadastrais");
				System.out.println("4 - Deletar usuário");
				System.out.println("5 - Sair");
				System.out.println("Digite sua opção: ");

				Scanner sc = new Scanner(System.in);
				Scanner opc = new Scanner(System.in);

				int option;
				option = opc.nextInt();

				switch (option) {

				case 1:
					System.out.println("#### CADASTRE O USUÁRIO ####\n");

					System.out.printf("ID: ");
					int ID = sc.nextInt();

					System.out.printf("Nome: ");
					String nome = sc.nextLine();
					sc.next();
								
					System.out.printf("Sobrenome: ");
					String sobrenome = sc.nextLine();
									
					System.out.printf("Endereço: ");
					String endereco = sc.nextLine();
									
					System.out.printf("Telefone: ");
					String telefone = sc.nextLine();
										
					System.out.printf("Celular: ");
					String celular = sc.nextLine();
									
					System.out.printf("Dependentes: ");
					String dependentes = sc.nextLine();
									
					System.out.printf("Salário: ");
					String salario = sc.nextLine();
					
			
					Funcionarios f1 = new Funcionarios(ID, nome, sobrenome, endereco, telefone, celular, dependentes,
							salario);

					cadastros.add(f1);

					break;

				case 2:

					System.out.println("#### USUÁRIOS CADASTRADOS ####\n");
					System.out.println("1 - Listar todos");
					System.out.println("2 - Listar por tipo de funcionário");
					System.out.println("3 - Listar um usuário específico");
					System.out.println("4 - Sair");

					Scanner ls = new Scanner(System.in);
					option = ls.nextInt();

					if (option == 1) {

						for (Funcionarios x : cadastros) {

							System.out.println("ID: " + x.getID());
							System.out.println("Nome: " + x.getNome());
							System.out.println("Sobrenome: " + x.getSobrenome());
							System.out.println("Telefone: " + x.getTelefone());
							System.out.println("Celular: " + x.getCelular());
							System.out.println("Dependentes: " + x.getDependentes());
							System.out.println("Salário: " + x.getSalario());
												
						}
					}

					break;

				case 3:
					
					System.out.println("#### MODIFICAR USUÁRIO ####\n");
				
					break;

				case 4:
					
					System.out.println("#### DELETE UM USUÁRIO ####\n");
					
					break;

				case 5:
					
					System.exit(1);
					
					break;

				default:
					System.out.println("Digite um número válido!\n");

				}
			}

			catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Digite somente número!!", "ERRO", JOptionPane.ERROR_MESSAGE);

			}
		} while (true);
	}

}