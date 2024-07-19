package com.gestion400.practicasopenxava.anotaciones;
import java.lang.annotation.*;

import javax.validation.*;

@Constraint(validatedBy = com.gestion400.practicasopenxava.validadores.ValidadorISBN.class)
@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ISBN {
	
	boolean buscar() default true;
	
	Class<?>[]groups() default{};
	Class<? extends Payload>[] payload() default{};
	String message() default "isbn_invalido";
}
