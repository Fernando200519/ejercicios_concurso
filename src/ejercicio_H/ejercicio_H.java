package ejercicio_H;

import java.util.Scanner;

public class ejercicio_H {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de casos de prueba: ");
        int T = entrada.nextInt();

        String[] casos = new String[T];

        //Limpiar buffer 
        entrada.nextLine();

        for(int i = 0; i < T; i++){
            System.out.print("Ingrese el caso "+(i+1)+": ");
            casos[i] = entrada.nextLine();
        }

        for(int i = 0; i < T; i++){
            System.out.println(casos[i]);
        }












        entrada.close();
    }







}
