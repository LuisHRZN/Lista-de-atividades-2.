import java.util.Scanner;

public class Atividade7{
    public Atividade7(){
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Que horas são: ");
        int horas = sc.nextInt();
        if (horas >= 0 && horas <= 11) {
            System.out.println("Bom dia");
        }
        else if (horas >= 12 && horas <= 17) {
            System.out.println("Boa tarde");
        } else if (horas >= 18 && horas <= 23) {
            System.out.println("Boa noite");
        }
        else
            System.out.println("Hora invalida");
    }
}
