package pe.com.unfpg.entity;
import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import lombok.NoArgsConstructor;

//@ -> significa anotacion
//Lombok----------------------------------------------------------------
@Data
@NoArgsConstructor //metodo constructor vacio
@AllArgsConstructor //metodo constructor con parametros
 // metodos GET,SET,EQUALS, HASHCODE, TOSTRING
@Builder //clase builder
//----------------------------------------------------------------------
//Jakarta----------------------------------------------------------------
@Entity(name = "MetodoPagoEntity") //define la entidad
@Table(name = "metodopago") //define la tabla con la que se trabaja
//-----------------------------------------------------------------------
//debemos de serializar la clase
public class MetodoPagoEntity implements Serializable {
	
	//codigo de serializacion
	private static final long serialVersionUID = 1L;
	
	//atributos de la clase
	@Id //define la clave primaria
	@Column(name = "codmetp") //define la columna con la que se relaciona
	@GeneratedValue(strategy = GenerationType.IDENTITY) //es para el auto_increment
	private Long codigo;
	
	@Column(name = "nommetp",length = 50, nullable = false)
	private String nombre;
	
	@Column(name = "estmetp", nullable = false)
	private Boolean estado;
	
}