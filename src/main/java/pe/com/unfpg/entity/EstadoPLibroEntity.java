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
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
//@ -> significa anotacion
//Lombok----------------------------------------------------------------
@Data
@NoArgsConstructor //metodo constructor vacio
@AllArgsConstructor //metodo constructor con parametros
 // metodos GET,SET,EQUALS, HASHCODE, TOSTRING
@Builder //clase builder
//----------------------------------------------------------------------
//Jakarta----------------------------------------------------------------
@Entity(name = "EstadoPLibroEntity") //define la entidad
@Table(name = "estadoprestamolibro") //define la tabla con la que se trabaja
//-----------------------------------------------------------------------
//debemos de serializar la clase
public class EstadoPLibroEntity implements Serializable {
	
	//codigo de serializacion
	private static final long serialVersionUID = 1L;
	
	//atributos de la clase
	@Id //define la clave primaria
	@Column(name = "codestl") //define la columna con la que se relaciona
	@GeneratedValue(strategy = GenerationType.IDENTITY) //es para el auto_increment
	private Long codigo;
	@Column(name = "nomestl",length = 50, nullable = false)
	private String nombre;
	@Column(name = "estestl", nullable = false)
	private Boolean estado;
	
}
