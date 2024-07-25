import java.util.Scanner;

public class solve {
    public  static  void main (String[]args){
        Scanner scanner= new Scanner(System.in);
        int menu ;
        int opcion2;
        System.out.println("Que quieres hacer \n" +
                "1.Casteo\n2.Operadores de Asignacion\n3.Operadores de incremento\n" +
                "4.Ejercicio combinados ");

        int opcion = scanner.nextInt();
        switch (opcion){
            case 1 :
                System.out.println("Que quieres hacer \n" +
                        "1.¿Cuál será el resultado de la siguiente operación?" +
                        "\n2.Dado char c = 'A';, ¿cómo convertirías c a su valor ASCII como un int?" +
                        "\n3.¿Qué valor se imprimirá?\ndouble d = 100.04;\n" +
                        "long l = (long)d;\n" +
                        "int i = (int)l;\n" +
                        "System.out.println(i);\n" +
                        "4.scribe código para convertir un String que contiene un número a un int.\n" +
                        "5.¿Cuál es el resultado de (int) (char) (byte) -1?\n" +
                        "6.Convierte el número 65 a un char. ¿Qué carácter obtienes?\n" +
                        "7.¿Qué sucede si intentas asignar un long a un int sin casteo explícito?\n" +
                        "8.Escribe código para convertir un float a un String.\n" +
                        "9.¿Cuál es el resultado de (int) Math.round(3.7)?\n" +
                        "10.Dado byte b = 50;, ¿cómo lo convertirías a short?\n");
                opcion2 = scanner.nextInt();
                break;
            default:
        }
    }
}