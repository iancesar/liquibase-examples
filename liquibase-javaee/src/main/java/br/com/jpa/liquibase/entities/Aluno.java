package br.com.jpa.liquibase.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Aluno
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer	id;

	@Column(length = 60)
	@NotNull
	private String		nome;

	@Column
	private Short		idade;

	@ManyToOne
	@NotNull
	private Curso		curso;

	//Getters and Setters
}

//	public Integer getId()
//	{
//		return id;
//	}
//
//	public void setId(Integer id)
//	{
//		this.id = id;
//	}
//
//	public String getNome()
//	{
//		return nome;
//	}
//
//	public void setNome(String nome)
//	{
//		this.nome = nome;
//	}
//
//	public Short getIdade()
//	{
//		return idade;
//	}
//
//	public void setIdade(Short idade)
//	{
//		this.idade = idade;
//	}
//
//}