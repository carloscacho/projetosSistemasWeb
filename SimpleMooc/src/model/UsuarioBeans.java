package model;

import java.io.Serializable;

public class UsuarioBeans implements Serializable{
	
	private String nome;
	private String email;
	private String senha;
	private String sexo;
	
	public UsuarioBeans() {
		//nada
	}
	
	

	public UsuarioBeans(String nome, String email, String senha, String sexo) {
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.sexo = sexo;
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	

}
