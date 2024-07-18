package com.gestion400.practicasopenxava.calculadores;

import static org.openxava.jpa.XPersistence.getManager;

import org.openxava.calculators.*;

import com.gestion400.practicasopenxava.modelo.*;

import lombok.*;

public class CalculadorPrecioPorUnidad implements ICalculator{
	
	@Getter @Setter
	int numeroProducto;

	@Override
	public Object calculate() throws Exception {
		Producto producto = getManager().find(Producto.class, numeroProducto);
		return producto.getPrecio();
	}

}
