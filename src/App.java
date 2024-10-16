import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random random = new Random();

        int num1 = random.nextInt(1000);
        int num2 = random.nextInt(1000);

        System.out.println("Primeiro número: " + num1);
        System.out.println("Segundo número: " + num2);

        System.out.println("Soma: " + (num1 + num2));
        System.out.println("Subtração: " + (num1 - num2));
        System.out.println("Multiplicação: " + (num1 * num2));

        if (num2 != 0) {
            System.out.println("Divisão: " + (num1 / num2));
            System.out.println("Resto da Divisão: " + (num1 % num2));
        } else {
            System.out.println("Impossível dividir por zero!");
        }
    }
}