public class Main {
    //Este patron de diseño se llama SINGLETON
    public static void main(String[] args) {
         Dato dato1=Dato.getInstance();
        dato1.setEdad(23);
        dato1.setNombre("Pepe");
         Dato dato2=Dato.getInstance();
        System.out.println(dato1.getNombre()+dato1.getEdad()+dato2.getNombre()+dato2.getEdad());
    }
}
