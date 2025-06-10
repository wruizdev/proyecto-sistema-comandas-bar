/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;
import java.io.Serializable;
/**
 *
 * @author willruiz
 */
//Clase creada para almacenar los datos de la tabla comanda y mediante objetos extraer sus datos y generar el XML
//Implementa la interfaz Serializable requerida para la serialización en java. Ya que se crean objetos de esta clase Comanda
public class Comanda implements Serializable {
    //Este campo es importante para la compatibilidad entre versiones durante la deserialización.
    private static final long serialVersionUID = 1L;
    private String codigoComanda;
    private String codigoMesa;
    private String nombrePlato;
    private String cantidadPlato;
    private String categoriaPlato;
    private String fechaComanda;

    public String getCodigoComanda() {
        return codigoComanda;
    }

    public void setCodigoComanda(String codigoComanda) {
        this.codigoComanda = codigoComanda;
    }

    public String getCodigoMesa() {
        return codigoMesa;
    }

    public void setCodigoMesa(String codigoMesa) {
        this.codigoMesa = codigoMesa;
    }

    public String getNombrePlato() {
        return nombrePlato;
    }

    public void setNombrePlato(String nombrePlato) {
        this.nombrePlato = nombrePlato;
    }

    public String getCantidadPlato() {
        return cantidadPlato;
    }

    public void setCantidadPlato(String cantidadPlato) {
        this.cantidadPlato = cantidadPlato;
    }

    public String getCategoriaPlato() {
        return categoriaPlato;
    }

    public void setCategoriaPlato(String categoriaPlato) {
        this.categoriaPlato = categoriaPlato;
    }

    public String getFechaComanda() {
        return fechaComanda;
    }

    public void setFechaComanda(String fechaComanda) {
        this.fechaComanda = fechaComanda;
    }
    
    
}
