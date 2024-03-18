
import java.lang.System;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.SimpleTimeZone;


public class Main {

    public static void main(String[] args) {


        ej24();

    }

    /*Ejercicio nº1: Calcular el promedio de un arreglo de números enteros. Realizar
    variantes con arreglos ya inicializados e ingreso por teclado.
    */
    public static void ej1() {
        int arr[] = {1, 2, 3, 4, 5};
        Scanner scanner = new Scanner(System.in);

        for (int num : arr) {
            System.out.println(num);
        }
        int sum1 = 0;
        for (int num3 : arr) {
            sum1 = sum1 + num3;
        }
        System.out.println("El promedio original es: " + (float) (sum1 / arr.length));
        for (int num : arr) {
            System.out.println(num);
        }
        System.out.println("ingrese el numero para editar esa posicion");
        int pos = scanner.nextInt();
        System.out.println("Ingrese nuevo numero");
        int nuevoNum = scanner.nextInt();
        arr[pos - 1] = nuevoNum;

        ///Nuevo promedio
        sum1 = 0;
        for (int num4 : arr) {
            sum1 = sum1 + num4;
        }
        for (int num : arr) {
            System.out.println(num);
        }
        System.out.println("El nuevo promedio es: " + (float) (sum1 / arr.length));
        scanner.close();
    }

    /*Ejercicio nº2: Calcular si un número es par o no.
     */

    public static void ej2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = scanner.nextInt();
        if (num % 2 == 0)
            System.out.println("Es par");
        else
            System.out.println("Es impar");

