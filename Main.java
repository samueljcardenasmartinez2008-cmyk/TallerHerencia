import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = -1;

        do {
            System.out.println("\n===== TALLER DE HERENCIA =====");
            System.out.println("1. Registrar estudiante");
            System.out.println("2. Registrar profesor");
            System.out.println("0. Salir");
            System.out.print("Elija una opcion: ");

            try {
                opcion = Integer.parseInt(sc.nextLine());

                switch (opcion) {
                    case 1:
                        registrarEstudiante(sc);
                        break;
                    case 2:
                        registrarProfesor(sc);
                        break;
                    case 0:
                        System.out.println("Hasta luego.");
                        break;
                    default:
                        System.out.println("Opcion no valida.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: debe ingresar un numero valido.");
                opcion = -1;
            }
        } while (opcion != 0);

        sc.close();
    }

    private static void registrarEstudiante(Scanner sc) {
        try {
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();
            System.out.print("Edad: ");
            int edad = Integer.parseInt(sc.nextLine());
            System.out.print("Documento: ");
            String documento = sc.nextLine();
            System.out.print("Programa academico: ");
            String programa = sc.nextLine();
            System.out.print("Promedio: ");
            double promedio = Double.parseDouble(sc.nextLine().replace(',', '.'));

            Estudiante estudiante = new Estudiante(
                nombre, edad, documento, programa, promedio
            );
            System.out.println("\n--- Datos del estudiante ---");
            estudiante.mostrarInfo();
        } catch (NumberFormatException e) {
            System.out.println("Error: la edad y el promedio deben ser numericos.");
        }
    }

    private static void registrarProfesor(Scanner sc) {
        try {
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();
            System.out.print("Edad: ");
            int edad = Integer.parseInt(sc.nextLine());
            System.out.print("Documento: ");
            String documento = sc.nextLine();
            System.out.print("Area academica: ");
            String area = sc.nextLine();
            System.out.print("Salario base por hora: ");
            double salarioBase = Double.parseDouble(sc.nextLine().replace(',', '.'));
            System.out.print("Horas de catedra: ");
            int horas = Integer.parseInt(sc.nextLine());

            Profesor profesor = new Profesor(
                nombre, edad, documento, area, salarioBase, horas
            );
            System.out.println("\n--- Datos del profesor ---");
            profesor.mostrarInfo();
        } catch (NumberFormatException e) {
            System.out.println("Error: ingrese valores numericos validos.");
        }
    }
}
