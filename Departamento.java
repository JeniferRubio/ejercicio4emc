package Clase13;

public class Departamento 
{
    private String nombre;
    private Provincia provincia;
    private Distrito distrito;

    Departamento(String nombre)
{
    setNombre(nombre);
}
    void setNombre(String nombre)
    {
        this.nombre= nombre;
    }

    String getNombres()
    {
      return nombre;
    }

    void setDistristo(Distrito distrito)
    {
        this.distrito=distrito;
    }
    Distrito getDistrito()
    {
        return distrito;
    }
    
    void setProvincia(Provincia provincia)
    {
        this.provincia=provincia;
    }
    Provincia getProvincia()
    {
        return provincia;
    }
    
}
    

