public class Ejercicio2 {
  public static void main(String[] args) {
    System.out.print("Introduce la hora actual: ");
    String linea = System.console().readLine();
    int n = Integer.parseInt( linea );
    if ((n < 6) || (n > 12)) {
      System.out.println("Buenos dias");
      } else {
        if ((n < 12) || (n > 21)) {
          System.out.println("Buenas tardes");
          } else {
            if ((n < 21) || (n > 6)) {
              System.out.println("Buenas noches");
            }
        } 
    }
  }
}
