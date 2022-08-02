package br.com.dio.desafio;

import java.time.LocalDate;
import java.time.LocalTime;

public class Mentoria {
private String titulo;
private String descricao;
private LocalTime data;

public Mentoria() {}


public String getTitulo() {
	return titulo;
}
public void setTitulo(String titulo) {
	this.titulo = titulo;
}
public String getDescricao() {
	return descricao;
}
public void setDescricao(String descricao) {
	this.descricao = descricao;
}
public LocalTime getData() {
	return data;
}
public void setData(LocalTime data) {
	this.data = data;
}
@Override
public String toString() {
	return "Mentoria [titulo=" + titulo + ", descricao=" + descricao + ", data=" + data + "]";
}


public void setData(LocalDate now) {
	
}

}
