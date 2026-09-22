import java.util.Scanner;

public class Atividade8 {
    public Atividade8() {
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a velocidade da via: ");
        int via = sc.nextInt();
        System.out.println("Qual a velocidade do veiculo: ");
        int veiculo = sc.nextInt();
        double excesso = veiculo - via;
        double percentual = (excesso / (double) via)* 100;
        if (via >= veiculo) {
            System.out.println("Dentro do limite");
        } else if (veiculo > via && percentual <= 20) {
            System.out.println("Infração média");
        } else if (veiculo > via && percentual > 20 && percentual <= 50) {
            System.out.println("Infração grave");
        } else
            System.out.println("Infração gravissima");
    }
}
