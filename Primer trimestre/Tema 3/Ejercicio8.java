public class Ejercicio8 {
  public static void main(String[] args) {
    String linea;
    System.out.print("Introduce el número de horas que trabaja durante la semana: ");
    linea = System.console().readLine();
    double horas = Double.parseDouble(linea);
    double dinerosemanal;
    dinerosemanal = (horas * 12);
    System.out.println("El sueldo corespondiente segun tus hoaras trabajadas a la semana es de: " + dinerosemanal + " euros");
  }
}

