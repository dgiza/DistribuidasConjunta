/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.conjunta.dao;

import ec.edu.espe.distribuidas.conjunta.model.AdmAula;
import java.util.List;

/**
 *
 * @author Dennys
 */
public class AdmAulaDao extends AbstractDao<AdmAula> {

    public AdmAulaDao() {
        super(AdmAula.class);
    }


    public List<AdmAula> listarPorSede(String codSede) {
        return this.finder(
                "SELECT au FROM AdmAula au WHERE au.edificio.sede.codigo = ?1",
                new Object[]{
                    codSede,});
    }

}