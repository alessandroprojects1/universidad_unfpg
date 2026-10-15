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
@Entity(name = "AulaEntity")
@Table(name = "aula")
public class AulaEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "codaul")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @Column(name = "nomaul", length = 50, nullable = false, unique = true)
    private String nombre;

    @Column(name = "capaul", nullable = false)
    private Integer capacidad;

    // Claves foráneas
    @ManyToOne
    @JoinColumn(name = "codubi", nullable = false)
    private UbicacionEntity ubicacion;

    @ManyToOne
    @JoinColumn(name = "codtipa", nullable = false)
    private TipoAulaEntity tipoaula;

    @ManyToOne
    @JoinColumn(name = "codesta", nullable = false)
    private EstadoAulaEntity estadoaula;
}