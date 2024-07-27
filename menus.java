import java.util.Scanner;

public class menus {
    public static void menuPrincipal() {
        System.out.println("¿Qué quieres hacer? \n" +
                "1. Casteo\n" +
                "2. Operadores de Asignación\n" +
                "3. Operadores de incremento\n" +
                "4. Ejercicio combinados \n" +
                "5. Salir'\n\n");
    }

    public static void men1() {
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
                "10. Dado byte b = 50;, ¿cómo lo convertirías a short?\n\n");
    }

    public static void men2() {
        System.out.print("1.¿Cuál es el valor de x después de la siguiente operación?\n" +
                "int x = 10; x += 5;\n" +
                "2.Simplifica la siguiente expresión usando un operador de asignación compuesta:\n" +
                "y = y * (x + 5);\n" +
                "3.¿Cuál es el valor de a después de estas operaciones?\n" +
                "int a = 15; a %= 4;\n" +
                "4.Escribe una expresión equivalente a x = x + y usando un operador de asignación compuesta.\n" +
                "5.¿Qué hace la siguiente operación? x ^= 2;\n\n");
    }

    public static void men3() {
        System.out.print("1. ¿Cuál es el valor de `x` e `y` después de estas operaciones?\n" +
                "`int x = 5; int y = ++x;`\n" +
                "2. ¿Qué se imprimirá en la consola?\n" +
                "`int a = 5; System.out.println(a++); System.out.println(a);`\n" +
                "3. Escribe código que use el operador de decremento para disminuir una variable `count` en 1.\n" +
                "4. ¿Cuál es la diferencia entre `++i` y `i++`?\n" +
                "5. ¿Qué valor tendrá `x` después de esta operación?\n" +
                "`int x = 3; x = x++;`\n\n");
    }
    public  static void men4(){
        System.out.println("1. ¿Cuál es el resultado de la siguiente expresión?\n" +
                "    int i = 5;\n" +
                "    i += ++i + i++ + ++i;\n" +
                "    ```\n" +
                "    \n" +
                "2. Escribe código para convertir un `double` a un `int`" +
                ", y luego incrementa el resultado en 1 usando el operador de postincremento.\n" +
                "3. ¿Qué se imprimirá en la consola?\n" +
                "    double d = 5.7; \n" +
                "    int i = (int)d; \n" +
                "    i *= 2; \n" +
                "    System.out.println(i--);\n" +
                "    ```\n" +
                "    \n" +
                "4. Crea una expresión que use casteo y un operador de asignación " +
                "compuesta para dividir un `int` por 2.0 y asignar el resultado a una variable `double`.\n" +
                "5. ¿Cuál es el resultado de la siguiente operación?\n" +

                "    char c = 'X'; \n" +
                "    c += 32; \n" +
                "    System.out.println(c);\n" +
                "    ```\n" +
                "    \n" +
                "6. Escribe código para convertir un `long` a un `short`, y luego usa un " +
                "operador de asignación compuesta para multiplicarlo por 3.\n" +
                "7. ¿Qué valor tendrá `x` después de estas operaciones?\n" +
                "    int x = 10; \n" +
                "    x += (x++) + (++x);\n" +
                "    ```\n" +
                "    \n" +
                "8. Crea una expresión que use casteo para convertir un `float` a un `byte`," +
                " y luego usa el operador de predecremento.\n" +
                "9. ¿Cuál es el resultado de la siguiente operación?\n" +

                "    int i = 257; \n" +
                "    byte b = (byte)i; \n" +
                "    System.out.println(b);\n" +
                "    ```\n" +
                "    \n" +
                "10. Escribe una expresión que combine casteo, un operador de asignación compuesta" +
                " y un operador de incremento para convertir un `double` a un `int`" +
                ", sumarle 5 y luego incrementarlo en 1.\n\n");
    }
}