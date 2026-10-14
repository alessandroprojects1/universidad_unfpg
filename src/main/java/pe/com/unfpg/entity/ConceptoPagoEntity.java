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
@Entity(name = "ConceptoPagoEntity")
@Table(name = "conceptopago")
public class ConceptoPagoEntity implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "codconp")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    
    @Column(name = "nomconp", length = 100, nullable = false, unique = true)
    private String nombre;
    
    @Column(name = "desconp", columnDefinition = "TEXT")
    private String descripcion;
    
    @Column(name = "estconp", nullable = false)
    private Boolean estado;
    
}