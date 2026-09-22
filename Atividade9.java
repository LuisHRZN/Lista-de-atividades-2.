import java.util.Scanner;

public class Atividade9 {
    public Atividade9() {
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Valor do salario: ");
        double salario = sc.nextDouble();
        System.out.println("Quantos anos esta na empresa: ");
        int tempo = sc.nextInt();
        double percentual;
        if (tempo < 1) {
            percentual = 0;
        } else if (tempo >= 1 && tempo <= 3) {
            percentual = 5;
        } else if (tempo > 3 && tempo <= 10) {
            percentual = 10;
        } else
            percentual = 15;
        double bonus = (salario * percentual / 100);
        System.out.printf("Percentual do bonus: " + percentual);
        System.out.printf("Valor do bonus: R& " + bonus);
        }
    }
