public class Dato {
    private static String nombre;
    private static Integer edad;

    static Dato dato=new Dato(nombre, edad);

    private static Dato instance=null;
    private Dato() {
    }

    private Dato(String nombre, Integer edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(int i) {
        this.edad = edad;
    }
    public static Dato getInstance() {

        if (instance == null){
            instance = new Dato();
    }
        return dato;
    }
}
