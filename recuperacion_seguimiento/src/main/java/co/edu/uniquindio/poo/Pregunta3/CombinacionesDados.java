package co.edu.uniquindio.poo.Pregunta3;

public class CombinacionesDados {
    public static void generarCombinaciones(int n, int[] combinacion, int nivel, int valorDado) {
        if (nivel == n) {
            mostrarCombinacion(combinacion, 0);
            return;
        }

        if (valorDado > 6){
            return;
        }

        combinacion[nivel] = valorDado;
        generarCombinaciones(n, combinacion, nivel + 1, 1);

        generarCombinaciones(n, combinacion, nivel, valorDado + 1);
    }

    private static void mostrarCombinacion(int[] combinacion, int index) {
        if (index == combinacion.length) {
            System.out.println();
            return;
        }
        System.out.print(combinacion[index] + " ");
        mostrarCombinacion(combinacion, index + 1);
    }

    public static void main(String[] args) {
        int n = 5; 
        int[] combinacion = new int[n];

        System.out.println("Combinaciones posibles con " + n + " dados:");
        generarCombinaciones(n, combinacion, 0, 1);
    }
}
