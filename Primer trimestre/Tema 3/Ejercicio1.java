public class Ejercicio1 {
  public static void main(String[] args) {
    String linea;
    System.out.print("Introduce un número: ");
    linea = System.console().readLine();
    double numero1 = Double.parseDouble( linea );
    System.out.print("A continuación introduce otro número: ");
    linea = System.console().readLine();
    double numero2 = Double.parseDouble( linea );
    double multiplicacion = (numero1 * numero2);
    System.out.println("El resultado de multiplicar los dos números es: " + multiplicacion);
  }
}
