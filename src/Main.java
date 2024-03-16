import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Lê os três números
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();
        System.out.print("Digite o terceiro número: ");
        double num3 = scanner.nextDouble();

        // Calcula o maior número
        double maior = Math.max(num1, Math.max(num2, num3));

        // Calcula o menor número
        double menor = Math.min(num1, Math.min(num2, num3));

        // Calcula a média aritmética
        double media = (num1 + num2 + num3) / 3;

        // Exibe os resultados
        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
        System.out.println("Média aritmética: " + media);
    }
}