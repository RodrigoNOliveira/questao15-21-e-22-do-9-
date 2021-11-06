import java.util.Scanner;

class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] entrada = new int[6];

        System.out.println("Digite 6 valores inteiros: ");
        for (int i = 0; i < entrada.length; i++) {
            entrada[i] = scanner.nextInt();

        }

        System.out.print("Os números digitados foram: ");
        for (int i = 0; i < entrada.length; i++) {
            System.out.print(entrada[i] + " ");
        }
    }
}