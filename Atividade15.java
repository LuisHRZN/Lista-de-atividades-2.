import java.util.Scanner;

public class Atividade15 {
    public Atividade15() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== TERMINAL DE ESTACIONAMENTO ===");
        System.out.println("Digite o tipo de veiculo:");
        System.out.println("1 - Carro");
        System.out.println("2 - Moto");
        int tipo = sc.nextInt();
        double tarifa;
        switch (tipo) {
            case 1 -> {
                tarifa = 8.00;
            }
            case 2 -> {
                tarifa = 5.00;
            }
            default -> {
                System.out.println("Opcao invalida");
                sc.close();
                return;
            }
        }
        System.out.println("Digite a quantidade de horas: ");
        double horas = sc.nextDouble();
        double valor = tarifa * horas;
        sc.nextLine();
        System.out.println("O cliente possui cupom? (sim/nao)");
        String cupom = sc.nextLine();
        if (cupom.equalsIgnoreCase("sim")) {
            if (valor >= 50.00) {
                double desconto = valor * 0.20;
                valor = valor - desconto;
                System.out.println("Desconto de 20% aplicado");
            } else {
                System.out.println("O cupom vale apenas para valores acima de R$ 50,00");
            }
        }
        if (horas > 12) {
            System.out.println("Aviso: permanencia longa");
        }
        if (horas > 24) {
            System.out.println("Aviso: cobranca de diaria");
        }
        if (horas <= 2) {
            System.out.println("Permanencia curta");
        } else if (horas <= 6) {
            System.out.println("Permanencia media");
        } else {
            System.out.println("Permanencia longa");
        }
        System.out.printf("Valor final: R$ %.2f%n", valor);
    }
}