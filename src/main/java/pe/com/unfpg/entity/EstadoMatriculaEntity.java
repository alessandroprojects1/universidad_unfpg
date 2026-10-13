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

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity(name = "EstadoMatriculaEntity")
@Table(name = "estadomatricula")
public class EstadoMatriculaEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "codestm")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	@Column(name = "nomestm",length = 30, nullable = false)
	private String nombre;
	@Column(name = "estestm", nullable = false)
	private Boolean estado;
}
