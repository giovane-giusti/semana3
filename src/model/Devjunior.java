package model;

import javax.swing.JOptionPane;

public class Devjunior extends Funcionarios {

	public Devjunior (String nome,String sobrenome, String endereco, String telefone, String depFunc, String salario, String cpf, String cargo) {
		super(nome,sobrenome, endereco, telefone, depFunc, salario, cpf,cargo);
		
	}
	
	
	private String linguagem;
	
	public Devjunior(String nome,String sobrenome, String endereco, String telefone, String depFunc, String salario, String cpf, String cargo, String setor, String equipe, String linguagem) {
		this.linguagem=linguagem;
	}
	
	public String getLinguagem () {
		return linguagem;
	}
	
	public void setLinguagem (String linguagem) {
		this.linguagem=linguagem;
	}
	
    
 // FUNCOES DOS DEV JUNIOR E PLENO
    public void Devjunior (String devjun) {
		String dev=JOptionPane.showInputDialog("DevJunior ou DevPleno?");
		
		if (dev.equals(devjun)) {
			JOptionPane.showMessageDialog(null, "Você é um desenvolvedor junior" );
			JOptionPane.showMessageDialog(null, "Você deve pedir ajuda ao desenvolvedor pleno" );
		}
		
		else 
			JOptionPane.showMessageDialog(null, "Você é um desenvolvedor Pleno" );	
		JOptionPane.showMessageDialog(null, "Você deve orientar o desenvolvedor junior");
	}
	

    @Override
    public String toString() {
        return "LINGUAGEM: " +linguagem+"\n";
        
    }
}