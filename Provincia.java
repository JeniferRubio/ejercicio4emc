package Clase13;

public class Provincia 
{
    private String nombre;
    private String alcalde;
    private Distrito distrito;

    Provincia(String nombres,String alcalde)
{
    setNombre(nombres);
    setAlcalde(alcalde);
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
    void setAlcalde(String alcalde)
    {
        this.alcalde=alcalde;
    }
    String getAlcalde()
    {
        return alcalde;
    }

}
