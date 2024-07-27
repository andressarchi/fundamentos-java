import java.util.Scanner;

public class solve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        int opcion2;
        while (opcion != 5) {
                        menus.menuPrincipal();
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    menus.men1();
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
                   menus.men2();

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
                        menus.men3();
                    opcion2 = scanner.nextInt();
                        switch (opcion2){
                            case 1 :
                                int x = 5; int y = ++x;
                                System.out.println("el resultado de y es : "+y+" y el resultado de x es :"+ x +"\n"+"\n");
                                break;
                            case 2 :
                                int a = 5; System.out.println(a++);
                                System.out.println("imprime :"+a+"\n"+"\n");
                                break;
                            case 3 :
                                int count = 2;
                                count -= 1 ;
                                System.out.println("el resultado es :"+count);
                                break;
                            case 4 :
                                System.out.println("\n\n int result = i++;  Primero asigna el valor de i a result, luego incrementa \n" +
                                        " int result = ++i;  Primero incrementa i, luego asigna el valor a result\n\n");
                                break;
                            case 5:
                                int p = 3; p = p++;
                                System.out.println("el resultado de x es : "+p+"\n\n");
                                break;
                        }
                        break;
                case 4 :
                   menus.men4();
                    opcion2 = scanner.nextInt();
                    switch (opcion2){
                        case 1 :
                            int i = 5;
                            i += ++i + i++ + ++i;
                            System.out.println("el resultado es : "+ i+"\n\n");
                            break;
                        case 2 :
                            double d = 7.5;
                            int o = (int) d;
                            o++;
                            System.out.println("el resultado de la operacion: double d = 7.5;\n" +
                                    "                            int o = (int) d;  \n" +
                                    "                            o++; \n es :"+o+"\n\n");
                            break;
                        case 3 :
                            double l = 5.7;
                            int c = (int)l;
                            c *= 2;
                            System.out.println("imprime :\n");
                            System.out.println(c--);
                            break;
                        case 4 :
                            int num = 7;
                            double result = (double) num / 2;
                            result /= 2;
                            System.out.println("el resultado de la operacion: int num = 7;\n" +
                                    "                            double result = (double) num / 2;\n" +
                                    "                            \n es :  "+ result+"\n\n");
                            break;
                        case 5:
                            char cc = 'X';
                            cc += 32;
                            System.out.println("el resultado es :"+cc+"\n\n");
                            break;
                        case 6:
                            long g = 1000L;
                            short s = (short) g;
                            s *= 3;
                            System.out.println("el resultado de la operacion :\n long g = 1000L;\n" +
                                    "                            short s = (short) g;\n" +
                                    "                            s *= 3; \n es : "+s+"\n\n");
                            break;

                        case 7 :
                            int x = 10;
                            x += (x++) + (++x);
                            System.out.println("el valor de x es de : "+x+"\n\n");
                            break;
                        case 8 :
                            float f = 10.9f;
                            byte b = (byte) f;
                            --b;
                            System.out.println("el resultado de la operacion : \n float f = 10.9f;\n" +
                                    "                            byte b = (byte) f;\n" +
                                    "                            --b;    \n es : "+ b +"\n\n");
                            break;
                        case 9 :
                            int y = 257;
                            byte q = (byte)y;
                            System.out.println("el resultado de la operacion es :"+q+"\n\n");
                            break;
                        case 10 :
                            double n = 7.5;
                            int h = (int) n;
                            h += 5;
                            h++;
                            System.out.println("el resultado de la operacion:\ndouble n = 7.5;\n" +
                                    "                            int h = (int) n;  \n" +
                                    "                            h += 5;          \n" +
                                    "                            h++;\n es :  "+h +"\n\n");
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
