import java.util.Scanner;

public class Atividade12 {
    public Atividade12() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o saldo da conta: ");
        double saldo = sc.nextDouble();
        System.out.println("Digite o limite diário de saque: ");
        double limite = sc.nextDouble();
        System.out.println("Digite o valor solicitado: ");
        double valor = sc.nextDouble();
        if (saldo < valor) {
            System.out.println("Saldo insuficiente");
        } else if (valor > limite) {
            System.out.println("Valor ultrapassa o limite diário");
        } else {
            saldo = saldo - valor;
            System.out.printf("Saque efetuado");
            System.out.printf("Novo saldo: R$ " + saldo);
        }
    }
}