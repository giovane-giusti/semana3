package model;

public class Funcionarios {

	private int ID;
	private String nome;
	private String sobrenome;
	private String endereco;
	private String telefone;
	private String celular;
	private String dependentes;
	private String salario;
	private String cargo;

	public Funcionarios(int ID, String nome, String sobrenome, String endereco, String telefone, String celular, String dependentes, String salario, String cargo) {
		
		this.ID = ID;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.dependentes = dependentes;
		this.salario = salario;
		this.cargo=cargo;
	}
	
	public Funcionarios(int ID, String nome, String sobrenome, String endereco, String telefone, String celular, String dependentes, String salario) {
		
		this.ID = ID;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.celular = celular;
		this.dependentes = dependentes;
		this.salario = salario;
	}

	public int getID() {
		return ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getDependentes() {
		return dependentes;
	}

	public void setDependentes(String dependentes) {
		this.dependentes = dependentes;
	}

	public String getSalario() {
		return salario;
	}

	public void setSalario(String salario) {
		this.salario = salario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	@Override
	public String toString() {
	return "ID" + ID + "nome" + nome + "sobrenome" + sobrenome + "endereço" + endereco + "telefone" + telefone + "celular" + celular + "dependentes" + dependentes + "salario" + salario + "cargo" + cargo;
}
}
