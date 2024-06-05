import java.util.Scanner;

public class PruebaCuenta {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Cuenta miCuenta = new Cuenta();

        System.out.printf("El nombre incicial es: %s%n%n", miCuenta.obtenerNombre());

        System.out.println("Introduzca el nombre: ");
        String elNombre = entrada.nextLine();

        miCuenta.establecerNombre(elNombre);
        System.out.println();

        System.out.printf("El nombre en el objeto miCuenta es: %n%s%n", miCuenta.obtenerNombre());
    }
}
