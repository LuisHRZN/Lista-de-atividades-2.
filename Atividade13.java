import java.util.Scanner;

public class Atividade13 {
    public Atividade13() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        double numero1 = sc.nextDouble();
        System.out.println("Digite o segundo numero: ");
        double numero2 = sc.nextDouble();
        System.out.println("Escolha uma opcao:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtracao");
        System.out.println("3 - Multiplicacao");
        System.out.println("4 - Divisao");
        int opcao = sc.nextInt();
        switch (opcao) {
            case 1 -> {
                double resultado = numero1 + numero2;
                System.out.printf("Resultado: " + resultado);
            }
            case 2 -> {
                double resultado = numero1 - numero2;
                System.out.printf("Resultado: " + resultado);
            }
            case 3 -> {
                double resultado = numero1 * numero2;
                System.out.printf("Resultado: " + resultado);
            }
            case 4 -> {
                if (numero2 == 0) {
                    System.out.println("Nao e possivel dividir por zero");
                } else {
                    double resultado = numero1 / numero2;
                    System.out.printf("Resultado: " + resultado);
                }
            }
            default -> System.out.println("Opcao invalida");
        }
    }
}