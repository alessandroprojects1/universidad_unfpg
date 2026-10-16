package pe.com.unfpg.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;

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
@Entity(name = "EvaluacionLmsEntity")
@Table(name = "evaluacionlms")
public class EvaluacionLmsEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "codeval")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	@Column(name = "nomeval", length = 100, nullable = false)
	private String nombre;
	@Column(name = "deseval", columnDefinition = "TEXT", nullable = true)
	private String descripcion;
	@Column(name = "feceval", nullable = false)
	@DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
	private LocalDateTime fechaevaluacion;
	@Column(name = "esteval", nullable = false)
	private Boolean estado;

	// claves foraneas
	@ManyToOne
	@JoinColumn(name = "codcurl", nullable = false)
	private CursoLmsEntity cursolms;
}
