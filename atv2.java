import java.util.Scanner;

public class ContagemRegressiva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro positivo: ");
        int num = scanner.nextInt();
        
        if (num <= 0) {
            System.out.println("Número inválido. Por favor, digite um número inteiro positivo.");
        } else {
            System.out.println("Contagem regressiva a partir de " + num + ":");
            for (int i = num; i >= 1; i--) {
                System.out.println(i);
            }
        }
        
        scanner.close();
    }
}
