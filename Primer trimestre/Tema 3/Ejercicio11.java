public class Ejercicio11 {
  public static void main(String[] args) {
    String linea;
    System.out.print("Introduce la candidad de Kb que quiere convertir a Mb: ");
    linea = System.console().readLine();
    double kb = Double.parseDouble(linea);
    double mb = (kb / 8000);
    System.out.println("La cantidad añadida convertida a Mb es: " + mb + "Mb");
  }
}

