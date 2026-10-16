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
@Entity(name = "SeccionEntity")
@Table(name = "seccion")
public class SeccionEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "codsec")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @Column(name = "capsec", nullable = false)
    private Integer capacidad;

    @ManyToOne
    @JoinColumn(name = "codcur", nullable = false)
    private CursoEntity curso;

    @ManyToOne
    @JoinColumn(name = "coddoc", nullable = false)
    private DocenteEntity docente;

    @ManyToOne
    @JoinColumn(name = "codper", nullable = false)
    private PeriodoAcademicoEntity periodoacademico;
}