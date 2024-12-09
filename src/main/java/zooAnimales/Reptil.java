package zooAnimales;

import java.util.ArrayList;

public class Reptil extends Animal {
    private static ArrayList<Reptil> listado;
    public static int iguanas;
    public static int serpientes;
    private String colorEscamas;
    private int largoCola;

    public Reptil(){}

    public Reptil(String nombre,int edad,String habitat,String genero,String colorEscamas,int largoCola){
        this.setNombre(nombre);
        this.setEdad(edad);
        this.setHabitat(habitat);
        this.setGenero(genero);
        this.colorEscamas = colorEscamas;
        this.largoCola = largoCola;
        listado.add(this);
    }

    public static ArrayList<Reptil> getListado(){
        return Reptil.listado;
    }

    public static void setListado(ArrayList<Reptil> listado){
        Reptil.listado = listado;
    }

    public String getColorEscamas(){
        return this.colorEscamas;
    }

    public void setColorEscamas(String colorEscamas){
        this.colorEscamas = colorEscamas;
    }

    public int getLargoCola(){
        return this.largoCola;
    }

    public void setLargoCola(int largoCola){
        this.largoCola = largoCola;
    }

    public static int cantidadReptiles(){
        return listado.size();
    }

    public String movimiento(){
        return "reptar";
    }

    public static Reptil crearIguana(String nombre,int edad,String genero){
        iguanas++;
        return new Reptil(nombre,edad,"humedal",genero,"verde",3);
    }

    public static Reptil crearSerpiente(String nombre,int edad,String genero){
        serpientes++;
        return new Reptil(nombre,edad,"jungla",genero,"blanco",1);
    }
}
