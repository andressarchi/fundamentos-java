import java.util.Scanner;

public class main {
    public static void ConvertirString(Scanner scanner) {

        System.out.println("Ingrese el  string que quiere convertir en entero: ");
        char num = scanner.next().charAt(0);

        int valorNumerico = (int) num;

        System.out.println("El resultado de la conversión es: " + valorNumerico);
    }
}
