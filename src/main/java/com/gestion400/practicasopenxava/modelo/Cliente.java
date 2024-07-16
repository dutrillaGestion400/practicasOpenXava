package com.gestion400.practicasopenxava.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter @Setter
public class Cliente {

	@Id
	@Column(length=6)
	int numero;
	
	@Column(length=6)
	@Required
	String nombre;
	
}
