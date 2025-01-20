public class Main {
    public static void main(String[] args) {
        // Lectura de datos numéricos
        byte nivell = Entrada.llegirByte("Introdueix el teu nivell");
        int edat = Entrada.llegirInt("Introdueix la teva edat");
        float alcada = Entrada.llegirFloat("Introdueix la teva alçada en metres");
        double pes = Entrada.llegirDouble("Introdueix el teu pes en quilograms");

        // Lectura de carácter
        try {
            char caracter = Entrada.llegirChar("Introdueix un caràcter");
            System.out.println("Caràcter introduït: " + caracter);
        } catch (Exception e) {
            System.err.println("Error al llegir el caràcter: " + e.getMessage());
        }

        // Lectura de texto
        try {
            String text = Entrada.llegirString("Introdueix un text");
            System.out.println("Text introduït: " + text);
        } catch (Exception e) {
            System.err.println("Error al llegir el text: " + e.getMessage());
        }

        // Lectura de sí/no
        try {
            boolean question = Entrada.llegirSiNo("Vols continuar? Introdueix 's' per sí o 'n' per no");
            System.out.println("Resposta: " + (question ? "Sí" : "No"));
        } catch (FormatInvalidException e) {
            System.err.println("Error: " + e.getMessage());
        }

        // Mensaje final
        System.out.println("Final de l'aplicació. Gràcies per utilitzar-la!");
    }
}
