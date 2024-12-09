package gestion;
import java.util.ArrayList;
public class Zoologico {
    private String nombre;
    private String ubicacion;
    private ArrayList<Zona> zonas = new ArrayList<Zona>();

    public Zoologico(){
    }

    public Zoologico(String nombre,String ubicacion){
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getUbicacion(){
        return this.ubicacion;
    }

    public void setUbicacion(String ubicacion){
        this.ubicacion = ubicacion;
    }

    public ArrayList<Zona> getZona(){
        return this.zonas;
    }

    public void setZona(ArrayList<Zona> zonas){
        this.zonas = zonas;
    }

    public void agregarZonas(Zona zona){
        zonas.add(zona);
    }
    
    public int cantidadTotalAnimales(){
        int c=0;
        for(Zona z:zonas){
            c+=z.cantidadAnimales();
        }
        return c;
    }

}
