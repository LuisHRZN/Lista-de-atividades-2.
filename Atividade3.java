import java.util.Scanner;

public class Atividade3 {
    public Atividade3(){
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    System.out.println("Quantos ªC: ");
    double celsius = sc.nextDouble();
    System.out.println("Umidade do ar: ");
    double umidade = sc.nextDouble();
    if (celsius >= 38)
        System.out.println("Alerta de calor extremo");
    if (umidade < 30)
        System.out.println("Alerta de umidade Baixa");
    if (celsius >= 38 && umidade < 30)
        System.out.println("Alerta de risco de queimada");
    }
}
