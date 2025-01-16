import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Libro");
        System.out.print("Ingrese el título del libro: ");
        String titulo = scanner.nextLine();

        System.out.print("Ingrese el autor del libro: ");
        String autor = scanner.nextLine();

        System.out.print("Ingrese el precio del libro: $");
        double precio = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Seleccione el tipo de libro:");
        System.out.println("1. Libro de texto");
        System.out.println("2. Libro de texto UNAL");
        System.out.println("3. Novela");
        int opcion = scanner.nextInt();
        scanner.nextLine();

        switch (opcion) {
            case 1:
                System.out.print("Ingrese el curso asociado al libro: ");
                String curso = scanner.nextLine();
                LibrosTexto libroTexto = new LibrosTexto(titulo, autor, precio, curso);
                System.out.println("\nInformación del Libro de Texto:");
                libroTexto.imprimir();
                break;

            case 2:
                System.out.print("Ingrese el curso asociado al libro: ");
                curso = scanner.nextLine();
                System.out.print("Ingrese la facultad que publicó el libro: ");
                String facultad = scanner.nextLine();
                LibrosUnal libroUnal = new LibrosUnal(titulo, autor, precio, curso, facultad);
                System.out.println("\nInformación del Libro de Texto UNAL:");
                libroUnal.imprimir();
                break;

            case 3:
                System.out.print("Ingrese el género de la novela: ");
                String tipo = scanner.nextLine();
                Novelas novela = new Novelas(titulo, autor, precio, tipo);
                System.out.println("\nInformación de la Novela: ");
                novela.imprimir();
                break;

            default:
                System.out.println("Opción no válida.");
        }

        scanner.close();
    }
}
