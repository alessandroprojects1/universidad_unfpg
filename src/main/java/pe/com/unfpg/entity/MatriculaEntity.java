package pe.com.unfpg.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

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
@Entity(name = "MatriculaEntity")
@Table(name = "matricula", uniqueConstraints = @UniqueConstraint(columnNames = { "codalu", "codper" }))
public class MatriculaEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "nummat")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long numero;

	@Column(name = "obsmat", columnDefinition = "TEXT")
	private String observacion;

	@CreationTimestamp
	@Column(name = "fecmat", updatable = false)
	private LocalDateTime fecha;

	@Column(name = "estmat", nullable = false)
	private Boolean estado;

	// claves foraneas
	@ManyToOne
	@JoinColumn(name = "codalu", nullable = false)
	private AlumnoEntity alumno;

	@ManyToOne
	@JoinColumn(name = "codestm", nullable = false)
	private EstadoMatriculaEntity estadomatricula;

	@ManyToOne
	@JoinColumn(name = "codtipm", nullable = false)
	private TipoMatriculaEntity tipomatricula;

	@ManyToOne
	@JoinColumn(name = "codper", nullable = false)
	private PeriodoAcademicoEntity periodo;
}