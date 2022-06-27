package Ejercicio5Adapter;

public class Escritorio implements IAplicacionesComputadora {
    private String name;
    private String type;

    public Escritorio(String name, String type){
        this.name=name;
        this.type=type;
    }

    @Override
    public void iniciarSesion() {
        System.out.println("***** ESCRITORIO *****");
        System.out.println("INFO -> Iniciando sesion Escritorio");
        showInfo();
    }

    @Override
    public void cerrarSesion() {
        System.out.println("***** ESCRITORIO *****");
        System.out.println("INFO -> Cerran sesion Escritorio");
        showInfo();
    }

    @Override
    public void generacionDatos() {
        System.out.println("***** ESCRITORIO *****");
        System.out.println("INFO -> Generando datos Escritorio");
        showInfo();
    }

    public void showInfo(){
        System.out.println("Nombre de la aplicacion: "+name);
        System.out.println("Tipo de aplicacion: "+type);
        System.out.println();
    }
}
