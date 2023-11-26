import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BinaryCounter contador = new BinaryCounter();

        System.out.println("Digite um valor para n: ");
        int n = scanner.nextInt();

        if (n <= 0)
        {
            System.out.println("Por favor , digite um valor inteiro positivo");
        }
        else
        {
            contador.generateBinaryNumbers(n);
        }
    }
}