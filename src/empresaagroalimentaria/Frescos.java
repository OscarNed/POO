package empresaagroalimentaria;

/**
 * @author OscarNedzelsky
 */
public class Frescos extends Producto {
    public Frescos (int caducidad, int lote, int existencia, double precio){
        super (caducidad, lote, existencia, precio);
    }
    
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
