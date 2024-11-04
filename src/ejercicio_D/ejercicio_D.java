package ejercicio_D;
import java.util.Scanner;
import java.util.Arrays;

public class ejercicio_D {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] palos = new int[4];

        System.out.print("Ingrese el palo A: ");
        palos[0] = entrada.nextInt();

        System.out.print("Ingrese el palo B: ");
        palos[1] = entrada.nextInt();

        System.out.print("Ingrese el palo C: ");
        palos[2] = entrada.nextInt();

        System.out.print("Ingrese el palo D: ");
        palos[3] = entrada.nextInt();

        Arrays.sort(palos);

        if((palos[0] == palos[1]) && (palos[2] == palos[3])){
            System.out.println("SI");
        }else{
            System.out.println("NO");
        }

        entrada.close();
    }

}
