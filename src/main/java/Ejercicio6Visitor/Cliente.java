package Ejercicio6Visitor;

public class Cliente {
    public static void main(String[] args){
        Celular celular = new Celular("Samsung", "A71");
        Computadora computadora = new Computadora();
        Televisor televisor = new Televisor("LG", "47 pulgadas", "1920 x 1080 pixeles", 10, true);

        ConcreteVisitor concreteVisitor= new ConcreteVisitor();
        celular.mantener(concreteVisitor);
        computadora.mantener(concreteVisitor);
        televisor.mantener(concreteVisitor);
    }
}
