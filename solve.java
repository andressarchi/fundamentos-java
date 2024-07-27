import java.util.Scanner;

public class solve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        int opcion2;
        while (opcion != 5) {
            System.out.println("¿Qué quieres hacer? \n" +
                    "1. Casteo\n" +
                    "2. Operadores de Asignación\n" +
                    "3. Operadores de incremento\n" +
                    "4. Ejercicio combinados \n" +
                    "5. Salir");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("¿Qué quieres hacer? \n" +
                            "1. ¿Cuál será el resultado de la siguiente operación?\n" +
                            "2. Dado char c = 'A';, ¿cómo convertirías c a su valor ASCII como un int?\n" +
                            "3. ¿Qué valor se imprimirá?\ndouble d = 100.04;\n" +
                            "long l = (long)d;\n" +
                            "int i = (int)l;\n" +
                            "System.out.println(i);\n" +
                            "4. Escribe código para convertir un String que contiene un número a un int.\n" +
                            "5. ¿Cuál es el resultado de (int) (char) (byte) -1?\n" +
                            "6. Convierte el número 65 a un char. ¿Qué carácter obtienes?\n" +
                            "7. ¿Qué sucede si intentas asignar un long a un int sin casteo explícito?\n" +
                            "8. Escribe código para convertir un float a un String.\n" +
                            "9. ¿Cuál es el resultado de (int) Math.round(3.7)?\n" +
                            "10. Dado byte b = 50;, ¿cómo lo convertirías a short?\n");
                     opcion2 = scanner.nextInt();
                    switch (opcion2) {
                        case 1:
                            double d = 100.04;
                            long l = (long) d;
                            int i = (int) l;
                            System.out.println("El resultado de la operación es: " + i+"\n"+"\n");
                            break;
                        case 2:
                            char c = 'A';
                            int ascii = (int) c;
                            System.out.println("El valor ASCII es: " + ascii+"\n"+"\n");
                            break;
                        case 3:
                            double b = 100.04;
                            long m = (long) b;
                            int n = (int) m;
                            System.out.println("El resultado es: " + n+"\n"+"\n");
                            break;
                        case 4:
                            System.out.println("Introduce un número como String:");
                            String numberString = scanner.next();
                            int number = Integer.parseInt(numberString);
                            System.out.println("El número convertido es: " + number +"\n"+"\n");
                            break;
                        case 5:
                            int resultado = (int) (char) (byte) -1;
                            System.out.println("El resultado es: " + resultado +"\n"+"\n");
                            break;
                        case 6:
                            int num = 65;
                            char character = (char) num;
                            System.out.println("El carácter es: " + character+"\n"+"\n");
                            break;
                        case 7:
                            long lo = 1232;
                            int in = (int) lo; // Se requiere casteo explícito
                            System.out.println("El resultado es: " + in+"\n"+"\n");
                            break;
                        case 8:
                            float flotante = 3.6f;
                            String cadena = String.valueOf(flotante); // Convertir float a String
                            System.out.println("El String es: " + cadena+"\n"+"\n");
                            break;
                        case 9 :
                            int result = (int) Math.round(3.7);
                            System.out.println("el resultado es" + result+"\n"+"\n");
                            break;
                        case 10 :
                            byte v = 50;
                            short s =(short) v;
                            System.out.println("el resultado de la covercion es "+ s +"\n"+"\n");
                            break;
                        default:
                            System.out.println("Opción no válida\n"+"\n");
                            break;
                    }
                    break;
                case 2 :
                    System.out.print("1.¿Cuál es el valor de x después de la siguiente operación?\n" +
                            "int x = 10; x += 5;\n" +
                            "2.Simplifica la siguiente expresión usando un operador de asignación compuesta:\n" +
                            "y = y * (x + 5);\n" +
                            "3.¿Cuál es el valor de a después de estas operaciones?\n" +
                            "int a = 15; a %= 4;\n" +
                            "4.Escribe una expresión equivalente a x = x + y usando un operador de asignación compuesta.\n" +
                            "5.¿Qué hace la siguiente operación? x ^= 2;");

                    opcion2 = scanner.nextInt();
                    switch (opcion2){
                        case 1 :
                            int x = 10;
                            x += 5;
                            System.out.print("el resutaltado de la operacion es "+x +"\n"+"\n");
                            break;
                        case 2 :
                            System.out.println(" la expresion simplificada es \ny *= (x + 5);\n"+"\n");
                            break;
                        case 3:
                            int a = 15; a %= 4;
                            System.out.println("el valor de la operacion es "+ a+"\n"+"\n" );
                            break;
                        case 4 :
                            System.out.println("la expresion correcta seria \nx += y;\n"+"\n");
                            break;
                        case 5 :
                            int z = 3;
                            z ^= 2;
                            System.out.println("el valor de x es de \n"+z+"\n"+"\n" );
                            break;
                    }
                case 3:
                        System.out.print("1. ¿Cuál es el valor de `x` e `y` después de estas operaciones?\n" +
                                "`int x = 5; int y = ++x;`\n" +
                                "2. ¿Qué se imprimirá en la consola?\n" +
                                "`int a = 5; System.out.println(a++); System.out.println(a);`\n" +
                                "3. Escribe código que use el operador de decremento para disminuir una variable `count` en 1.\n" +
                                "4. ¿Cuál es la diferencia entre `++i` y `i++`?\n" +
                                "5. ¿Qué valor tendrá `x` después de esta operación?\n" +
                                "`int x = 3; x = x++;`" );
                    opcion2 = scanner.nextInt();
                        switch (opcion2){
                            case 1 :
                                break;
                        }

                    break;
                default:
                    System.out.println("Opción no válida o funcionalidad aún no implementada.\n"+"\n");
                    break;
            }
        }
        scanner.close();
    }
}
