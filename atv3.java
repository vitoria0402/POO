import java.util.Scanner;
public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro positivo: ");
        int num = scanner.nextInt();
        
        if (num < 0) {
            System.out.println("Número inválido. Por favor, digite um número inteiro positivo.");
        } else {
            int fatorial = calcularFatorial(num);
            System.out.println("O fatorial de " + num + " é: " + fatorial);
        }
        
        scanner.close();
    }
    public static int calcularFatorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            int resultado = 1;
            for (int i = 2; i <= num; i++) {
                resultado *= i;
            }
            return resultado;
        }
    }
}
