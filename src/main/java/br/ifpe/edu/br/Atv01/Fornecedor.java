package br.ifpe.edu.br.Atv01;

public class Fornecedor {
	private String nome;
	private String cnpj;
	private String telefone;
	
	public Fornecedor(String nome, String telefone, String cnpj) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.cnpj = cnpj;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	
}
