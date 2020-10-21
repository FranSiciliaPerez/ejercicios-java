public class Ejercicio12 {
  public static void main(String[] args) {
    String linea;
    System.out.print("Introduce la nota que sacaste en el primer examen: ");
    linea = System.console().readLine();
    int a = Integer.parseInt( linea );
    System.out.print("Introduce la nota media quieres sacar este trimestre en programación: ");
    linea = System.console().readLine();
    int b = Integer.parseInt( linea );
    int ma = (a * 0,6);
    int mb = (b * 2) - ma;
    System.out.println("La nota que tendrias que sacar es: " + mb);
  }
}

