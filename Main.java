package Clase13;

public class Main 
{
    public static void main(String args[])
        {
            Departamento depa = new Departamento("Huanuco");
    
            System.out.println("departamento de: "+depa.getNombres());
           
    
            depa.setDistristo(new Distrito("amarilis", "jose Martinez"));
            System.out.println("nombre del distrito: "+depa.getDistrito().getNombres());
            System.out.println("nombre del alcalde distrital; "+depa.getDistrito().getAlcaldeDistrital());

            depa.setProvincia(new Provincia("Huanuco","Roberto"));
            System.out.println("provincia de: "+depa.getProvincia().getNombres());
            System.out.println("nombre del alcalde: "+depa.getProvincia().getAlcalde());
            
           
        }
        
}
