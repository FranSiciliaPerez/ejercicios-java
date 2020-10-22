public class Ejercicio4 {
  public static void main(String[] args) {
    String linea;
    System.out.print("Introduce un número: ");
    linea = System.console().readLine();
    double numero1 = Double.parseDouble(linea);
    System.out.print("A continuación introduce otro número: ");
    linea = System.console().readLine();
    double numero2 = Double.parseDouble(linea);
    double suma = (numero1 + numero2);
    double resta = (numero1 - numero2);
    double multiplicacion = (numero1 * numero2);
    double division = (numero1 / numero2);
    System.out.println("El resultado de sumar los dos números es: " + suma);
    System.out.println("El resultado de restar los dos números es: " + resta);
    System.out.println("El resultado de multiplicar los dos números es: " + multiplicacion);
    System.out.println("El resultado de dividir los dos números es: " + division);
  }
}
