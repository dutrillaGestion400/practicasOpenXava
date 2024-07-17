package com.gestion400.practicasopenxava.modelo;

import javax.persistence.*;

import lombok.*;

@Entity
@Getter @Setter
public class Categoria extends Identificable{
	
	@Column(length=50)
	String descripcion;
}