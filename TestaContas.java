import java.util.Scanner;

public class TestaContas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Conta c1 = new ContaCorrente();
        c1.setTitular("Ana");
        c1.deposita(1000);

        Conta c2 = new ContaPoupanca();
        c2.setTitular("Carlos");
        c2.deposita(500);

        System.out.println("Saldo Ana (Corrente): " + c1.getSaldo());
        System.out.println("Saldo Carlos (Poupança): " + c2.getSaldo());

        System.out.print("Transferir quanto de Ana para Carlos? ");
        double valor = scanner.nextDouble();

        c1.transfere(valor, c2);

        System.out.println("Saldo Ana após transferência: " + c1.getSaldo());
        System.out.println("Saldo Carlos após transferência: " + c2.getSaldo());

        scanner.close();
    }
}