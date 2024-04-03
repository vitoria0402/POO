import java.util.Scanner;

public class Atividade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int num2 = scanner.nextInt();

        int soma =  num1 + num2;
        int produto = num1 * num2;
        int diferenca =  num1 - num2;
        double quociente = (double)  num1 / num2; 

        System.out.println("Soma: " + soma);
        System.out.println("Produto: " + produto);
        System.out.println("Diferença: " + diferenca);
        System.out.println("Quociente: " + quociente);

    
        scanner.close();
    }
}
