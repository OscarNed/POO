package empresaagroalimentaria;

/**
 * @author OscarNedzelsky
 */
public class EmpresaAgroalimentaria {

    public static void main(String[] args) {
        //Instanciamos un producto de cada tipo
        //caducidad, lote, existencia, precio
        Frescos Manzana = new Frescos(2016, 56, 5, 12.5);
        Refrigerados Queso = new Refrigerados(2016, 80, 8, 40.00);
        Aire Helado = new Aire(2020, 222, 17, 19.99, 18);
        Nitrogeno Frambuesa = new Nitrogeno(2022, 40, 40, 42.5, 15);
        Agua Verdura = new Agua(2020, 58, 23, 22.5, 15);
        
        System.out.println("Esta es la información de los productos:");
        System.out.println("Productos frescos:");
        System.out.println("Manzana:");
        System.out.println("Caducidad: " + Manzana.getCaducidad());
        System.out.println("Lote: " + Manzana.getLote());
        System.out.println("Existencia: " + Manzana.getExistencia());
        System.out.println("Precio: $" + Manzana.getPrecio() + "\n");
        
        System.out.println("Productos refrigerados:");
        System.out.println("Queso: ");
        System.out.println("Caducidad: " + Queso.getCaducidad());
        System.out.println("Lote: " + Queso.getLote());
        System.out.println("Existencia: " + Queso.getExistencia());
        System.out.println("Precio: $" + Queso.getPrecio() + "\n");
        
        System.out.println("Productos congelados:\n");
        System.out.println("Por aire:");
        System.out.println("Helado:");
        System.out.println("Caducidad: " + Helado.getCaducidad());
        System.out.println("Lote: " + Helado.getLote());
        System.out.println("Existencia: " + Helado.getExistencia());
        System.out.println("Precio: $" + Helado.getPrecio());
        System.out.println("Temperatura prefente de congelación: " + Helado.getTemperatura() + "°C\n");
        
        System.out.println("Por agua:");
        System.out.println("Frambuesa:");
        System.out.println("Caducidad: " + Frambuesa.getCaducidad());
        System.out.println("Lote: " + Frambuesa.getLote());
        System.out.println("Existencia: " + Frambuesa.getExistencia());
        System.out.println("Precio: $" + Frambuesa.getExistencia());
        System.out.println("Temperatura preferente de congelación: " + Frambuesa.getTemperatura() + "°C\n");
        
        System.out.println("Por nitrógeno:");
        System.out.println("Verdura:");
        System.out.println("Caducidad: " + Verdura.getCaducidad());
        System.out.println("Lote: " + Verdura.getLote());
        System.out.println("Existencia: " + Verdura.getExistencia());
        System.out.println("Precio: $" + Verdura.getPrecio());
        System.out.println("Temperatura preferente de congelación: " + Verdura.getTemperatura() + "°C");
    }
    
}
