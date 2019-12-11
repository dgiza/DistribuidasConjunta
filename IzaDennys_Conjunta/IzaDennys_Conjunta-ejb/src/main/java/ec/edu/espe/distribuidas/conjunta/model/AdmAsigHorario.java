/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.conjunta.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.PrimaryKeyJoinColumns;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Dennys
 */
@Entity
@Table(name = "ADM_ASINGAT_PARAL_HORARIO")
public class AdmAsigHorario implements Serializable {

    @EmbeddedId
    protected AdmAsigHorarioPK pk;

    @Column(name = "HORARIO_INICIO", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date horarioInicio;

    @Column(name = "HORARIO_FIN", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date horarioFin;

    @Column(name = "HORAS", nullable = false)
    private Integer horas;

    @PrimaryKeyJoinColumn(name = "COD_AULA", referencedColumnName = "COD_AULA")
    @ManyToOne
    private AdmAula aula;

    @PrimaryKeyJoinColumns({
        @PrimaryKeyJoinColumn(name = "COD_ASIGNATURA", referencedColumnName = "COD_ASIGNATURA")
        ,
        @PrimaryKeyJoinColumn(name = "PARALELO", referencedColumnName = "PARALELO")
    })
    @ManyToOne
    private AdmAsignaturaParalelo paralelo;

    public AdmAsigHorario() {
    }

    public AdmAsigHorario(Integer codAsignatura, String paralelo, Integer codAula, String dia) {
        this.pk = new AdmAsigHorarioPK(codAsignatura, paralelo, codAula, dia);
    }

    public AdmAsigHorarioPK getPk() {
        return pk;
    }

    public void setPk(AdmAsigHorarioPK pk) {
        this.pk = pk;
    }

    public Date getHorarioInicio() {
        return horarioInicio;
    }

    public void setHorarioInicio(Date horarioInicio) {
        this.horarioInicio = horarioInicio;
    }

    public Date getHorarioFin() {
        return horarioFin;
    }

    public void setHorarioFin(Date horarioFin) {
        this.horarioFin = horarioFin;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    public AdmAula getAula() {
        return aula;
    }

    public void setAula(AdmAula aula) {
        this.aula = aula;
    }

    public AdmAsignaturaParalelo getParalelo() {
        return paralelo;
    }

    public void setParalelo(AdmAsignaturaParalelo paralelo) {
        this.paralelo = paralelo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.pk);
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
        final AdmAsigHorario other = (AdmAsigHorario) obj;
        if (!Objects.equals(this.pk, other.pk)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AdmAsigHorario{" + "pk=" + pk + ", horarioInicio=" + horarioInicio + ", horarioFin=" + horarioFin + ", horas=" + horas + ", aula=" + aula + ", paralelo=" + paralelo + '}';
    }

}