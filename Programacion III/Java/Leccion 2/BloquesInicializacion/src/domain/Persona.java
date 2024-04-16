package domain;

public class Persona {
    private final int idPersona;
    private static int contadorPersonas;
    
    static{ //bloque de inicializacion estatico
        System.out.println("ejecucion bloque estatico");
        ++Persona.contadorPersonas;        
        //idPersona  = 10 no es estatico por eso lanza error
    }
    //bloque de inicializacion no estatico (contexto dinamico)
    {
        System.out.println("Ejecucion de bloque no estatico");
        this.idPersona = Persona.contadorPersonas++; //incrementamos el atributo
    }
    //los bloques de inicializacion se ejecutan antes del constructor
    
    public Persona(){
        System.out.println("Ejecucion del contructor");
    }
    
    public int getIdPersona(){
        return this.idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }
    
}



