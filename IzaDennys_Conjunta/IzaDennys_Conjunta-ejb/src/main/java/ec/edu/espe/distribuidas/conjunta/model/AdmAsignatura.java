package ec.edu.espe.distribuidas.conjunta.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Dennys
 */
public class AdmAsignatura implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="COD_ASIGNATURA",nullable=false)
    private Integer codigo;
    
    @Column(name = "NOMBRE",nullable = false, length = 100)
    private String nombre;
    
    @Column(name = "CREDITOS",nullable = false, length = 4)
    private Integer creditos;

    public Integer getCodigoAsignatura() {
        return codigo;
    }

    public void setCodigoAsignatura(Integer codigoAsignatura) {
        this.codigo = codigoAsignatura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCreditos() {
        return creditos;
    }

    public void setCreditos(Integer creditos) {
        this.creditos = creditos;
    }
    
    public AdmAsignatura()
    {
        
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.codigo);
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
        final AdmAsignatura other = (AdmAsignatura) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ADMAsignatura{" + "codigo=" + codigo + '}';
    }

     
    
    
    
    
    
    
}
