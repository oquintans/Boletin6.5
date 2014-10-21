package ejercicio5;

/**
 *
 * @author oquintansocampo
 */
public class Autor {

    private String nombre;
    private String apellido;

    public Autor(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String toString() {
        return nombre + " " + apellido;
    }
}
