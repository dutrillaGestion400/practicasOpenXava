package com.gestion400.practicasopenxava.modelo;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
public class Fabricante extends Identificable{
		
	@Column(length = 50)
	String nombre;
	
	@OneToMany(mappedBy="fabricante", cascade=CascadeType.REMOVE)
	@ListProperties("numero, descripcion, precio")
	Collection <Producto> productos;

}
