/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.conjunta.dao;
import ec.edu.espe.distribuidas.conjunta.model.AdmEdificio;
import java.util.List;

/**
 *
 * @author Dennys
 */
public class AdmEdificioDao extends AbstractDao<AdmEdificio>{
    public AdmEdificioDao() {
        super(AdmEdificio.class);
    }


    public List<AdmEdificio> listarPorSede(String codSede) {
        return this.finder(
                
                "SELECT ed FROM AdmEdificio ae WHERE ae.edificio.sede.codigo = ?1",
                new Object[]{
                    codSede,});
    }
}
