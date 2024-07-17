package com.gestion400.practicasopenxava.modelo;

import java.time.*;
import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.openxava.calculators.*;

import com.gestion400.practicasopenxava.calculadores.*;

import lombok.*;

@Entity @Getter @Setter
@View(members = "anyo, numero, fecha; " +
			"datos{" +
		 		"cliente;" +
			    "detalles;" + 
		 		"observaciones" +
		 		"}"
)
abstract public class DocumentoComercial extends Identificable{
	
			
	@DefaultValueCalculator(CurrentYearCalculator.class)
	@Column(length =4)
	int anyo;
	
	@Column(length = 6)
	@DefaultValueCalculator(value = CalculadorSiguienteNumeroParaAnyo.class, properties = @PropertyValue(name = "anyo"))
	int numero;
	
	@DefaultValueCalculator(CurrentLocalDateCalculator.class)
	@Required
	LocalDate fecha;
	
	@ElementCollection
	@ListProperties("producto.numero, producto.descripcion, cantidad")
	Collection<Detalle> detalles;
	
	@Stereotype("MEMO")
	String observaciones;
	
	
	@ManyToOne(fetch = FetchType.LAZY, optional=false)
	@ReferenceView("Simple")
	Cliente cliente;

}
