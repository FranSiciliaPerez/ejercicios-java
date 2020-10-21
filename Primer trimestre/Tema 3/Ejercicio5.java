public class Ejercicio5 {
  public static void main(String[] args) {
    String linea;
    System.out.print("Introduce un lado del cuadrado: ");
    linea = System.console().readLine();
    int lado1;
    lado1 = Integer.parseInt( linea );
    System.out.print("Introduce el otro lado del cuadrado: ");
    linea = System.console().readLine();
    int lado2;
    lado2 = Integer.parseInt( linea );
    int area;
    area = (lado1 * lado2);
    System.out.println("El área de tu cuadrado es: " + area);
  }
}

