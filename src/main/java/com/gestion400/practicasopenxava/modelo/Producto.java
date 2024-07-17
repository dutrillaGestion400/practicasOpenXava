package com.gestion400.practicasopenxava.modelo;
import java.math.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter @Setter
public class Producto {
	
	@Id
	@Column(length=6)
	int numero;
	
	@Column(length=50)
	@Required
	String descripcion;
	
	@ManyToOne
	(fetch=FetchType.LAZY, optional=true)
	@DescriptionsList
	Categoria categoria;
	
	@Money
	BigDecimal precio;
	
	@Stereotype ("GALERIA_IMAGENES")
	@Column(length=32)
	String imagenes;
	
	@Stereotype("TEXTO_GRANDE")
	@TextArea
	String observaciones;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@DescriptionsList
	Fabricante fabricante;
}