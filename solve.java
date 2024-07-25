import java.util.Scanner;

public class solve {
    public static void mein (String[] args ){
        Scanner scanner= new Scanner(System.in);
        // casteo y operadores en java

        //  ¿Cuál será el resultado de la siguiente operación?
        int x = (int) 5.89 + (int) 3.45;
        System.out.println(x);// 8

        // Dado char c = 'A';, ¿cómo convertirías c a su valor ASCII como un int?
        char c = 'a';
        int n = (int) c ;
        System.out.println(n);


        // ¿Qué valor se imprimirá?
        double d = 100.04;
        long l = (long)d;
        int i = (int)l;
        System.out.println(i);// 100
    }
    //¿Cuál es el resultado de (int) (char) (byte) -1?
    int n = (int)(char)(byte)-1;
        System.out.println(n);


    public static void ConvertirString() {
        System.out.println("Ingrese el  string que quiere convertir en entero: ");
        Scanner scanner = new Scanner(System.in);
        char num = scanner.next().charAt(0);
        int valorNumerico = (int) num;

        System.out.println("El resultado de la conversión es: " + valorNumerico);
    }

    public static void main(String[] args) {
        ConvertirString();
    }
}
