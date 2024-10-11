import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ListadoPersonaApp {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        // Definimos la lista fuera del ciclo while
        List<Persona> personas = new ArrayList<>();
        // Empezamos con el menu
        var salir = false;
        while (!salir) {
            mostrarMenu();
            try {
                salir = ejecutarOperacion(consola, personas);

            } catch (Exception e) {
                System.out.println("Ocurrio un error: " + e.getMessage());
            }
        }
    }

    private static void mostrarMenu() {
        // Mostrar opciones
        System.out.print("""
                *** LISTADO DE PERSONAS APP ***
                1. Agregar
                2. Listar
                3. Salir
                """);
        System.out.print("Proporciona la opcion:");
    }

    private static boolean ejecutarOperacion(Scanner consola, List<Persona> personas) {
        var opcion = Integer.parseInt(consola.nextLine());
        var salir = false;
        // Revisamos la opcion proporcionada
        switch (opcion) {
            case 1 -> {// Agregar persona a la lista
                System.out.print("Proporciona el nombre: ");
                var name = consola.nextLine();
                System.out.print("Proporciona el telefono: ");
                var tel = consola.nextLine();
                System.out.print("Proporcona el email: ");
                var email = consola.nextLine();
                // Crear el objeto Persona
                var persona = new Persona(name, tel, email);
                // Agregamos a la lista
                personas.add(persona);
                System.out.println("La lista tiene: " + personas.size() + "elementos");

            }// fin case 1
            case 2 -> {// Listar Personas
                System.out.println(" Listado de Personas: ");
                // Mejora con metodo de referencia
                personas.forEach(System.out::println);
            }//fin case 2
            case 3 -> {
                System.out.println("Hasta pronto....");
                salir = true;
            }
            default -> System.out.println("Opcion erronea: " + opcion);
        }// fin switch
        return salir;
    }
}