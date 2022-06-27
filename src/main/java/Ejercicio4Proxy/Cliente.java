package Ejercicio4Proxy;

public class Cliente {
    public static void main(String[] args) {
        Proxy proxy = new Proxy(new Servidor1(), new Servidor2());


        proxy.register(1,"Cristoffer", "Cris", "123");
        proxy.register(2,"Andrea", "Andy", "abc");
        proxy.register(3,"Manuel", "Manu", "456");
        proxy.register(4,"Claudia", "Clau", "def");
        proxy.register(5,"Nicolas", "Nico", "789");

        proxy.brindarAtencion(1, "123");
        proxy.brindarAtencion(2, "abc");
        proxy.brindarAtencion(3, "456");
        proxy.brindarAtencion(4, "def");
        proxy.brindarAtencion(5, "789");
        proxy.brindarAtencion(1, "000");
        proxy.brindarAtencion(7, "123");
    }
}
