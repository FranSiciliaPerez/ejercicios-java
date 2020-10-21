public class Ejercicio4 {
  public static void main(String[] args) {
    String linea;
    System.out.print("Introduce un número: ");
    linea = System.console().readLine();
    int numero1;
    numero1 = Integer.parseInt( linea );
    System.out.print("A continuación introduce otro número: ");
    linea = System.console().readLine();
    int numero2;
    numero2 = Integer.parseInt( linea );
    int suma = (numero1 + numero2);
    int resta = (numero1 - numero2);
    int multiplicacion = (numero1 * numero2);
    int division = (numero1 / numero2);
    System.out.println("El resultado de sumar los dos números es: " + suma);
    System.out.println("El resultado de restar los dos números es: " + resta);
    System.out.println("El resultado de multiplicar los dos números es: " + multiplicacion);
    System.out.println("El resultado de dividir los dos números es: " + division);
  }
}
