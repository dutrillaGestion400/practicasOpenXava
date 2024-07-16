package com.gestion400.practicasopenxava.modelo;

import javax.persistence.*;

import lombok.*;

@Entity
@Getter @Setter
public class Categoria {
	
	@Id
/*	@Hidden
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy="uuid")*/
	@Column(length=30)
	String id;
	
	@Column(length=50)
	String descripcion;

}