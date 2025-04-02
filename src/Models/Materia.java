package Models;

public class Materia {

    private String nombre;
    private int creditos;
    private String codigo;
    private Estudiante[] estudiante = new Estudiante[5];


    public Materia() {
    }

    public Materia(String nombre, int creditos, String codigo) {
        this.nombre = nombre;
        this.creditos = creditos;
        this.codigo = codigo;
    }

    public Estudiante getEstudiante(int i) {
        return estudiante[i];
    }

    public void setEstudiante(Estudiante estudiante, int i) {
        this.estudiante[i] = estudiante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }


}
