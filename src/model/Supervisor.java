package model;

public class Supervisor extends Funcionarios {
	
		public Supervisor(int ID, String nome, String sobrenome, String endereco, String telefone, String celular, String dependentes, String salario) {
	super(ID, nome, sobrenome, endereco, telefone, celular, dependentes, salario);
	
	}
		
		private String setor;
		private String equipe;
		public String getSetor() {
			return setor;
		}
		public void setSetor(String setor) {
			this.setor = setor;
		}
		public String getEquipe() {
			return equipe;
		}
		public void setEquipe(String equipe) {
			this.equipe = equipe;
		}
}
