package resolStrnadE;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("\n===== MENU EJERCICIOS =====");
            System.out.println("1. Ejercicio 1");
            System.out.println("2. Ejercicio 2");
            System.out.println("3. Ejercicio 3");
            System.out.println("4. Ejercicio 4");
            System.out.println("5. Ejercicio 5");
            System.out.println("6. Ejercicio 6");
            System.out.println("7. Ejercicio 7");
            System.out.println("8. Ejercicio 8");
            System.out.println("9. Ejercicio 9");
            System.out.println("10. Ejercicio 10");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    Ejercicio1.ejecutar();
                    break;

                case 2:
                    Ejercicio2.ejecutar();
                    break;

                case 3:
                    Ejercicio3.ejecutar();
                    break;

                case 4:
                    Ejercicio4.ejecutar();
                    break;
                
                case 5:
                    Ejercicio5.ejecutar();
                    break;
                case 6:
                    Ejercicio6.ejecutar();
                    break;

                case 7:
                    Ejercicio7.ejecutar();
                    break;

                case 8:
                    Ejercicio8.ejecutar();
                    break;

                case 9:
                    Ejercicio9.ejecutar();
                    break;

                case 10:
                    Ejercicio10.ejecutar();
                    break;
                    
                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opcion invalida");
                    break;
            }

        } while (opcion != 0);

        sc.close();
    }
}