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
public class AdmEdificioPK implements Serializable{
    
     @Column(name = "COD_EDIFICIO", nullable = false, length=10)
    private String codigo;

    @Column(name = "COD_SEDE", nullable = false, length = 10)
    private String codigoSede;
    
    public AdmEdificioPK()
    {
        
    }

    public AdmEdificioPK(String codigo, String codigoSede) {
        this.codigo = codigo;
        this.codigoSede = codigoSede;
    }

    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigoSede() {
        return codigoSede;
    }

    public void setCodigoSede(String codigoSede) {
        this.codigoSede = codigoSede;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 11 * hash + Objects.hashCode(this.codigo);
        hash = 11 * hash + Objects.hashCode(this.codigoSede);
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
        final AdmEdificioPK other = (AdmEdificioPK) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        if (!Objects.equals(this.codigoSede, other.codigoSede)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AdmEdificioPK{" + "codigo=" + codigo + ", codigoSede=" + codigoSede + '}';
    }
    
    
    
}
