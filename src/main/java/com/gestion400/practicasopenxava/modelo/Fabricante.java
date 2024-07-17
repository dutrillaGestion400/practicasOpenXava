package com.gestion400.practicasopenxava.modelo;

import java.util.*;

import javax.persistence.*;
import javax.persistence.CascadeType;
import javax.persistence.Entity;

import org.hibernate.annotations.*;
import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
public class Fabricante {
	
	@Id @GeneratedValue(generator="system-uuid")
	@Hidden
	@GenericGenerator(name="system-uuid", strategy="uuid")
	@Column(length=32)
	String id;
	
	@Column(length = 50)
	String nombre;
	
	@OneToMany(mappedBy="fabricante", cascade=CascadeType.REMOVE)
	@ListProperties("numero, descripcion, precio")
	Collection <Producto> productos;

}
