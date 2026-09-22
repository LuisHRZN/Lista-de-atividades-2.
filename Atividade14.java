import java.util.Scanner;

public class Atividade14 {
    public Atividade14() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero do mes: ");
        int mes = sc.nextInt();
        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12 ->
                    System.out.println("O mes possui 31 dias");
            case 4, 6, 9, 11 ->
                    System.out.println("O mes possui 30 dias");
            case 2 ->
                    System.out.println("O mes possui 28 dias");
            default ->
                    System.out.println("Mes invalido");
        }
    }
}