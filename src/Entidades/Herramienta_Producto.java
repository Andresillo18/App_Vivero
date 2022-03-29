package Entidades;

import java.util.Date;

/**
 * 28-3-22
 *
 * @author Andrés Villalobos
 */
public class Herramienta_Producto extends Inventario {

// <editor-fold desc="ATRIBUTOS" defaultstate="collapsed">    
    private int cod_herramienta_prod;
    private String material;
    private Date fechaVencimiento;
// </editor-fold>

// <editor-fold desc="PROPIEDADES" defaultstate="collapsed">    
    public int getCod_herramienta_prod() {
        return cod_herramienta_prod;
    }

    public void setCod_herramienta_prod(int cod_herramienta_prod) {
        this.cod_herramienta_prod = cod_herramienta_prod;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

// </editor-fold>
    
// <editor-fold desc="CONSTRUCTORES" defaultstate="collapsed">    

    //Vacíos
    public Herramienta_Producto() {
    }

    public Herramienta_Producto(String nombre, String descripcion, float precio, int cantidad_disponible) {
        super(nombre, descripcion, precio, cantidad_disponible);
    }

    // Con parámetros
    public Herramienta_Producto(int cod_herramienta_prod, String material, Date fechaVencimiento) {
        this.cod_herramienta_prod = cod_herramienta_prod;
        this.material = material;
        this.fechaVencimiento = fechaVencimiento;
    }

    public Herramienta_Producto(int cod_herramienta_prod, String material, Date fechaVencimiento, String nombre, String descripcion, float precio, int cantidad_disponible) {
        super(nombre, descripcion, precio, cantidad_disponible);
        this.cod_herramienta_prod = cod_herramienta_prod;
        this.material = material;
        this.fechaVencimiento = fechaVencimiento;
    }        
    
// </editor-fold>   
    
// <editor-fold desc="Métodos" defaultstate="collapsed">
    @Override
    public void Crear() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void Eliminar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void Modificar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

// </editor-fold>
}
