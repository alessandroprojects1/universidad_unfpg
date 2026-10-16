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
@Entity(name = "CursoLmsEntity")
@Table(name = "cursolms")
public class CursoLmsEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "codcurl")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	@Column(name = "estcurl", nullable = false)
	private Boolean estado;

	// claves foraneas
	@ManyToOne
	@JoinColumn(name = "codpla", nullable = false)
	private PlanEstudioEntity planestudio;

	@ManyToOne
	@JoinColumn(name = "codsec", nullable = false)
	private SeccionEntity seccion;
}