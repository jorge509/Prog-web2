package com.avaliacion.avaliativa.model;

import java.time.LocalDate;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="Libro")
public class Libro {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int Id;
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
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
	private String autor;
	@NotBlank
	private String titulo;
	

	
	@JsonFormat(shape=JsonFormat.Shape.STRING,pattern="dd-MM-yyyy")
	private LocalDate data;

}
