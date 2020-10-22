public class Ejercicio3 {
  public static void main(String[] args) {
    String linea;
    System.out.print("Introduce la cantidad de pesetas que quieres convertir a euros: ");
    linea = System.console().readLine();
    double pesetas = Double.parseDouble(linea);
    double cambioAEuro = (pesetas * 6) / 1000;
    System.out.println("El cambio de pesetas a euros es: " + cambioAEuro + "euros");
  }
}  

