package com.gestion400.practicasopenxava.modelo;

import javax.persistence.*;

import lombok.*;

@Embeddable @Getter @Setter
public class Direccion {
	
	@Column(length=30)
	String calle;
	
	@Column(length=5)
	String codigoPostal;
	
	@Column(length=3)
	String portal;
	
	@Column(length=30)
	String municipio;
	
	@Column(length=30)
	String provincia;
}
