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
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity(name = "MatriculaLmsEntity")
@Table(name = "matriculalms",
	uniqueConstraints = @UniqueConstraint(columnNames = { "codalu", "codcurl" }))
public class MatriculaLmsEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "nummatl")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	@Column(name = "fecmatl", nullable = false)
	@DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
	private LocalDateTime fechamatricula;
	@Column(name = "estmatl", nullable = false)
	private Boolean estado;

	// claves foraneas
	@ManyToOne
	@JoinColumn(name = "codalu", nullable = false)
	private AlumnoEntity alumno;

	@ManyToOne
	@JoinColumn(name = "codcurl", nullable = false)
	private CursoLmsEntity cursolms;

	@ManyToOne
	@JoinColumn(name = "codroll", nullable = false)
	private RollmsEntity rollms;
}