import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                System.out.print("Ingresa el primer número: ");
                double num1 = scanner.nextDouble();
                System.out.print("Ingresa el segundo número: ");
                double num2 = scanner.nextDouble();
                double suma = num1 + num2;
                double resta = num1 - num2;
                double multiplicacion = num1 * num2;
                Double division = null;
                if (num2 != (double)0.0F) {
                    division = num1 / num2;
                }

                System.out.println("\nResultados:");
                System.out.println("Suma: " + suma);
                System.out.println("Resta: " + resta);
                System.out.println("Multiplicación: " + multiplicacion);
                if (division != null) {
                    System.out.println("División: " + division);
                } else {
                    System.out.println("División: Error (no se puede dividir entre cero)");
                }

            }
        }