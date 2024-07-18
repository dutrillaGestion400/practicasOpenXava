package com.gestion400.practicasopenxava.calculadores;

import org.openxava.calculators.*;

import com.gestion400.practicasopenxava.util.*;

public class CalculadorPorcentajeIVA implements ICalculator{

	@Override
	public Object calculate() throws Exception {
		return PreferenciasFacturacion.getPorcentajeIVADefecto();
	}

}
