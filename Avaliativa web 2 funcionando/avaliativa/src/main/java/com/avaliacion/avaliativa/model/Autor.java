package com.avaliacion.avaliativa.model;
import java.time.LocalDate;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="Autor")
public class Autor {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int Id;
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	

	
	@NotNull
	private int tipo;
	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	@NotBlank
	
	

	
	@JsonFormat(shape=JsonFormat.Shape.STRING,pattern="dd-MM-yyyy")
	private LocalDate Datanacimento;
	public @NotBlank LocalDate getDatanacimento() {
		return Datanacimento;
	}

	public void setDatanacimento(LocalDate localDate) {
		Datanacimento = localDate;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getSobrenome() {
		return Sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		Sobrenome = sobrenome;
	}

	public String getGeneroliterario() {
		return generoliterario;
	}

	public void setGeneroliterario(String generoliterario) {
		this.generoliterario = generoliterario;
	}




	private String Nome;
	private String Sobrenome;
	private String generoliterario;

}
