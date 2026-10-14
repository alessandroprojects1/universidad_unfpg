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

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "TipoCalificacionEntity")
@Table(name = "tipocalificacion")
public class TipoCalificacionEntity implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "codtipc")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    
    @Column(name = "nomtipc", length = 20, nullable = false, unique = true) // Coincide con tu VARCHAR(20) y UNIQUE
    private String nombre;
        
  
    @Column(name = "esttipc", nullable = false) // Coincide con el nombre de tu columna en MySQL
    private Boolean estado;
    
}
