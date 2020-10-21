public class Ejercicio10 {
  public static void main(String[] args) {
    String linea;
    System.out.print("Introduce la candidad de Mb que quiere convertir a Kb: ");
    linea = System.console().readLine();
    int mb = Integer.parseInt( linea );
    int kb = (mb * 8000);
    System.out.println("La cantidad añadida a Kb es: " + kb + "Kb");
  }
}

