import java.util.Scanner;

public class Atividade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor inteiro: ");
        int val_int = scanner.nextInt();
        System.out.println("Valor inteiro digitado: " + val_int);

        System.out.print("Digite um valor real: ");
        double val_real = scanner.nextDouble();
        System.out.println("Valor real digitado: " + val_real);

        scanner.close();
    }
}
