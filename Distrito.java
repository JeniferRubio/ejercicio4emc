package Clase13;

public class Distrito 
{
    private String nombre;
    private String alcaldeDistrital;

    Distrito(String nombre, String alcalde)
{
    setNombre(nombre);
    setAlcaldeDistrital(alcalde);
}
    void setNombre(String nombre)
    {
        this.nombre= nombre;
    }

    String getNombres()
    {
      return nombre;
    }

    void setAlcaldeDistrital(String alcalde)
    {
        alcaldeDistrital=alcalde;
    }
    String getAlcaldeDistrital()
    {
        return alcaldeDistrital;
    }
    
}