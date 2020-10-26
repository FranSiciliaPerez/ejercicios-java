public class Ejercicio3 {
  public static void main(String[] args) {
    System.out.print("Escribe un numero del 1 al 7: ");
    String respuesta = System.console().readLine();
    if (respuesta.equals("1")) {
      System.out.println("Lunes");
      } else {
        if (respuesta.equals("2")) {
          System.out.println("Martes");
          } else {
            if (respuesta.equals("3")) {
              System.out.println("Miercoles");
              } else {
                if (respuesta.equals("4")) {
                  System.out.println("Jueves");
                  } else {
                        if (respuesta.equals("5")) {
                          System.out.println("Viernes");
                          }  else { 
                                if (respuesta.equals("6")) {
                                  System.out.println("Sábado");
                                  } else { 
                                      if (respuesta.equals("7")) {
                                        System.out.println("Domingo");
                                        }     
                                }                    
                        }
                  }
            }
        }
        
    }  
  }
}
