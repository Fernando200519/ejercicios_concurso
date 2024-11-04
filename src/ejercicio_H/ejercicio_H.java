package ejercicio_H;

import java.util.Scanner;

public class ejercicio_H {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int T = entrada.nextInt();
        entrada.nextLine();  // Limpiar el salto de línea

        for (int t = 0; t < T; t++) {
            String S = entrada.nextLine();
            int N = S.length();

            int R = 0;
            int B = 0;

            int resultado = -1;

            // Probar cada posible punto de corte
            for (int corte = 0; corte < N; corte++) {
                // Actualizar conteos de colores según el corte
                if (corte > 0) {
                    char carta = S.charAt(corte - 1);
                    if (carta == 'R') {
                        R++;
                    } else {
                        B++;
                    }
                }

                // Comprobar si al voltear las cartas hay más rojas que azules
                boolean aliceGana = false;

                // Contadores para la parte restante de la baraja
                int rojasRestantes = 0;
                int azulesRestantes = 0;

                // Contar cartas restantes después del corte
                for (int i = 0; i < N; i++) {
                    char carta = S.charAt((i + corte) % N);
                    if (carta == 'R') {
                        rojasRestantes++;
                    } else {
                        azulesRestantes++;
                    }

                    // Si en cualquier momento hay más rojas, Alice gana
                    if (rojasRestantes > azulesRestantes) {
                        aliceGana = true;
                        break;
                    }
                }

                // Si Bob puede ganar, actualiza el resultado
                if (!aliceGana) {
                    resultado = corte;
                    break; // Encontramos el corte más pequeño
                }
            }

            // Imprimir el resultado para el caso de prueba actual
            System.out.println(resultado);
        }

        entrada.close();
    }
}