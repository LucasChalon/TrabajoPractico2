public class Biblioteca {
    public static void main(String[] args) {

        Libro libro1 = new Libro("123456789", "Cien años de soledad", 500, "Gabriel Garcia Marquez");

        System.out.println(libro1);

        libro1.prestar();

        System.out.println(libro1);

        libro1.devolver();
        libro1.devolver();

        System.out.println(libro1);

        double costeImpresion = libro1.imprimir(0.05);

        System.out.println("El coste ha sido de: " + costeImpresion + "$");

        Libro libro2 = new Libro("123456789", "200 años de soledad", 500, "Gabriel Garcia Marquez");

        // Aquí hacemos la comparación
        if (libro1.equals(libro2)) {
            System.out.println("Los libros son iguales ");
        } else {
            System.out.println("Los libros no son iguales ");
        }
    }
}
