public class Ejercicio1 {
  public static void main(String[] args) {
    System.out.print("Escribe un dia de la semana para saber que asignatura toca ese dia a primera hora: ");
    String respuesta = System.console().readLine();
    if (respuesta.equals("Lunes")) {
      System.out.println("Toca Entornos de Desarrolo");
      } else {
        if (respuesta.equals("Martes")) {
          System.out.println("Toca Programacion");
          } else {
            if (respuesta.equals("Miercoles")) {
              System.out.println("Toca Programación");
              } else {
                if (respuesta.equals("jueves")) {
                  System.out.println("Toca Programación");
                  } else {
                        if (respuesta.equals("Viernes")) {
                          System.out.println("Toca Formación y Orientación Laboral");
                          }  else {System.out.println("Lo siento, ese dia no hay clases");}
                        }
                }
            }
        }
        
    }  
  }
