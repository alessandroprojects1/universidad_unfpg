package pe.com.unfpg.entity;
import java.io.Serializable;
import java.time.LocalTime; 
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
@Entity(name = "BloqueEntity")
@Table(name = "bloque")
public class BloqueEntity implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "codblo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    
    @Column(name = "nomblo", length = 20, nullable = false, unique = true) // Coincide con tu VARCHAR(20) y UNIQUE
    private String nombre;
        
    @Column(name = "iniblo", nullable = false)
    private LocalTime horaInicio; 
    
    @Column(name = "finblo", nullable = false)
    private LocalTime horaFin;    
  
    @Column(name = "estblo", nullable = false) // Coincide con el nombre de tu columna en MySQL
    private Boolean estado;
    
}
