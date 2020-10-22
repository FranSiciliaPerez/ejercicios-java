public class Ejercicio6 {
  public static void main(String[] args) {
    String linea;
    System.out.print("Introduce la base del triangulo en metros: ");
    linea = System.console().readLine();
    int base;
    base = Integer.parseInt(linea);
    System.out.print("Introduce la altura del triangulo en metros: ");
    linea = System.console().readLine();
    int altura;
    altura = Integer.parseInt(linea);
    int area;
    area = (base * altura) / 2;
    System.out.println("El área de tu triangulo es: " + area + " m2");
  }
}


