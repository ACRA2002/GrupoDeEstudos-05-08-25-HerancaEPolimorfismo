public class ContaCorrente extends Conta {
    @Override
    public void saca(double valor) {
        super.saca(valor + 0.10);
    }

    @Override
    public String getTipo() {
        return super.getTipo() + " Corrente";
    }
}