        scanner.close();
    }

    /*Ejercicio nº3: Mostrar los primeros 100 números primos.

     */
    public static void ej3() {

        ///NULL
    }


    /*Ejercicio nº4: Mostrar los primeros n números primos.
Ejercicio nº6: Ingresar un número o tantos como quiera el usuario y revisar si
es primo  */

    //Ejercicio nº7: Encontrar la suma de los primeros 10 números naturales.
    public static void ej7() {
        int suma = 0;
        for (int i = 1; i < 11; i++) {
            suma += i;
        }
        System.out.println("La suma es: " + suma);

    }

    /*    Ejercicio nº8: Sumar (en cantidad, no acumular) cuántos números positivos
        ingresa un usuario.  */
    public static void ej8() {
        String o;
        Scanner scanner = new Scanner(System.in);

        int num;

        int cont = 0;

        do {
            System.out.println("Si desea cargar press any key o tipee \"ESC\" para salir");
            o = scanner.nextLine();
            if (o.equalsIgnoreCase("ESC")) break;
            else {
                System.out.println("Ingrese numero");
                num = scanner.nextInt();
                scanner.nextLine();  /// EQUIVALENTE A FFLUSH(STDIN) EN C
                if (num > 0)
                    cont++;
                else System.out.println("Numero negativo no se contara");
            }
        } while (!o.equalsIgnoreCase("ESC"));
        System.out.println("El numero de ingresos es: " + cont);
        scanner.close();
    }

    /* Ejercicio nº9: Revisar si un año es bisiesto o no. */
    ///Reutilizo pequeña parte de codigo implementado en Laboratorio 2. para TP FINAL.
    public static void ej9() {
        int anio;
        Scanner scanner = new Scanner(System.in);
        boolean verify = false;
        System.out.println("Ingrese un anio para verificar si es bisiesto");
        anio = scanner.nextInt();
        /// Verificar si el año es bisiesto para febrero
        if ((anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0)
            verify = true;

        if (verify) System.out.println("El anio es Bisiesto");
        else System.out.println("El anio no es Bisiesto");
        scanner.close();
    }

    //  Ejercicio nº10: Encontrar el valor ASCII de un carácter.
    public static void ej10() {
        char charr;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un caracter");
        String input = scanner.next();
        charr = input.charAt(0);
        System.out.println("El valor en ASCII es: " + (int) charr);
        scanner.close();
    }

    // Ejercicio nº11: Multiplicar dos números.
    public static void ej11() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese otro numero");
        int num2 = scanner.nextInt();

        System.out.println("La multiplicacion es: " + num1 * num2);
        scanner.close();
    }


    /* Ejercicio nº12: Realizar un programa que le pregunte al usuario que área
    desea calcular. Las opciones son: rectángulo, cuadrado, triangulo y circulo.
    */
    public static void ej12() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Para calcular el area de del Rectangulo presione 1, para area del cuadrado 2, para el triangulo 3 y para el circulo 4");
        int op = scanner.nextInt();
        switch (op) {
            case 1:
                System.out.println("Ingrese base rectangulo");
                int baseRec = scanner.nextInt();
                System.out.println("Ingrese Altura ");
                int altRec = scanner.nextInt();

                System.out.println("El area es: " + baseRec * altRec);
                break;
            case 2:
                System.out.println("Ingrese lado del cuadrado");
                int lado = scanner.nextInt();
                System.out.println("El area del cuadrado es: " + lado * lado);
                break;
            case 3:
                System.out.println("ingrese base del triangulo");
                int baseTriang = scanner.nextInt();
                System.out.println("Ingrese altura del triangulo");
                int altTriang = scanner.nextInt();
                System.out.println("El area del triangulo es: " + (float) ((baseTriang * altTriang) / 2));
                break;
            case 4:
                System.out.println("Ingrese radio");
                float radio = scanner.nextFloat();
                System.out.println("El area de la circunsferencia es: " + String.format("%.2f", Math.PI * (Math.pow(radio, 2)))); ///Math.pow(base, exponente) base elevado al exponente.
                break;                                                              /// String.format("%.2f",numeroFloat); Muestra 2 decimales o se configura como se necesite
            default:
                System.out.println("SELECCION INCORRECTA ");
        }
        scanner.close();
    }

    /* Ejercicio nº13: Programa que lea un nombre y muestre por pantalla:
            “Buenos dias nombre_introducido”. */

    public static void ej13() {
        String message = "Good Morning ";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert your name");
        String name = scanner.next(); ///.Next LEE UN SOLO STRING .NextLine LEE TODA LA LINEA

        System.out.println(message + name);
        scanner.close();
    }

    /*Ejercicio nº14: Escribir un programa que lea un número entero por teclado y
    obtenga y muestre por pantalla el doble y el triple de ese número. */
    public static void ej14() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero para calcular su doble y triple");
        float num = scanner.nextFloat();

        System.out.println("El doble es: " + String.format("%.2f", num * 2) + "\n El triple es: " + String.format("%.2f", num * 3));

        scanner.close();
    }

    /* Ejercicio nº15: Programa que lea una cantidad de grados centígrados y la
     pase a grados Fahrenheit. La fórmula correspondiente para pasar de grados
     centígrados a fahrenheit es: F = 32 + ( 9 * C / 5) */
    public static void ej15() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese temperatura en Celsius para convertir en Fahrenheit");
        float celsius = scanner.nextFloat();

        float F = 32 + (9 * celsius / 5);
        System.out.println("La temperatura " + celsius + "en Fahrenheit es: " + String.format("%.2f", F));
        scanner.close();
    }

    /*Ejercicio nº16: Programa que lea por teclado el valor del radio de una
circunferencia y calcula y muestra por pantalla la longitud y el área de la
circunferencia. Investigar el uso de la librería Math.
Longitud de la circunferencia = 2*PI*Radio, Area de la circunferencia =
PI*Radio^2
     */
    public static void ej16() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese radio de la circunsferencia ");
        float radio = scanner.nextFloat();
        float longitud = (float) (2 * Math.PI * radio);
        float area = (float) (Math.PI * Math.pow(radio, 2));
        System.out.println("La longitud es: " + String.format("%.3f", longitud) + "\n Y el area es: " + String.format("%.3f", area));
        scanner.close();
    }

    /*Ejercicio nº17: Programa que pase una velocidad en Km/h a m/s. La velocidad
    se lee por teclado.
    */
    public static void ej17() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese velocidad en Km/h");
        double vel = scanner.nextDouble();
        double velMs = vel / 3.6;
        System.out.println("La velocidad en m/s es: " + String.format("%.2f", velMs)); /// Se usa f toma como valor a float y a double
    }

    /* Ejercicio nº18: Programa lea la longitud de los catetos de un triángulo
    rectángulo y calcule la longitud de la hipotenusa según el teorema de
    Pitágoras.
      */
    public static void ej18() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese cateto 1");
        double cateto1 = scanner.nextDouble();
        System.out.println("Ingrese cateto 2");
        double cateto2 = scanner.nextDouble();
        double altura = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
        System.out.println("La altura o h es: " + String.format("%.2f", altura));
        scanner.close();
    }

    /*Ejercicio nº19: Programa lea 30 temperaturas correspondientes a un mes y
    calcule el maximo, el minimo y el promedio.*/
    public static void ej19() {
        List<Double> temp = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            temp.add((Math.random() * (33 - 10)) + 10);
        }
        Double minimo = temp.get(0);
        Double maximo = temp.get(0);
        Double suma = (double) 0;
        for (Double num : temp) {
            suma += num;
            if (num < minimo)
                minimo = num;
            if (num > maximo)
                maximo = num;
        }

        for (Double num1 : temp)
            System.out.println(num1);

        System.out.println("El minimo es: " + String.format("%.2f", minimo) + "\n El maximo es: " + String.format("%.2f", maximo) + "\n El promedio es: " + String.format("%.2f", suma / 30));

    }

    /*Ejercicio nº20:Pide por teclado dos números y genera 10 números aleatorios
entre esos números. Usa el método Math.random para generar un número
entero aleatorio
     */
    public static void ej20() {
        Scanner scanner = new Scanner(System.in);
        /// no hace falta almacenar los datos   List<Integer> numList = new ArrayList<>();
        System.out.println("Ingrese un valor minimo entero");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese un valor maximo entero");
        int num2 = scanner.nextInt();
        System.out.println("El minimo es:" + num1 + "\nY el maximo es: " + num2);
        for (int i = 0; i < 10; i++)
            System.out.println(String.format("%.0f", Math.random() * (num2 - num1) + num1));
        scanner.close();
    }

    /* Ejercicio nº21: Crea una aplicación que nos pida un día de la semana y que
     nos diga si es un día laboral o no. Usa un switch para ello.
     */
    public static void ej21() {
        Scanner scanner = new Scanner(System.in);
        String dia;
        System.out.println("ingrese dia de la semana. Lunes, martes, miercoles, jueves, viernes, sabado o domingo");
        dia = scanner.next().toLowerCase();  ///Corroboro que sea todo minuscula pero no se en caso de tener acentos
        switch (dia) {
            case "lunes", "martes", "miercoles", "jueves", "viernes":
                System.out.println("Dia laboral");
                break;
            case "sabado", "domingo":
                System.out.println("Dia no laboral");
                break;
            default:
                System.out.println("Dia no correcto");
                break;
        }
        scanner.close();
    }

    /*Ejercicio nº22: Pide por teclado un número entero positivo (debemos
controlarlo) y muestra el número de cifras que tiene. Por ejemplo: si
introducimos 1250, nos muestre que tiene 4 cifras. Tendremos que controlar
si tiene una o más cifras, al mostrar el mensaje.
     */
    public static void ej22() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        int num = scanner.nextInt();
        String cuantosDigitos = Integer.toString(num);
        System.out.println("El numero " + num + " tiene " + cuantosDigitos.length() + " digitos");
        scanner.close();
    }

    /*Ejercicio nº23: Crea una aplicación llamada CalculadoraPolacaInversaApp,
    nos pedirá 2 operandos (int) y un signo aritmético (String), según este último
    se realizará la operación correspondiente. Al final mostrara el resultado en un
    cuadro de diálogo.
    Los signos aritméticos disponibles son:
    ● +: suma los dos operandos.
    ● -: resta los operandos.
    ● *: multiplica los operandos.
    ● /: divide los operandos, este debe dar un resultado con decimales
    (double)
    ● ^: 1º operando como base y 2º como exponente.
    ● %: módulo, resto de la división entre operando1 y operando2.
     */
    public static void ej23() {  //CalculadoraPolacaInversaApp por cuestiones de organizacion se llama ej23()
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese primer numero");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese Signo de operacion \"+\", \"-\", \"*\", \"/\", \"^\", \"%\" ");
        String opcion = scanner.next();
        System.out.println("Ingrese segundo numero");
        int num2 = scanner.nextInt();

        char signo = opcion.charAt(0);
        float resultado=0;
        boolean cuenta= false;
        switch (signo) {
            case '+':
                resultado=num1+num2;
                cuenta =true;
                break;
            case '-':
                resultado =num1-num2;
                cuenta =true;
                break;
            case '*':
                resultado=num1*num2;
                cuenta =true;
                break;
            case '/':
                resultado = (float)(num1/num2);
                cuenta =true;
                break;
            case '^': /// se hace con AltGr y tecla {[ ^
                resultado =(float)Math.pow(num1,num2);
                cuenta =true;
                break;
            case '%':
                resultado= (float)(num1 % num2);
                cuenta =true;
                break;
            default:
                System.out.println("SYNTAX ERROR");
                break;
        }
        if(cuenta)
            System.out.println("El resultado de "+signo+" entre "+num1+" y "+num2+" es: "+resultado);
        else System.out.println("ERROR EN CALCULAR");

    scanner.close();
    }

    /*Ejercicio nº24: Pide por teclado el nombre, edad y salario y muestra el salario
● Si es menor de 16 no tiene edad para trabajar
● Entre 19 y 50 años el salario es un 5 por ciento más
● Entre 51 y 60 años el salario es un 10 por ciento más
● Si es mayor de 60 el salario es un 15 por ciento más
     */

    public static void ej24(){
Scanner scanner = new Scanner(System.in);
System.out.println("Ingrese nombre");
String nombre = scanner.nextLine();
System.out.println("Ingrese edad");
int edad= scanner.nextInt();
System.out.println("Ingrese salario");
double salario= scanner.nextDouble();
System.out.println("El salario es: "+String.format("%.2f",salario));

if(edad<=16)
    System.out.println("No tiene edad para trabajar");
if(edad>=19 && edad<=50) System.out.println("El salario es un 5% mas "+ ((salario*0.05)+salario));

if(edad>50 && edad<=60) System.out.println("El salario es un 10% mas"+ ((salario*0.1)+salario));

if(edad>60) System.out.println("El salario es un 15% mas "+ ((salario*0.15)+salario));

scanner.close();
    }


///END OF CLASS MAIN
}
