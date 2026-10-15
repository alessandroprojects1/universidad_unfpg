package pe.com.unfpg.entity;

import java.io.Serializable;
import java.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity(name = "DocenteGradoEntity")
@Table(name = "docentegrado")
public class DocenteGradoEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private DocenteGradoId id;

    @Column(name = "institucion", length = 150, nullable = false)
    private String institucion;

    @Column(name = "anioobtencion", nullable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate anioobtencion;

    @Column(name = "nomesp", length = 100, nullable = false)
    private String nombreespecialidad;

    @Column(name = "estdg", nullable = false)
    private Boolean estado;

    public Boolean getEstado() {
        return estado;
    }
    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    // Claves foráneas
    @ManyToOne
    @MapsId("coddoc")
    @JoinColumn(name = "coddoc", nullable = false)
    private DocenteEntity docente;

    @ManyToOne
    @MapsId("codgrai")
    @JoinColumn(name = "codgrai", nullable = false)
    private GradoInstruccionEntity gradoinstruccion;
}