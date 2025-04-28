import java.util.Scanner;

public class CuentaBancariamain {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);


            CuentaBancaria miCuenta = new CuentaBancaria("23456", "Lucas Chalon", 1500);

            System.out.println("El saldo de la cuenta es: "+ miCuenta.consultarSaldo());
            miCuenta.depositar(2500);
            System.out.println("Ingrese el monto que desea retirar: ");

            double montoRetiro = scanner.nextDouble();

            miCuenta.extraer(montoRetiro);
            double saldoActual = miCuenta.consultarSaldo();
            System.out.println("Saldo actual: "+ saldoActual);

            System.out.println("Saldo final: "+ miCuenta.consultarSaldo());

            scanner.close();
        }
    }

