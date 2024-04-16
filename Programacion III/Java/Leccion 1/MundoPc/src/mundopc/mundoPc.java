package mundopc;
import ar.com.system2023.mundopc.*;


public class mundoPc {
        public static void main(String[] args) {
        
            Monitor monitorHP = new Monitor("HP",13); //importar clases
            Teclado tecladoHP = new Teclado("Bluetooth","HP");
            Raton ratonHP = new Raton("Bluetooth","HP");
            Computadora ComputadoraHP = new Computadora("ComputadoraHP",monitorHP,tecladoHP,ratonHP);
            
            //Creamos otros objetos de distinta marca  
            Monitor monitorGamer = new Monitor("Gamer",32);
            Teclado tecladoGamer = new Teclado("Bluetooth","Gamer");
            Raton ratonGamer = new Raton("Bluetooth","Gamer");
            Computadora ComputadoraGamer = new Computadora("ComputadoraGamer",monitorGamer,tecladoGamer,ratonGamer);
            
            Monitor monitorLenovo = new Monitor("Lenovo ",  27); 
            Teclado tecladoLenovo  = new Teclado("USB", "Lenovo ");
            Raton ratonLenovo  = new Raton("USB", "Lenovo ");
            Computadora computadoraLenovo  = new Computadora( "Computadora Lenovo ", monitorLenovo , tecladoLenovo , ratonLenovo  );
        
            Monitor monitorMac = new Monitor("Mac  ",  32); 
            Teclado tecladoMac    = new Teclado("Bluetooth", "Mac ");
            Raton ratonMac    = new Raton("Bluetooth", "Mac ");
            Computadora computadoraMac    = new Computadora( "Computadora Mac  ", monitorMac   , tecladoMac   , ratonMac    );
        
            Monitor monitorAsus = new Monitor("Asus ",  22); 
            Teclado tecladoAsus    = new Teclado("USB", "Asus ");
            Raton ratonAsus    = new Raton("Bluetooth", "Asus ");
            Computadora computadoraAsus    = new Computadora( "Computadora Asus ", monitorAsus  , tecladoAsus  , ratonAsus  );
        
            Monitor monitorAcer = new Monitor("Acer ",  27); 
            Teclado tecladoAcer    = new Teclado("USB", "Acer");
            Raton ratonAcer    = new Raton("Bluetooth", "Acer");
            Computadora computadoraAcer    = new Computadora( "Computadora Acer", monitorAcer  , tecladoAcer  , ratonAcer  ); 
        
            Monitor monitorDell = new Monitor("Dell ",  35); 
            Teclado tecladoDell    = new Teclado("USB", "Dell");
            Raton ratonDell    = new Raton("Bluetooth", "Dell");
            Computadora computadoraDell    = new Computadora( "Computadora Dell", monitorDell  , tecladoDell  , ratonDell  ); 
        
            Monitor monitorSamsung = new Monitor("Samsung",  35); 
            Teclado tecladoSamsung    = new Teclado("USB", "Samsung");
            Raton ratonSamsung    = new Raton("USB", "Samsung");
            Computadora computadoraSamsung    = new Computadora( "Computadora Samsung", monitorSamsung  , tecladoSamsung  , ratonSamsung  ); 
        
            Monitor monitorPhilips = new Monitor("Philips",  32); 
            Teclado tecladoJalatec    = new Teclado("USB", "Jalatec");
            Raton ratonNoga   = new Raton("USB", "Noga");
            Computadora computadoraVorago    = new Computadora( "Computadora Vorago", monitorPhilips  , tecladoJalatec  , ratonNoga  ); 
        
            Monitor monitorHuawei = new Monitor("Huawei",  29); 
            Teclado tecladoNoga    = new Teclado("Bluetooth", "Noga");
            Raton ratonJalatec   = new Raton("USB", "Jalatec");
            Computadora computadoraHuawei    = new Computadora( "Computadora Huawei", monitorHuawei  , tecladoNoga  , ratonJalatec  ); 
        
          
        
        //Clases de tipo orden 
       
            Orden orden1 = new Orden(); //Con esta linea inicializamos el arreglo pero está vacio porque no le hemos agregado ningun elemento
            Orden orden2 = new Orden();
            Orden orden3 = new Orden();
            Orden orden4 = new Orden();
            Orden orden5 = new Orden();
            Orden orden6 = new Orden();
            Orden orden7 = new Orden();
            Orden orden8 = new Orden();
            Orden orden9 = new Orden();
            Orden orden10 = new Orden();
          
            
            
            Computadora computadorasVarias = new Computadora("Computadoras diferentes marcas",monitorHP,tecladoGamer,ratonHP);
            orden2.agregarComputadora(computadorasVarias);
            
            
          //mostrar ordenes
          
            orden1.agregarComputadora(ComputadoraHP);
            orden2.agregarComputadora(ComputadoraGamer);
            orden3.agregarComputadora(computadoraLenovo);
            orden4.agregarComputadora(computadoraMac);
            orden5.agregarComputadora(computadoraAsus);
            orden6.agregarComputadora(computadoraAcer);
            orden7.agregarComputadora(computadoraDell);
            orden8.agregarComputadora(computadoraSamsung);
            orden9.agregarComputadora(computadoraVorago);
            orden10.agregarComputadora(computadoraHuawei);
          
            orden1.mostrarOrden();
            orden2.mostrarOrden();
            orden3.mostrarOrden();
            orden4.mostrarOrden();
            orden5.mostrarOrden();
            orden6.mostrarOrden();
            orden7.mostrarOrden();
            orden8.mostrarOrden();
            orden9.mostrarOrden();
            orden10.mostrarOrden();
            
            
            
    }
}
