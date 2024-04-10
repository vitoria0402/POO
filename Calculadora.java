import java.util.Scanner;

public class CalculadoraDesconto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor total da compra:");
        double valorTotal = scanner.nextDouble();

        System.out.println("Digite o tipo de cliente (regular ou especial):");
        String cliente = scanner.next();

        double desconto;
        if (cliente.equalsIgnoreCase("especial")) {
            desconto = 0.1; 
        } else {
            desconto = 0.05; 
        }

        double valor_final = valor_total * (1 - desconto);

        System.out.println("O valor final após o desconto é: R$" + valor_final);

        scanner.close();
    }
}
