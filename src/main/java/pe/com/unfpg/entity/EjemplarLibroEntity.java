package pe.com.unfpg.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity(name = "EjemplarLibroEntity")
@Table(name = "ejemplarlibro")
public class EjemplarLibroEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "codeje")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	@Column(name = "codejemplar", length = 50, nullable = false, unique = true)
	private String codigoejemplar;
	@Column(name = "estadoeje", length = 30, nullable = false)
	private String estadoejemplar; // DISPONIBLE, PRESTADO, PERDIDO, MANTENIMIENTO
	@Column(name = "esteje", nullable = false)
	private Boolean estado;

	// claves foraneas
	@ManyToOne
	@JoinColumn(name = "codlib", nullable = false)
	private LibroEntity libro;
}