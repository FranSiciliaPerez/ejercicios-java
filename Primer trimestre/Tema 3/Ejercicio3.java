public class Ejercicio3 {
  public static void main(String[] args) {
    String linea;
    System.out.print("Introduce un número: ");
    linea = System.console().readLine();
    int pesetas;
    pesetas = Integer.parseInt( linea );
    double cambioAEuro;
    cambioAEuro = (pesetas * 6) / 1000;
    System.out.println("El cambio de pesetas a euros es: " + cambioAEuro);
  }
}  

