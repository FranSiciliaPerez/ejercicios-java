public class Ejercicio12 {
  public static void main(String[] args) {
    String linea;
    System.out.print("Introduce la nota que sacaste en el primer examen: ");
    linea = System.console().readLine();
    double notaPrimerExamen = Double.parseDouble(linea);
    System.out.print("Introduce la nota media quieres sacar este trimestre en programación: ");
    linea = System.console().readLine();
    double notaDeseada = Double.parseDouble( linea );
    double notaSegundoExamen = (notaDeseada + notaPrimerExamen * 0.4) / 0.6;
    System.out.println("La nota que tendrias que sacar es: " + notaSegundoExamen);
  }
}

