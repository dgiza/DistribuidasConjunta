package ec.edu.espe.distribuidas.conjunta.enums;

/**
 *
 * @author Dennys
 */
public enum EstadoAsigParaleloEnum {
/** Representa al valor valido de un paralelo. */
    VAL ("Valido"),
    /** Representa al valor Cerrado de un paralelo. */
    CER("Cerrado");

    private final String text;

    private EstadoAsigParaleloEnum(String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }
}
