import java.util.Scanner;

public class Atividade10 {
    public Atividade10(){
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu usuario: ");
        String usuario = sc.nextLine();
        System.out.println("Digite sua senha: ");
        String senha = sc.nextLine();
        if (!usuario.equals("admin")) {
            System.out.printf("Usuario não encontrado");
        } else {
            if (senha.equals("123321")) {
                System.out.println("Liberado");
            } else
                System.out.println("Senha incorreta");
        }
    }
}
