public class Ejercicio9 {
  public static void main(String[] args) {
    String linea;
    System.out.print("Introduce el radio del cono: ");
    linea = System.console().readLine();
    int radio = Integer.parseInt( linea );
    System.out.print("A continuación introduce la altura del cono: ");
    linea = System.console().readLine();
    int altura = Integer.parseInt( linea );
    double vcono = (1.046 * radio * radio) * altura);
    System.out.println("El resultado de multiplicar los dos números es: " + vcono);
  }
}

