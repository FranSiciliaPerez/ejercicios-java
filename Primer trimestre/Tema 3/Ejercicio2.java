public class Ejercicio2 {
  public static void main(String[] args) {
    String linea;
    System.out.print("Introduce un número de euros que quieres pasar a pesetas: ");
    linea = System.console().readLine();
    double euros = Double.parseDouble( linea );
    double cambioapesetas = (euros * 1000) / 6;
    System.out.println("El cambio de euros a pesetas es: " + cambioapesetas);
  }
}  
