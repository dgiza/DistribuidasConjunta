/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.conjunta.enums;

/**
 *
 * @author Dennys
 */
public enum TipoAulaEnum {
    /** Representa al valor Normal representando al tipo de curso. */
    NOR ("Normal"),
    /** Representa al valor Computacion representando al tipo de curso. */
    COM ("Computacion"),
    /** Representa al valor Auditorio representando al tipo de curso. */
    AUD("Auditorio");

    private final String text;

    private TipoAulaEnum(String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }
}
