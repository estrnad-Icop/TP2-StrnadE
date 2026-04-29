package resolStrnadE;

import java.util.Scanner;

public class Ejercicio9 {

    static void ejecutar(){
   Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un monto:");
        int monto = sc.nextInt();

        int b20000 = monto / 20000;
        monto = monto % 20000;

        int b10000 = monto / 10000;
        monto = monto % 10000;

        int b1000 = monto / 1000;
        monto = monto % 1000;

        int b500 = monto / 500;
        monto = monto % 500;

        int b200 = monto / 200;
        monto = monto % 200;

        int b100 = monto / 100;
        monto = monto % 100;

        int b50 = monto / 50;
        monto = monto % 50;

        int b20 = monto / 20;
        monto = monto % 20;

        int b10 = monto / 10;
        monto = monto % 10;

        System.out.println("Billetes:");
        System.out.println("20000: " + b20000);
        System.out.println("10000: " + b10000);
        System.out.println("1000: " + b1000);
        System.out.println("500: " + b500);
        System.out.println("200: " + b200);
        System.out.println("100: " + b100);
        System.out.println("50: " + b50);
        System.out.println("20: " + b20);
        System.out.println("10: " + b10);

        sc.close();
    }


}


