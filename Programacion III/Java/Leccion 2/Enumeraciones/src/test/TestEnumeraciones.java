package test;
import enumeraciones.Continentes;
import enumeraciones.Dias;


public class TestEnumeraciones {
    public static void main(String[] args) {
//       System.out.println("Dia 1: "+Dias.LUNES);
//       indicarDiaSemana(Dias.JUEVES); #las enumeraciones se tratan como cadena
//      ahora no se debe utilizar comillas, se accede a traves del operador punto
        
        System.out.println("Contenente No. 1: "+Continentes.AFRICA);
        System.out.println("No. de paises en el 1er continente: "+Continentes.AFRICA.getPaises());
        System.out.println("No. de habitantes en el 1er continente: "+Continentes.AFRICA.getHabitantes());
        
        System.out.println("Contenente No. 2: "+Continentes.EUROPA);
        System.out.println("No. de paises en el 2do continente: "+Continentes.EUROPA.getPaises());
        System.out.println("No. de habitantes en el 2do continente: "+Continentes.EUROPA.getHabitantes());
        
        System.out.println("Contenente No. 3: "+Continentes.ASIA);
        System.out.println("No. de paises en el 3er continente: "+Continentes.ASIA.getPaises());
        System.out.println("No. de habitantes en el 3er continente: "+Continentes.ASIA.getHabitantes());
        
        System.out.println("Contenente No. 4: "+Continentes.AMERICA);
        System.out.println("No. de paises en el 4to continente: "+Continentes.AMERICA.getPaises());
        System.out.println("No. de habitantes en el 4to continente: "+Continentes.AMERICA.getHabitantes());
        
        System.out.println("Contenente No. 5: "+Continentes.OCEANIA);
        System.out.println("No. de paises en el 5to continente: "+Continentes.OCEANIA.getPaises());
        System.out.println("No. de habitantes en el 5to continente: "+Continentes.OCEANIA.getHabitantes());
    }
    
    private static void indicarDiaSemana(Dias dias){
        switch(dias){
                case LUNES -> System.out.println("Primer dia de la semana");
                
                case MARTES -> System.out.println("Segundo dia de la semana");
            
                case MIERCOLES -> System.out.println("Tercer dia de la semana");  
                    
                case JUEVES -> System.out.println("Cuarto dia de la semana");
                    
                case VIERNES -> System.out.println("Quinto dia de la semana");
                    
                case SABADO -> System.out.println("Sexto dia de la semana");
                    
                case DOMINGO -> System.out.println("Septimo dia de la semana");
                
                default -> System.out.println("La opcion no corresponde");
                    
        }
    }
    
}
