public class Ejercicio9 {
  public static void main(String[] args) {
    String linea;
    System.out.print("Introduce el radio del cono: ");
    linea = System.console().readLine();
    double radio = Double.parseDouble(linea);
    System.out.print("A continuación introduce la altura del cono: ");
    linea = System.console().readLine();
    double altura = Double.parseDouble(linea);
    double vcono = (1.046 * radio * radio) * altura);
    System.out.println("El resultado de multiplicar los dos números es: " + vcono);
  }
}

