public class Ejercicio1 {
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
    int multiplicacion;
    multiplicacion = (numero1 * numero2);
    System.out.println("El resultado de multiplicar los dos números es: " + multiplicacion);
  
  }
}
