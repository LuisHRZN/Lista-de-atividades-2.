import java.util.Scanner;

public class Atividade1 {
    public Atividade1() {
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        if (idade >= 16)
            System.out.println("Pode votar");
        if (idade >= 18)
            System.out.println("Pode dirigir");
        if (idade >= 60)
            System.out.println("Idoso");
    }
}
