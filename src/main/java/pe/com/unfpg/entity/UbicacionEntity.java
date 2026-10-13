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
@Entity(name = "UbicacionEntity")
@Table(name = "ubicacion")
public class UbicacionEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "codubi")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	@Column(name = "nomubi",length = 30, nullable = false)
	private String nombre;
	@Column (name ="desubi", length = 300, nullable = false)
	private String descripcion;
	@Column(name = "estubi", nullable = false)
	private Boolean estado;
}