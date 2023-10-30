
package Ej8;

public class Peli {
    private String Titulo;
    private int Duracion;
    
    
    public void setDuracion(int unaDuracion){
        this.Duracion = unaDuracion;
    }
    
    public void setTitulo(String unTitulo){
        this.Titulo = unTitulo;
    }
    
    public String getTitulo(){
        return this.Titulo;
    }
    
    public int getDuracion(){
        return this.Duracion;
    }
    
    public Peli(int unaDuracion, String unTitulo){
        this.setTitulo(unTitulo);
        this.setDuracion(unaDuracion);
    }
    
    @Override
    public String toString(){
        return "Titulo: "+this.getTitulo()+", duración: "+this.getDuracion()+" minutos";
    }
}

