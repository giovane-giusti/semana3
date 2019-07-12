package br.redhat.giovane.controller;

import java.util.Scanner;

import model.Funcionarios;

public class Cadastro {
	
	public void qsc (Funcionarios f1) {
		Scanner sc = new Scanner(System.in);
		String[] choices = {"Gerente", "Supervisor", "Dev Junior", "Dev Pleno"};
		String input = sc.next();
		if(input=="Gerente") {
			f1.setCargo(input);
		}
	}
	
}
