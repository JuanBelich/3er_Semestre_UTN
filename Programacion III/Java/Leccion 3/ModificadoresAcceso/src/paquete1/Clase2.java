
package paquete1;

//la ausencia de modificador indica que es clase default o package
class Clase2 extends Clase1{
    String atributoDefault = "Valor atributo Default";
    
//    Clase2(){
//        System.out.println("Constructor Default");
//    }
    
    public Clase2(){
        super();
        this.atributoDefault = "Modificacion atributo default";
        System.out.println("atributoDefault = " + this.atributoDefault);
        this.metodoDefault();
    }
    
    void metodoDefault(){
        System.out.println("Metodo Default");
    }    
}
