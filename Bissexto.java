import java.util.Scanner;

public class VerificadorAnoBissexto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um ano para verificar se é bissexto:");
        int ano = scanner.nextInt();

        boolean Bissexto = false;

        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            Bissexto = true;
        }

        if (Bissexto) {
            System.out.println(ano + " é um ano bissexto.");
        } else {
            System.out.println(ano + " não é um ano bissexto.");
        }

        scanner.close();
    }
}
