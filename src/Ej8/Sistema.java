
package Ej8;
import java.util.ArrayList;

public class Sistema {
    private ArrayList<Peli> listaPelis;
    
    public ArrayList<Peli> getListaPelis(){
        return this.listaPelis;
    }
    
    public void agregoPeli(Peli unaPeli){
        this.listaPelis.add(unaPeli);
    }
    
    public Sistema(){
        listaPelis = new ArrayList<>();
    }
}
