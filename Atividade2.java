import java.util.Scanner;

public class Atividade2 {
    public Atividade2(){
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = sc.nextInt();
        if (numero > 0)
            System.out.println("Positivo");
        if (numero % 2 == 0)
            System.out.println("Par");
        if (numero % 5 == 0)
            System.out.println("Multiplo de 5");
        if (Math.abs(numero) >= 10 && Math.abs(numero) <= 99)
            System.out.println("Tem dois digitos");
    }
}
