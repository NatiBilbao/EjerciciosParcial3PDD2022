package Ejercicio6Visitor;

public interface IArtefactosElectronicos {
    void showInfo();
    void mantener(IVisitor visitor);
}
