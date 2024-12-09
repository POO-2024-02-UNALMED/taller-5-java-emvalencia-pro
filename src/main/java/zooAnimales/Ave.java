package zooAnimales;

import java.util.ArrayList;

public class Ave extends Animal {
    private static ArrayList<Ave> listado;
    public static int halcones;
    public static int aguilas;
    private String colorPlumas;

    public Ave(){listado.add(this);}

    public Ave(String nombre,int edad,String habitat,String genero,String colorPlumas){
        this.setNombre(nombre);
        this.setEdad(edad);
        this.setHabitat(habitat);
        this.setGenero(genero);
        this.colorPlumas = colorPlumas;
        listado.add(this);
    }

    public static ArrayList<Ave> getListado(){
        return Ave.listado;
    }

    public static void setListado(ArrayList<Ave> listado){
        Ave.listado = listado;
    }

    public String getColorPlumas(){
        return this.colorPlumas;
    }

    public void setColorPlumas(String colorPlumas){
        this.colorPlumas = colorPlumas;
    }

    public static int cantidadAves(){
        return listado.size();
    }

    public String movimiento(){
        return "volar";
    }

    public static Ave crearHalcon(String nombre,int edad,String genero){
        halcones++;
        return new Ave(nombre,edad,"montañas",genero,"café");
    }

    public static Ave crearAguila(String nombre,int edad,String genero){
        aguilas++;
        return new Ave(nombre,edad,"montañas",genero,"blanco y amarillo");
    }
}
