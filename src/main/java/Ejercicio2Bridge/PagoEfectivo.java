package Ejercicio2Bridge;

public class PagoEfectivo implements ITipoPago{
    @Override
    public void pagar(double precio) {
        System.out.println("***** SE PAGARA EN EFECTIVO *****");
        System.out.println("El costo sera de: " + precio);
        System.out.println("INFO -> Sin descuento");
        System.out.println();
    }
}
