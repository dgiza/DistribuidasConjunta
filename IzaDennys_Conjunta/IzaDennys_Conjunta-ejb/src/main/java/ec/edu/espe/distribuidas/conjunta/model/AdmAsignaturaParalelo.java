/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.conjunta.model;

import ec.edu.espe.distribuidas.conjunta.enums.EstadoAsigParaleloEnum;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 *
 * @author Dennys
 */
@Entity
@Table(name = "ADM_")
public class AdmAsignaturaParalelo implements Serializable {

    @EmbeddedId
    protected AdmAsignaturaParaleloPK pk;

    @Column(name = "ALUMNOS", nullable = false)
    private Integer alumnos;

    @Enumerated(EnumType.STRING)
    private EstadoAsigParaleloEnum estado;

    @PrimaryKeyJoinColumn(name = "COD_ASIGNATURA", referencedColumnName = "COD_ASIGNATURA")
    @ManyToOne
    private AdmAsignatura asignatura;

    @OneToMany(mappedBy = "paralelo")
    private List<AdmAsigHorario> horarios;

    public AdmAsignaturaParalelo() {
    }

    public AdmAsignaturaParalelo(Integer codigo, String paralelo) {
        this.pk = new AdmAsignaturaParaleloPK(codigo, paralelo);
    }

    public AdmAsignaturaParaleloPK getPk() {
        return pk;
    }

    public void setPk(AdmAsignaturaParaleloPK pk) {
        this.pk = pk;
    }

    public Integer getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(Integer alumnos) {
        this.alumnos = alumnos;
    }

    public EstadoAsigParaleloEnum getEstado() {
        return estado;
    }

    public void setEstado(EstadoAsigParaleloEnum estado) {
        this.estado = estado;
    }

    public AdmAsignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(AdmAsignatura asignatura) {
        this.asignatura = asignatura;
    }

    public List<AdmAsigHorario> getHorarios() {
        return horarios;
    }

    public void setHorarios(List<AdmAsigHorario> horarios) {
        this.horarios = horarios;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.pk);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AdmAsignaturaParalelo other = (AdmAsignaturaParalelo) obj;
        if (!Objects.equals(this.pk, other.pk)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AdmAsignaturaParalelo{" + "pk=" + pk + ", alumnos=" + alumnos + ", estado=" + estado + ", asignatura=" + asignatura + ", horarios=" + horarios + '}';
    }

}
