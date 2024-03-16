import java.util.Scanner;

public class MaquinaVendaAutomatica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê o valor da compra
        System.out.print("Valor da compra: R$ ");
        double valorCompra = scanner.nextDouble();

        // Lê o valor pago
        System.out.print("Valor pago: R$ ");
        double valorPago = scanner.nextDouble();

        // Verifica se o valor pago é suficiente
        if (valorPago < valorCompra) {
            System.out.println("Quantia paga insuficiente.");
        } else {
            // Calcula o troco
            double troco = valorPago - valorCompra;

            System.out.println("Troco: R$ " + troco);

            int[] notas = {50, 20, 10, 5, 2, 1};
            int[] contadorNotas = new int[notas.length];

            // Calcula o número de notas para o troco
            for (int i = 0; i < notas.length; i++) {
                if (troco >= notas[i]) {
                    contadorNotas[i] = (int)(troco / notas[i]);
                    troco -= contadorNotas[i] * notas[i];
                }
            }

            // Exibe o número de notas para o troco
            for (int i = 0; i < notas.length; i++) {
                if (contadorNotas[i] != 0) {
                    System.out.println("Notas de R$ " + notas[i] + ",00: " + contadorNotas[i]);
                }
            }
        }
    }
}
