import java.math.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import com.gestion400.practicasopenxava.modelo.*;

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
	
	@Files
	@Column(length=32)
	String imagenes;
	
	@TextArea
	String observaciones;
}