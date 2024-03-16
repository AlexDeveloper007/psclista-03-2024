import java.util.Scanner;
import java.util.Random;

public class SorteioNumero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int num2 = scanner.nextInt();

        // Determina o menor e o maior número
        int menor = Math.min(num1, num2);
        int maior = Math.max(num1, num2);

        // Gera um número aleatório no intervalo [menor, maior]
        int numeroSorteado = menor + random.nextInt((maior - menor) + 1);

        // Verifica se o número sorteado é par ou ímpar
        if (numeroSorteado % 2 == 0) {
            System.out.println("O número sorteado foi: " + numeroSorteado + " e ele é par.");
        } else {
            System.out.println("O número sorteado foi: " + numeroSorteado + " e ele é ímpar.");
        }
    }
}
