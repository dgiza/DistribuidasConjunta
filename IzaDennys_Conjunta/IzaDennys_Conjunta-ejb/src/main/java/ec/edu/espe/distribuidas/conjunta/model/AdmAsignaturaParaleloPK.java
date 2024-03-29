/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.conjunta.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Dennys
 */
@Embeddable
class AdmAsignaturaParaleloPK implements Serializable {

    @Column(name = "COD_ASIGNATURA", nullable = false)
    private Integer codigo;

    @Column(name = "PARALELO", nullable = false, length = 1)
    private String paralelo;

    public AdmAsignaturaParaleloPK() {
    }

    public AdmAsignaturaParaleloPK(Integer codigo, String paralelo) {
        this.codigo = codigo;
        this.paralelo = paralelo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getParalelo() {
        return paralelo;
    }

    public void setParalelo(String paralelo) {
        this.paralelo = paralelo;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.codigo);
        hash = 97 * hash + Objects.hashCode(this.paralelo);
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
        final AdmAsignaturaParaleloPK other = (AdmAsignaturaParaleloPK) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        if (!Objects.equals(this.paralelo, other.paralelo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AdmAsignaturaParaleloPK{" + "codigo=" + codigo + ", paralelo=" + paralelo + '}';
    }

}
