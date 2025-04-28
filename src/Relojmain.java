public class Relojmain {
            public static void main(String[] args) {
            Reloj miReloj = new Reloj();
            miReloj.establecerHora(10, 30, 59);
            miReloj.mostrarHora(); // Muestra: 10:30:59

            miReloj.avanzarSegundo();
            miReloj.mostrarHora(); // Muestra: 10:31:00
        }
    }
