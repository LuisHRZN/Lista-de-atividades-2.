import java.util.Scanner;

public class Atividade6 {
    public Atividade6(){
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor da compra: ");
        double valor = sc.nextDouble();
        double frete;
        if (valor >= 199)
            frete = 0;
        else
            frete = 24.90;
        double total = valor + frete;
        System.out.println("Frete: R$ " + frete);
        System.out.println("Valor total: R$ " + total);
    }
}
