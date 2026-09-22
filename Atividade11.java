import java.util.Scanner;

public class Atividade11 {
    public Atividade11(){
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a frequência do aluno: ");
        double frequencia = sc.nextDouble();
        System.out.println("Digite a média final: ");
        double media = sc.nextDouble();
        if (frequencia < 75) {
            System.out.println("Reprovado por falta");
        } else if (media >= 7) {
            System.out.println("Aprovado");
        } else if (media >= 5) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado por nota");
        }
    }
}