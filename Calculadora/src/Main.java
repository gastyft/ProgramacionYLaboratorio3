import java.util.Scanner;


public class Main {
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        seleccion();
    }


    public static void seleccion(){
       String o ; int op;
        int num1 ;
        int num2 ;


        do{

            System.out.println("Si desea continuar presione cualquier tecla. Si desea salir TIPEE \"ESC\" ");
              o = scanner.nextLine();
            if(o.equalsIgnoreCase("ESC")) break;

            System.out.println("Ingrese un numero");

            num1 =scanner.nextInt();
            System.out.println("Ingrese otro numero");
            num2 = scanner.nextInt();
                System.out.println("Ingrese opcion 1 suma, 2 resta, 3 multiplicacion o 4 division");
                op=scanner.nextInt();

        switch(op) {
            case 1:
                System.out.println( num1 + num2);
                break;
            case 2:
                System.out.println(num1-num2);
                break;
            case 3:
                System.out.println(num1*num2);
                break;
            case 4:
                System.out.println((float)num1/num2);
                break;
            default: System.out.println("Opcion incorrecta");


        }
            scanner.nextLine();
        }while(true);
System.out.println("EXITTTTT");
    }
}
