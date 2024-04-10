import java.util.Scanner;

public class OrdenadorNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double num1 = scanner.nextDouble();

        System.out.println("Digite o segundo número:");
        double num2 = scanner.nextDouble();

        System.out.println("Digite o terceiro número:");
        double numero3 = scanner.nextDouble();

        double menor, meio, maior;

        
        if (num1 <= num2 && num1 <= numero3) {
            menor = num1;
            if (num2 <= numero3) {
                meio = num2;
                maior = numero3;
            } else {
                meio = numero3;
                maior = num2;
            }
        } else if (num2 <= num1 && num2 <= numero3) {
            menor = num2;
            if (num1 <= numero3) {
                meio = num1;
                maior = numero3;
            } else {
                meio = numero3;
                maior = num1;
            }
        } else {
            menor = numero3;
            if (num1 <= num2) {
                meio = num1;
                maior = num2;
            } else {
                meio = num2;
                maior = num1;
            }
        }

        System.out.println("Os números em ordem crescente são: " + menor + ", " + meio + ", " + maior);

        scanner.close();
    }
}
