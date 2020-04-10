package br.com.teste.liquibase.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Aluno
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long	id;

	@Column
	@NotNull
	private String	nome;

	@Column
	private Short	idade;

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public String getNome()
	{
		return nome;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public Short getIdade()
	{
		return idade;
	}

	public void setIdade(Short idade)
	{
		this.idade = idade;
	}

}