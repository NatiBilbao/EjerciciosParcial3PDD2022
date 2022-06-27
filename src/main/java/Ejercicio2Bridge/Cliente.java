package Ejercicio2Bridge;

public class Cliente {
    public static void main(String[] args){

        IEmpresas empresaAlcantarillado = new InstalacionAlcantarillado(new PagoEfectivo(), "EPSAS", 1245343, 10000234, 110);
        empresaAlcantarillado.tipoPago();

        IEmpresas empresaAlcantarillado2 = new InstalacionAlcantarillado(new PagoAplicacionEmpresa(), "SEMAPA", 233243, 10002345, 180);
        empresaAlcantarillado2.tipoPago();

        IEmpresas empresaElectrica = new InstalacionElectrica(new PagoTigoMoney(), "De La Paz", 5433123, 20000434, 200);
        empresaElectrica.tipoPago();

        IEmpresas empresaElectrica2 = new InstalacionElectrica(new PagoTransferenciaBancaria(), "SEPSA", 346544, 10043222, 150);
        empresaElectrica2.tipoPago();

        IEmpresas empresaAgua = new IntalacionAgua(new PagoAplicacionEmpresa(), "SAGUAPAC", 543326, 10002788, 120);
        empresaAgua.tipoPago();

        IEmpresas empresaAgua2 = new IntalacionAgua(new PagoTigoMoney(), "COOSALT", 123422, 2003737, 350);
        empresaAgua2.tipoPago();
    }
}
