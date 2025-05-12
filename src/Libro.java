import java.util.Objects;

public class Libro {


    private double numeroPaginas;

    public Libro(String number, String cienAñosDeSoledad, int i, String gabrielGarciaMarquez) {
    }

    public void prestar() {
    }

    public void devolver() {
    }

    public double imprimir(double costeporpagina) {
        return this.numeroPaginas * costeporpagina;
    }


    public class ElLibro {

        private String isbn;
        private String titulo;
        private int numeroPaginas;
        private String autor;
        private boolean prestado;

        public ElLibro() {
            this("", "", 0, "", false);
        }

        public ElLibro(String ISBN, String titulo, int numeroPaginas, String autor, boolean prestado) {
            this.titulo = titulo;
            this.isbn = ISBN;
            this.numeroPaginas = numeroPaginas;
            this.autor = autor;
            this.prestado = prestado;
        }

        public String getISBN() {
            return isbn;
        }

        public void setISBN(String ISBN) {
            this.isbn = ISBN;
        }

        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public int getNumeroPaginas() {
            return numeroPaginas;
        }

        public void setNumeroPaginas(int numeroPaginas) {
            this.numeroPaginas = numeroPaginas;
        }

        public String getAutor() {
            return autor;
        }

        public void setAutor(String autor) {
            this.autor = autor;
        }

        public boolean isPrestado() {
            return prestado;
        }

        public void setPrestado(boolean prestado) {
            this.prestado = prestado;
        }


        public void prestar() {
            if (this.prestado) {
                System.out.println("Este libro ya esta prestado");
            } else {
                this.prestado = true;
                System.out.println("El libro se ha prestado");
            }
        }

        public void devolver() {
            if (!this.prestado) {
                System.out.println("Este libro no esta prestado");
            } else {
                this.prestado = false;
                System.out.println("El libro se ha devuelto");
            }


        }

        public double imprimir(double costePorPagina) {
            return this.numeroPaginas * costePorPagina;
        }


        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) return false;
            ElLibro elLibro = (ElLibro) o;
            return Objects.equals(isbn, elLibro.isbn);
        }

        @Override
        public int hashCode() {
            return Objects.hashCode(isbn);
        }

        @Override
        public String toString() {
            String mensaje = "El libro " + this.isbn + "CON TITULO " + this.titulo + "Y AUTOR " + this.autor + "TIENE " + this.numeroPaginas + "PAGINAS Y ";

            if (!this.prestado) {
                mensaje += " NO ";
            }
            mensaje += " ESTA PRESTADO ";

            return mensaje;
        }
    }
}

