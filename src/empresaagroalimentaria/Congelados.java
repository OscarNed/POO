package empresaagroalimentaria;

/**
 *
 * @author OscarNedzelsky
 */
public class Congelados extends Producto {
    //Atributos
    private final double temperatura;
    
    public Congelados (int caducidad, int lote, int existencia, double temperatura, double precio){
        super (caducidad, lote, existencia, precio);
        this.temperatura = temperatura;
    }
    
    public double getTemperatura(){
        return this.temperatura;
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
