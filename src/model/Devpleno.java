package model;

public class Devpleno extends Funcionarios {

	public Devpleno (String nome,String sobrenome, String endereco, String telefone, String depFunc, String salario, String cpf, String cargo) {
		super(nome,sobrenome, endereco, telefone, depFunc, salario, cpf,cargo);
		
		
	}

	private String linguagem;
	

	public Devpleno(String nome,String sobrenome, String endereco, String telefone, String depFunc, String salario, String cpf, String cargo, String setor, String equipe, String linguagem) {
		this.linguagem=linguagem;
	}
	
	public String getLinguagem () {
		return linguagem;
	}
	
	public void setLinguagem (String linguagem) {
		this.linguagem=linguagem;
	}
	  @Override
	    public String toString() {
	        return "LINGUAGEM: " +linguagem+"\n";
	        
	    }
}