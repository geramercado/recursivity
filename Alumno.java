package RecursividadGerardoMercado;

public class Alumno {

    private String nombre;
    private String nControl;
    private int edad;

    public Alumno(String nombre, String nControl, int edad) {
        this.nombre = nombre;
        this.nControl = nControl;
        this.edad = edad;
    }

    Alumno(){}

    public String getNombre() {
        return nombre;
    }

    public String getnControl() {
        return nControl;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setnControl(String nControl) {
        this.nControl = nControl;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Alumno [ " + "nombre='" + nombre + '\'' +
                ", nControl='" + nControl +
                '\'' + ", edad=" + edad +
                ']';
    }
}
