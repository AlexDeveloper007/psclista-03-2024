import java.util.Scanner;

public class CalculadoraSimples {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Digite o símbolo da operação (+, -, *, /, ^): ");
        String operacao = scanner.next();

        switch (operacao) {
            case "+":
                System.out.println("Resultado: " + (num1 + num2));
                break;
            case "-":
                System.out.println("Resultado: " + (num1 - num2));
                break;
            case "*":
                System.out.println("Resultado: " + (num1 * num2));
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("Erro: Divisão por zero.");
                } else {
                    System.out.println("Resultado: " + (num1 / num2));
                }
                break;
            case "^":
                System.out.println("Resultado: " + Math.pow(num1, num2));
                break;
            default:
                System.out.println("Erro: Símbolo da operação inválido.");
                break;
        }
    }
}
