import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de termos desejada na série de Fibonacci: ");
        int quant_termos = scanner.nextInt();
        
        System.out.println("Série de Fibonacci com " + quant_termos + " termos:");
        for (int i = 0; i < quant_termos; i++) {
            System.out.print(calcularFibonacci(i) + " ");
        }
        
        scanner.close();
    }
    
    public static int calcularFibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            int a = 0;
            int b = 1;
            int resultado = 0;
            for (int i = 2; i <= n; i++) {
                resultado = a + b;
                a = b;
                b = resultado;
            }
            return resultado;
        }
    }
}
