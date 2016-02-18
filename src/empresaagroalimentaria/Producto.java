package empresaagroalimentaria;

/**
 * @author OscarNedzelsky
 */
public class Producto {
    //atributos
    protected int caducidad, lote, existencia;
    protected double precio;
    
    //Constructor
    public Producto(int caducidad, int lote, int existencia, double precio){
        this.caducidad = caducidad;
        this.lote = lote;
        this.existencia = existencia;
        this.precio = precio;
    }
    
    //Métodos
    public int getCaducidad(){
        return this.caducidad;
    }
    
    public int getLote(){
        return this.lote;
    }
    
    public int getExistencia(){
        return this.existencia;
    }
    
    public double getPrecio(){
        return this.precio;
    }
}
