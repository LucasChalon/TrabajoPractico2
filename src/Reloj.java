public class Reloj {

        private int hora;
        private int minuto;
        private int segundo;

        // Método para establecer la hora
        public void establecerHora(int h, int m, int s) {
            if (h >= 0 && h < 24) this.hora = h;
            else this.hora = 0;

            if (m >= 0 && m < 60) this.minuto = m;
            else this.minuto = 0;

            if (s >= 0 && s < 60) this.segundo = s;
            else this.segundo = 0;
        }

        // Método para mostrar la hora en formato HH:MM:SS
        public void mostrarHora() {
            System.out.printf("%02d:%02d:%02d%n", hora, minuto, segundo);
        }

        // Método para avanzar un segundo
        public void avanzarSegundo() {
            segundo++;
            if (segundo == 60) {
                segundo = 0;
                minuto++;
                if (minuto == 60) {
                    minuto = 0;
                    hora++;
                    if (hora == 24) {
                        hora = 0;
                    }
                }
            }
        }

        public static void main(String[] args) {
            Reloj miReloj = new Reloj();
            miReloj.establecerHora(13, 45, 30);
            miReloj.mostrarHora();
        }
}


