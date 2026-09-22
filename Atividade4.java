import java.util.Scanner;

public class Atividade4 {
    public Atividade4(){
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero1 = sc.nextInt();
        System.out.println("Digite outro numero: ");
        int numero2 = sc.nextInt();
        if (numero2 == 0)
            System.out.println("A verificação não pode ser efetuada");
        else {
            if (numero1 % numero2 == 0)
                System.out.println("O primeiro numero é multiplo do segundo");
            else
                System.out.println("O primeiro numero não é multiplo do segundo");
        }
    }
}
