/* Diseñe e implemente un algoritmo, que le permita crear una superclase llamada 
   EmisionContaminante, que almacena la cantidad y la validación de las emisiones 
   contaminantes que expulsa el motor de combustión interna y las subclases denominadas; 
   Hidrocarburo y MonoxidoCarbono.
 */
package emision;
/**
 * @author Quishpe Urrutia Job Nicolas
 */
class EmisionContaminante{
    double cantidad_emision;
    double validacion_emision;
    
    void MostrarCaracteristicasEmision(){
        System.out.println(" La cantidad de emisión es:" +cantidad_emision+ "%");
        System.out.println(" La cantidad de emisión para validar es:" +validacion_emision+ "%");
    }
}
    
        // Herencia simple: una subclase de de EmisionContaminante es: Hidrocarburo
        class Hidrocarburo extends EmisionContaminante{
            String tipo;
            
            double CalcularEmision(){
                return cantidad_emision + validacion_emision;
            }
            void MostrarTipo(){
                System.out.println("El tipo de emisión contaminante es: "+tipo);
            }
        }
                
        // Herencia simple: una subclase de de EmisionContaminante es: Hidrocarburo
        class MonoxidoCarbono extends EmisionContaminante{
            String tipo;
            
            double CalcularEmision(){
                return cantidad_emision + validacion_emision;
            }
            void MostrarTipo(){
                System.out.println("El tipo de emisión contaminante es: "+tipo);
            }
        }

public class Emision {
    
    public static void main(String[] args) {
        
        Hidrocarburo hidrocarburo=new Hidrocarburo();
        MonoxidoCarbono monoxidocarbono=new MonoxidoCarbono();
        
        hidrocarburo.cantidad_emision=36;
        hidrocarburo.validacion_emision=24;
        hidrocarburo.tipo="Hidrocarburo";
        
        monoxidocarbono.cantidad_emision=42.9;
        monoxidocarbono.validacion_emision=22;
        monoxidocarbono.tipo="Monóxido de Carbono";
        
        System.out.println("                                Universidad de las Fuerzas Armadas ESPE ");
        System.out.println("                                            Sede Latacunga");
        System.out.println("Asignatura: Programacion [7450]");
        System.out.println("Alumno: Job Nicolas Quishpe Urrutia");
        System.out.println("Docente: Ing. Guerra Cruz Luis Alberto");
        System.out.println("Carrera: Ingeniería Automotriz\n");
        
        System.out.println("El analizador de gases detectó lo siguiente: ");
        hidrocarburo.MostrarTipo();
        hidrocarburo.MostrarCaracteristicasEmision();
        System.out.println("La cantidad total de emisión es: "+hidrocarburo.CalcularEmision()+"%");
        System.out.println();
        
        System.out.println("El analizador de gases detectó lo siguiente: ");
        monoxidocarbono.MostrarTipo();
        monoxidocarbono.MostrarCaracteristicasEmision();
        System.out.println("La cantidad total de emisión es: "+monoxidocarbono.CalcularEmision()+"%");
        System.out.println();     
    }
}
