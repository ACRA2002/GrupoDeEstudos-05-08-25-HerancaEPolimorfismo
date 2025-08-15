public class ContaPoupanca extends Conta {
    @Override
    public String getTipo() {
        return super.getTipo() + " Poupança";
    }
}