import java.util.Scanner;

public class CalculoCirculoEsfera {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double PI = 3.141592;

        System.out.print("Digite o código da operação (1: Perímetro, 2: Área, 3: Volume): ");
        int operacao = scanner.nextInt();

        System.out.print("Digite o raio do círculo/esfera: ");
        double raio = scanner.nextDouble();

        switch (operacao) {
            case 1:
                // Calcula o perímetro do círculo
                double perimetro = 2 * PI * raio;
                System.out.println("O perímetro do círculo é: " + perimetro);
                break;
            case 2:
                // Calcula a área do círculo
                double area = PI * raio * raio;
                System.out.println("A área do círculo é: " + area);
                break;
            case 3:
                // Calcula o volume da esfera
                double volume = (4.0/3) * PI * Math.pow(raio, 3);
                System.out.println("O volume da esfera é: " + volume);
                break;
            default:
                System.out.println("Código da operação inválido.");
                break;
        }
    }
}
